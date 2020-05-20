package model.resources;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import model.yt.YtSearch;

public class YTSearchResource {
	public static final String apiKey = "AIzaSyAyYc09Pm_U_PLG5wu-rmLGsp-NZj5Kq8k";
	public static final Logger log = Logger.getLogger(YTSearchResource.class.getName());

	public YtSearch getVideos(String query) throws UnsupportedEncodingException {
		
			String queryFormatted = URLEncoder.encode(query, "UTF-8");
			String uri = "https://www.googleapis.com/youtube/v3/search?key=" + apiKey + "&part=snippet&maxResults=20&q="
					+ queryFormatted;

			log.log(Level.WARNING, "ytsearch URI: " + uri);
		
			ClientResource cr = new ClientResource(uri);
		try {
			YtSearch yts = cr.get(YtSearch.class);

			return yts;
		}
		catch(ResourceException e) {
			e.getStackTrace();
			return null;
		}
		
	}
}
