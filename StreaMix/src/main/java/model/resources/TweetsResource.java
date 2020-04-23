package model.resources;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import model.twitter.TweetList;

public class TweetsResource {
	public static final String bearerToken = "AAAAAAAAAAAAAAAAAAAAAFGTDgEAAAAAEZoGu1eukF9DG%2Fd1iNeDCfHMvWU%3DPR3zJLzXYZ7TgjyWbsRe1qgdntSe1QSGFmKvck1yc6IeUCn18L";
	public static final Logger log = Logger.getLogger(TrendsResource.class.getName());
	
	public TweetList getTweets(String query) throws ResourceException, IOException {
		String queryFormatted = URLEncoder.encode(query, "UTF-8");
		String uri = "https://api.twitter.com/1.1/search/tweets.json?q="+queryFormatted+"&count=2";
		log.log(Level.INFO, "tweets URI: "+uri);
		
		ClientResource cr = new ClientResource(uri);
		ChallengeResponse chr = new ChallengeResponse(ChallengeScheme.HTTP_OAUTH_BEARER);
		chr.setRawValue(bearerToken);
		cr.setChallengeResponse(chr);

		log.log(Level.WARNING, cr.get().getText());
		TweetList t = cr.get(TweetList.class);
		return t;
	}
}
