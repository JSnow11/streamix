package streamix;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import org.junit.Test;

import model.resources.ComentsResource;
import model.resources.YTSearchResource;
import model.yt.YtSearch;
import model.yt.comments.Item;

public class testYoutube {
	String accesToken=null;
	public final ComentsResource comentsR = new ComentsResource(accesToken);
	public final ComentsResource coPost = new ComentsResource(accesToken);
	@Test
	public void getVideoTest() throws UnsupportedEncodingException {
		String query="Valorant";
		String queryFormatted = URLEncoder.encode(query, "UTF-8");
		YTSearchResource videosr = new YTSearchResource();
		YtSearch videos = videosr.getVideos(queryFormatted);
		assertNotNull("The videos are not null", videos);
		assertTrue("The list of coments is not empty", videos.getItems().size() >= 1);
	}
	@Test
	public void getCommentsTest() {
		String videoId="yYz_TcxpG2s";
		List<Item> comments = comentsR.getComents(videoId);
		assertNotNull("The trends are not null", comments);
		assertTrue("The list of coments is not empty", comments.size() >= 1);
	}
	
	@Test
	public void postCommentTest() {
		String videoId="yYz_TcxpG2s";
		String content="Hola, este comentario es una prueba";
		Boolean b=coPost.postComents(videoId, content);
		assertTrue("The coment have been post succesfully", b);
	}
}
