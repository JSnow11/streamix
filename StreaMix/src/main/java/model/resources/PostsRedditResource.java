package model.resources;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import model.Reddit.Child;
import model.Reddit.RedditPosts;
import model.Reddit.RedditSearch;
import utility.Tools;

public class PostsRedditResource {
	public static final Logger log = Logger.getLogger(PostsRedditResource.class.getName());
	
	private RedditSearch getSubreddits(String queryFormatted) throws ResourceException, IOException {
		String uri = "https://www.reddit.com/subreddits/search.json?q="+queryFormatted+"&limit=5";

		log.log(Level.INFO, "reddit URI: "+uri);
		
		ClientResource cr = new ClientResource(uri);

		log.log(Level.WARNING, cr.get().getText());
		
	    RedditSearch ssrr = cr.get(RedditSearch.class);
		return ssrr;
	}
	
	public List<String> getPosts(String query) throws ResourceException, IOException {
		String queryFormatted = URLEncoder.encode(query, "UTF-8");
		RedditSearch ssrr = getSubreddits(queryFormatted);
		
		List<String> lhtml = new ArrayList<>();
		for(Child ch : ssrr.getData().getChildren()) {
			if(ch.getData().getpr
			String subredditFormated = URLEncoder.encode(ch.getData().getDisplayName(), "UTF-8");
			String uri = "https://www.reddit.com/r/"+subredditFormated+"/new.json?sort=new&limit=2";
			log.log(Level.INFO, "Reddit posts URI: "+uri);
		
			ClientResource cr = new ClientResource(uri);
			RedditPosts rp = cr.get(RedditPosts.class);
			
			for(Child ch2 : rp.getData().getChildren()) {
				String uri2 = "https://www.reddit.com/oembed?url=https://www.reddit.com/r/Showerthoughts/comments/2safxv/we_should_start_keeping_giraffes_a_secret_from/cno7zic/";
				ClientResource cr2 = new ClientResource(uri2);
				lhtml.add(Tools.parseHtml(cr2.get().getText()));
				System.out.println(Tools.parseHtml(cr2.get().getText()));
			}
			
		}

	    log.log(Level.WARNING, lhtml.toString());
		return lhtml;
	}
}
