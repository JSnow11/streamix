package streamix;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import model.resources.TrendsResource;
import model.resources.TweetsResource;
import model.twitter.Trending;

public class testTwitter {

	public final TweetsResource tweetsR = new TweetsResource();
	public final TrendsResource trendsR = new TrendsResource();

	@Test
	public void getTrendsTest() {
		Trending trends = trendsR.getTrends();
		
		assertNotNull("The trends are not null", trends);
		assertTrue("The list of contacts is empty", trends.getTrends().size() >= 1);
	}

	@Test
	public void getTweetsTest() {
		List<String> tweets = tweetsR.getTweets("test");
		
		assertNotNull("The trends are not null", tweets);
		assertTrue("The list of contacts is empty", tweets.size() >= 1);
	}
}
