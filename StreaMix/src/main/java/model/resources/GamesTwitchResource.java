package model.resources;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import model.twitch.Datum;
import model.twitch.Games;
import utility.Tools;

public class GamesTwitchResource {
	public static final String clientID = "nafycue8z9e8v8z4ntwkw2pham4nem";
	public static final String bearerToken = "5o47f1w8vqw80c8wxoli38qz9hy6s6";
	public static final Logger log = Logger.getLogger(GamesTwitchResource.class.getName());
	public static final String uri = "https://api.twitch.tv/helix/games/top";
	public static Games games = new Games();
	private static final Map<String, String> usual = new HashMap<String, String>() {
		private static final long serialVersionUID = -70447858632348945L;
		{
			put("lol", "21779");
			put("gta", "32982");
			put("gtav", "32982");
			put("gta5", "32982");
			put("wow", "18122");
			put("cs", "32399");
			put("csgo", "32399");
		}
	};

	public Games getGames() {
		log.log(Level.WARNING, "Getting trending games: " + uri);

		ClientResource cr = new ClientResource(uri);
		Tools.addHeader(cr, "Client-ID", clientID);
		ChallengeResponse chr = new ChallengeResponse(ChallengeScheme.HTTP_OAUTH_BEARER);

		chr.setRawValue(bearerToken);
		cr.setChallengeResponse(chr);

		try {
			games = cr.get(Games.class);
			log.log(Level.INFO, "Games recibidos");
			return games;
		} catch (ResourceException re) {
			re.getStackTrace();
			games = null;
			log.log(Level.WARNING, "Games no encontrados");
			return games;
		}
	}

	public static String getGameID(String query) {
		log.log(Level.INFO, "GameID solicitado");
		String gameId = "";

		if (games.getData() == null) {
			ClientResource cr = new ClientResource(uri);
			Tools.addHeader(cr, "Client-ID", clientID);
			ChallengeResponse chr = new ChallengeResponse(ChallengeScheme.HTTP_OAUTH_BEARER);

			chr.setRawValue(bearerToken);
			cr.setChallengeResponse(chr);
			games = cr.get(Games.class);
		}

		if (usual.containsKey(query)) {
			gameId = usual.get(query);
		} else {
			for (Datum game : games.getData()) {
				Boolean b = false;
				for (String s : query.split(" ")) {
					if ((game.getName().toLowerCase().contains(s.toLowerCase()))) {
						gameId = game.getId();
						b = true;
						System.out.println(b);
						break;
					}
				}
				if (b)
					break;
			}
		}
		log.log(Level.INFO, "GameID obtenido");
		return gameId;
	}
}
