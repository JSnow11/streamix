package streamix;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import model.reddit.subreddits.Subreddits;
import model.resources.GamesTwitchResource;
import model.resources.PostsRedditResource;
import model.resources.TwitchSearchResource;
import model.twitch.Games;
import model.twitch.Streams;

public class testReddit {
	public final PostsRedditResource redditResource = new PostsRedditResource();

	@Test
	public void getSubredditsTest() {
		Subreddits sub = redditResource.getSubreddits("test");

		assertNotNull("The trends are not null", sub);
		assertTrue("The list of subreddits is not empty", sub.getData().getChildren().size() >= 1);
	}

	@Test
	public void getStreamsTest() {
		List<String> posts = redditResource.getPosts("test");

		assertNotNull("The trends are not null", posts);
		assertTrue("The list of posts is not empty", posts.size() >= 1);
	}
}
