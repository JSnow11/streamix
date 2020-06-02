package model.resources;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import model.twitter.Embeed;

public class TweetsResource {
	public static final String bearerToken = "AAAAAAAAAAAAAAAAAAAAAFGTDgEAAAAAEZoGu1eukF9DG%2Fd1iNeDCfHMvWU%3DPR3zJLzXYZ7TgjyWbsRe1qgdntSe1QSGFmKvck1yc6IeUCn18L";
	public static final Logger log = Logger.getLogger(TweetsResource.class.getName());

	public List<String> getTweets(String query) {
		log.log(Level.INFO, "Buscando tweets, query: " + query);
		String queryFormatted = query;
		try {
			queryFormatted = URLEncoder.encode(query, "UTF-8");
		} catch (IOException ioe) {
			log.log(Level.WARNING, "No se ha podido codificar la query");
		}

		String uri = "https://api.twitter.com/1.1/search/tweets.json?q=" + queryFormatted + "&count=5";

		ClientResource cr = new ClientResource(uri);
		ChallengeResponse chr = new ChallengeResponse(ChallengeScheme.HTTP_OAUTH_BEARER);
		chr.setRawValue(bearerToken);
		cr.setChallengeResponse(chr);

		String st = null;
		try {
			st = cr.get(String.class);
			log.log(Level.INFO, "Tweets obtenidos");
		} catch (ResourceException re) {
			log.log(Level.WARNING, "No se han podido obtener tweets");
		}

		List<String> t = parse(st);
		log.log(Level.INFO, "Tweets parseados");
		t = getHtml(t);
		log.log(Level.INFO, "HTML de tweets obtenido");
		return t;
	}

	private static List<String> parse(String st) {
		List<String> lu = new ArrayList<>();
		Boolean b = true;
		String id = "";
		for (String trd : st.split("[{},]")) {
			if (!trd.contains("statuses") && !trd.contains("sidebar")) {
				if (trd.contains("\"id\"") && b) {
					id = trd.split(":")[1].trim();
					lu.add(id);
					b = false;
				}
				if (trd.contains("\"created_at\"")) {
					b = true;
				}

			}
		}
		return lu;
	}

	private static List<String> getHtml(List<String> ls) {
		List<String> lhtml = new ArrayList<>();
		for (String s : ls) {
			if (s.matches("[0-9]{19}")) {
				String uri = "https://publish.twitter.com/oembed?url=https://twitter.com/user/status/" + s;
				log.log(Level.WARNING, uri);
				ClientResource cr = new ClientResource(uri);

				Embeed e = null;
				try {
					e = cr.get(Embeed.class);
				} catch (ResourceException re) {
					log.log(Level.WARNING, "No se ha podido obtener el html de un tweet");
				}
				if (e != null)
					lhtml.add(e.getHtml());
			}
		}
		return lhtml;
	}
}
