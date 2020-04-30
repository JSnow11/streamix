package model.resources;

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import model.twitch.Games;
import utility.Tools;

public class GamesTwitchResource {
	public static final String clientID = "nafycue8z9e8v8z4ntwkw2pham4nem";
	public static final Logger log = Logger.getLogger(GamesTwitchResource.class.getName());
		
	public Games getGames() throws UnsupportedEncodingException {
	String uri = "https://api.twitch.tv/helix/games/top";
		
		log.log(Level.WARNING, "Games Streams URI: "+uri);
		
		ClientResource cr = new ClientResource(uri);
		Tools.addHeader(cr, "Client-ID", clientID);
		Games l = cr.get(Games.class);
			
		return l;
	}

}
