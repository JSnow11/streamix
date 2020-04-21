package model.resources;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import model.twitter.Trending;

public class TrendsResource {
	public static final String bearerToken = "AAAAAAAAAAAAAAAAAAAAAFGTDgEAAAAAEZoGu1eukF9DG%2Fd1iNeDCfHMvWU%3DPR3zJLzXYZ7TgjyWbsRe1qgdntSe1QSGFmKvck1yc6IeUCn18L";
	public static final String locationID = "1";
	public static final Logger log = Logger.getLogger(TrendsResource.class.getName());
	
	public Trending getTrends() throws ResourceException, IOException {
		String uri = "https://api.twitter.com/1.1/trends/place.json?id="+locationID+"&limit=5";
		log.log(Level.INFO, "trends URI: "+uri);
		
		ClientResource cr = new ClientResource(uri);
		ChallengeResponse chr = new ChallengeResponse(ChallengeScheme.HTTP_OAUTH_BEARER);
		chr.setRawValue(bearerToken);
		cr.setChallengeResponse(chr);

		log.log(Level.WARNING, cr.get().getText());
		Trending t = cr.get(Trending.class);
		return t;
	}
}
