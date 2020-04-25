package model.resources;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import model.Reddit.RedditSearch;

public class SubSearchRedditResource {
	public static final Logger log = Logger.getLogger(SubSearchRedditResource.class.getName());
	
	public RedditSearch getSubreddits(String query) throws ResourceException, IOException {
		String queryFormatted = URLEncoder.encode(query, "UTF-8");
		String uri = "https://www.reddit.com/subreddits/search.json?q="+queryFormatted+"&limit=2";

		log.log(Level.INFO, "twitchSearch URI: "+uri);
		
		ClientResource cr = new ClientResource(uri);

	    log.log(Level.WARNING, cr.get().getText());
	    RedditSearch ssrr = cr.get(RedditSearch.class);
		return ssrr;
	}
}
