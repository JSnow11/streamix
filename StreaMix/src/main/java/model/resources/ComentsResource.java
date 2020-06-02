package model.resources;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import model.yt.comments.Item;
import model.yt.comments.Snippet;
import model.yt.comments.Snippet2;
import model.yt.comments.TopLevelComment;
import model.yt.comments.YoutubeComents;

public class ComentsResource {
	private static final Logger log = Logger.getLogger(ComentsResource.class.getName());
	public static final String apiKey = "AIzaSyC7Re8HZ04TuYF-0pH3Q_oK6lO_uCUfWkA";
	private final String access_token;
	private final String uri = "https://www.googleapis.com/youtube/v3/commentThreads";

	public ComentsResource(String access_token) {
		this.access_token = access_token;
	}

	public List<Item> getComents(String videoid) {
		ClientResource cr = new ClientResource(
				uri + "?part=snippet&maxResults=20&videoId=" + videoid + "&key=" + apiKey);
		try {
			YoutubeComents coments = cr.get(YoutubeComents.class);
			log.log(Level.INFO, "comentarios solicitados");
			return coments.getItems();
		} catch (ResourceException e) {
			log.log(Level.WARNING, "El video no tiene los comentarios habilitados");
			return null;
		}

	}

	public Boolean postComents(String videoid, String comment) {
		try {
			log.log(Level.INFO, "Intentando postear el comentario: " + comment + ", videoID=" + videoid);
			ClientResource cr = new ClientResource(uri + "?access_token=" + access_token + "&part=snippet");

			Item newcomment = new Item();
			Snippet sn = new Snippet();
			TopLevelComment tlc = new TopLevelComment();
			Snippet2 sn2 = new Snippet2();

			sn2.setTextOriginal(comment);
			tlc.setSnippet(sn2);
			sn.setVideoId(videoid);
			sn.setTopLevelComment(tlc);
			newcomment.setSnippet(sn);

			log.log(Level.INFO, "COMMENT SETEADO" + comment + ", " + videoid);
			@SuppressWarnings("unused")
			YoutubeComents x = cr.post(newcomment, YoutubeComents.class);
			cr.put(newcomment);
			log.log(Level.INFO, "Comment enviado");
			return true;

		} catch (ResourceException e) {
			log.log(Level.WARNING, "Error al postear el comentario, \n uri = " + uri + "?access_token=" + access_token
					+ "&part=snippet");
			System.out.println(e);
			return false;
		}

	}

}
