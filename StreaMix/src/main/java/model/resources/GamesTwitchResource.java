package model.resources;

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import model.twitch.Games;
import utility.Tools;

public class GamesTwitchResource {
	public static final String clientID = "nafycue8z9e8v8z4ntwkw2pham4nem";
	public static final String bearerToken = "5o47f1w8vqw80c8wxoli38qz9hy6s6";
	public static final Logger log = Logger.getLogger(GamesTwitchResource.class.getName());
	public static Games games = new Games();

	public Games getGames() throws UnsupportedEncodingException {
		String uri = "https://api.twitch.tv/helix/games/top";

		log.log(Level.WARNING, "Games Streams URI: " + uri);

		ClientResource cr = new ClientResource(uri);
		Tools.addHeader(cr, "Client-ID", clientID);
		ChallengeResponse chr = new ChallengeResponse(ChallengeScheme.HTTP_OAUTH_BEARER);

		chr.setRawValue(bearerToken);
		cr.setChallengeResponse(chr);
		try {
			games = cr.get(Games.class);
			return games;
		}
		catch(ResourceException re){
			re.getStackTrace();
			games=null;
			return games;
		}
		

		
	}

	public static Games getGamesStatic() {
		String uri = "https://api.twitch.tv/helix/games/top";

		log.log(Level.WARNING, "Games Streams URI: " + uri);

		ClientResource cr = new ClientResource(uri);
		Tools.addHeader(cr, "Client-ID", clientID);
		ChallengeResponse chr = new ChallengeResponse(ChallengeScheme.HTTP_OAUTH_BEARER);

		chr.setRawValue(bearerToken);
		cr.setChallengeResponse(chr);

		try {
			games = cr.get(Games.class);
			return games;
		}
		catch(ResourceException re){
			re.getStackTrace();
			games=null;
			return games;
		}

		
	}
}
