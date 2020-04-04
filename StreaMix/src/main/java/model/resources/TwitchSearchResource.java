package model.resources;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.engine.header.HeaderConstants;
import org.restlet.Request;
import org.restlet.data.Header;
import org.restlet.resource.ClientResource;
import org.restlet.util.Series;

import model.twitch.TwitchSearch;


public class TwitchSearchResource {
	public static final String clientID = "nafycue8z9e8v8z4ntwkw2pham4nem";
	public static final Logger log = Logger.getLogger(TwitchSearchResource.class.getName());
	
	public TwitchSearch getStreams(String query) throws UnsupportedEncodingException {
		String queryFormatted = URLEncoder.encode(query, "UTF-8");
		String uri = "https://api.twitch.tv/kraken/search/streams?query=" + queryFormatted;
		
		log.log(Level.INFO, "twitchSearch URI: "+uri);
		
		ClientResource cr = new ClientResource(uri);
		Request req = cr.getRequest();
		
		Series<Header> headerValue = new Series<Header>(Header.class);
	    req.getAttributes().put(HeaderConstants.ATTRIBUTE_HEADERS, headerValue);
	    headerValue.add("Client-ID", clientID);
	    
	    log.log(Level.INFO, "Header añadido");
	    
	    TwitchSearch twS = cr.get(TwitchSearch.class);
		return twS;
	}
}