package model.resources;

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import model.twitch.Live;
import utility.Tools;

public class LiveTwitchResource {
	public static final String clientID = "nafycue8z9e8v8z4ntwkw2pham4nem";
	public static final Logger log = Logger.getLogger(LiveTwitchResource.class.getName());
		
	public Live getStreams() throws UnsupportedEncodingException {
		String uri = "https://api.twitch.tv/kraken/streams";
		
		log.log(Level.WARNING, "Live Streams URI: "+uri);
		
		ClientResource cr = new ClientResource(uri);
		Tools.addHeader(cr, "Client-ID", clientID);
		Live l = cr.get(Live.class);
			
		return l;
	}

}
