package model.resources;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import model.twitch.TwitchSearch;


public class TwitchSearchResource {
	public static final String apiKey = "vmyhjn4lvbiyfe1u4rn12km8jyx6qn";
	public static final Logger log = Logger.getLogger(TwitchSearchResource.class.getName());
	
	public TwitchSearch getStreams(String query) throws UnsupportedEncodingException {
		String queryFormatted = URLEncoder.encode(query, "UTF-8");
		String uri = "https://api.twitch.tv/kraken/search/streams?query=" + queryFormatted;
		
		log.log(Level.WARNING, "twitchSearch URI: "+uri);
		
		ClientResource cr = new ClientResource(uri);
		TwitchSearch twS = cr.get(TwitchSearch.class);
		
		return twS;
	}
}