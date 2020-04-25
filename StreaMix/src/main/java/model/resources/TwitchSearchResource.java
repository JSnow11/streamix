package model.resources;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.engine.header.HeaderConstants;
import org.restlet.data.Header;
import org.restlet.data.MediaType;
import org.restlet.data.Metadata;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;
import org.restlet.util.Series;

import model.twitch.TwitchSearch;
import utility.Tools;


public class TwitchSearchResource {
	public static final String clientID = "nafycue8z9e8v8z4ntwkw2pham4nem";
	public static final Logger log = Logger.getLogger(TwitchSearchResource.class.getName());
	
	public TwitchSearch getStreams(String query) throws ResourceException, IOException {
		String queryFormatted = URLEncoder.encode(query, "UTF-8");
		String uri = "https://api.twitch.tv/kraken/search/streams?q=" + queryFormatted + "&limit=5";

		log.log(Level.INFO, "twitchSearch URI: "+uri);
		
		ClientResource cr = new ClientResource(uri);
		//MediaType tmt = new MediaType("application/vnd.twitchtv.v5+json", "twitch media type");
		cr.accept(MediaType.valueOf("application/vnd.twitchtv.v5+json"));
		Tools.addHeader(cr,"Client-ID", clientID);
	    
	    log.log(Level.WARNING, "Header añadido");
	    log.log(Level.WARNING, cr.getRequest().toString());
	    
	    log.log(Level.WARNING, cr.get().getText());
	    TwitchSearch twS = cr.get(TwitchSearch.class);
		return twS;
	}
}