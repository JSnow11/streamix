package model.resources;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import model.reddit.subreddits.Child;
import model.reddit.REmbeed;
import model.reddit.posts.Posts;
import model.reddit.subreddits.Subreddits;

public class PostsRedditResource {
	public static final Logger log = Logger.getLogger(PostsRedditResource.class.getName());

	private Subreddits getSubreddits(String queryFormatted) throws IOException {
		String uri = "https://www.reddit.com/subreddits/search.json?q=" + queryFormatted + "&limit=2";

		log.log(Level.INFO, "SUBREDDITS URI: " + uri);

		ClientResource cr = new ClientResource(uri);
		Subreddits ssrr = cr.get(Subreddits.class);
		return ssrr;
	}

	public List<String> getPosts(String query) throws IOException {
		String queryFormatted = URLEncoder.encode(query, "UTF-8");
		Subreddits ssrr = getSubreddits(queryFormatted);

		List<String> lhtml = new ArrayList<>();
		for (Child ch : ssrr.getData().getChildren()) {
			if (ch.getData().getSubredditType().equals("public")) {
				String subredditFormated = URLEncoder.encode(ch.getData().getDisplayName(), "UTF-8");
				String uri = "https://www.reddit.com/r/" + subredditFormated + "/new.json?sort=new&limit=5";

				log.log(Level.INFO, "REDDIT POSTS URI: " + uri);
				ClientResource cr = new ClientResource(uri);
				try {
					Posts rp = cr.get(Posts.class);
					for (model.reddit.posts.Child ch2 : rp.getData().getChildren()) {
						String uri2 = "https://www.reddit.com/oembed?url=" + ch2.getData().getUrl();

						log.log(Level.INFO, "REDDIT EMBEED URI: " + uri2);

						if (uri2.contains("url=https://www.reddit.com/r/")) {
							System.out.println(uri2);
							ClientResource cr2 = new ClientResource(uri2);
							REmbeed re = cr2.get(REmbeed.class);
							if (re != null)
								lhtml.add(re.getHtml());
						}
					}
				}catch(ResourceException re) {
					
				}
				

			}

		}
		System.out.println(lhtml);
		return lhtml;
	}
}
