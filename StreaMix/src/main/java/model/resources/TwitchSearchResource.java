package model.resources;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import model.twitch.Streams;
import utility.Tools;

public class TwitchSearchResource {
	public static final String clientID = "nafycue8z9e8v8z4ntwkw2pham4nem";
	public static final String bearerToken = "5o47f1w8vqw80c8wxoli38qz9hy6s6";
	public static final Logger log = Logger.getLogger(TwitchSearchResource.class.getName());

	public Streams getStreams(String gameId) throws ResourceException, IOException {
		String gameIdFormatted = URLEncoder.encode(gameId, "UTF-8");
		String uri = "https://api.twitch.tv/helix/streams?game_id=" + gameIdFormatted;

		log.log(Level.INFO, "twitchSearch URI: " + uri);

		ClientResource cr = new ClientResource(uri);
		Tools.addHeader(cr, "Client-ID", clientID);
		ChallengeResponse chr = new ChallengeResponse(ChallengeScheme.HTTP_OAUTH_BEARER);

		chr.setRawValue(bearerToken);
		cr.setChallengeResponse(chr);
		
		try {
			Streams twS = cr.get(Streams.class);
			return twS;
		}
		
		catch(ResourceException re){
			re.getStackTrace();
			return null;
		}
		
	}
}