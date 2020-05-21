package model.resources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.data.MediaType;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import model.yt.comments.Item;
import model.yt.comments.Snippet;
import model.yt.comments.Snippet2;
import model.yt.comments.TopLevelComment;
import model.yt.comments.YoutubeComents;
import utility.Tools;

public class ComentsResource {
	private static final Logger log = Logger.getLogger(ComentsResource.class.getName());
	public static final String apiKey = "AIzaSyC7Re8HZ04TuYF-0pH3Q_oK6lO_uCUfWkA";
	private final String access_token;
	private final String uri = "https://www.googleapis.com/youtube/v3/commentThreads";

	public ComentsResource(String access_token) {
		this.access_token = access_token;
	}

	public List<Item> getComents(String videoid) {
		try {
			ClientResource cr = new ClientResource(
					uri + "?part=snippet&maxResults=20&videoId=" + videoid + "&key=" + apiKey);
			YoutubeComents coments = cr.get(YoutubeComents.class);
			log.log(Level.INFO, "comentarios solicitados");
			return coments.getItems();
		}
		catch(ResourceException e) {
			e.printStackTrace();
			return null;
		}
		
	}

	public Boolean postComents(String videoid, String comment) {
		try {
			log.log(Level.INFO, "Intentando postear el comentario: "+comment + ", videoID=" + videoid);
			ClientResource cr = new ClientResource(uri + "?access_token=" + access_token + "&part=snippet");
			
			YoutubeComents yc = new YoutubeComents();
			Item newcomment = new Item();
			Snippet sn = new Snippet();
			TopLevelComment tlc = new TopLevelComment();
			Snippet2 sn2 = new Snippet2();
			
			sn2.setTextOriginal(comment);
			sn2.setVideoId(videoid);
			tlc.setSnippet(sn2);
			
			sn.setVideoId(videoid);
			sn.setTopLevelComment(tlc);
			newcomment.setSnippet(sn);
			List<Item> ls = new ArrayList<Item>();
			ls.add(newcomment);
			yc.setItems(ls);
			
			log.log(Level.INFO, "COMMENT SETEADO");
			log.log(Level.INFO, comment + ", " + videoid);
			cr.post(newcomment, Item.class);
			cr.put(newcomment);
			return true;
		}
		catch(ResourceException e) {
			log.log(Level.WARNING, "Error al postear el comentario, \n uri = "+ uri + "?access_token=" + access_token + "&part=snippet");
			System.out.println(e);
			return false;
		}
		
	}

}
