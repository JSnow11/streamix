package model.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import model.twitter.Trend;
import model.twitter.Trending;
import utility.Tools;

public class TrendsResource {
	public static final String bearerToken = "AAAAAAAAAAAAAAAAAAAAAFGTDgEAAAAAEZoGu1eukF9DG%2Fd1iNeDCfHMvWU%3DPR3zJLzXYZ7TgjyWbsRe1qgdntSe1QSGFmKvck1yc6IeUCn18L";
	public static final String locationID = "774508";
	public static final Logger log = Logger.getLogger(TrendsResource.class.getName());

	public Trending getTrends() {
		log.log(Level.INFO, "Buscando tendencias de Twitter");
		String uri = "https://api.twitter.com/1.1/trends/place.json?id=" + locationID + "&count=5";

		ClientResource cr = new ClientResource(uri);
		ChallengeResponse chr = new ChallengeResponse(ChallengeScheme.HTTP_OAUTH_BEARER);

		chr.setRawValue(bearerToken);
		cr.setChallengeResponse(chr);
		String st = null;
		try {
			st = cr.get(String.class);
			log.log(Level.INFO, "Trends obtenidas");
		} catch (ResourceException re) {
			log.log(Level.INFO, "Trends no encontradas");
			st = "null";
		}

		Trending t = parse(st);
		log.log(Level.WARNING, "Trends parseadas");
		return t;
	}

	private Trending parse(String st) {
		List<Trend> lt = new ArrayList<Trend>();
		String name = "";
		Integer volume = 0;
		for (String trd : st.split("[{},]")) {
			if (!trd.contains("trends")) {
				if (trd.contains("name")) {
					name = trd.split(":")[1].trim();
					name = name.substring(1, name.length() - 1);
					name = Tools.decode(name);
				}
				if (trd.contains("tweet_volume")) {
					String pv = trd.split(":")[1].trim();
					volume = Integer.parseInt(pv.contains("null") ? "0" : pv);
					lt.add(Trend.of(name, volume));
				}
			}
		}
		return Trending.of(lt);
	}

}
