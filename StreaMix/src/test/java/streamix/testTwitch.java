package streamix;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import model.resources.GamesTwitchResource;
import model.resources.TwitchSearchResource;
import model.twitch.Games;
import model.twitch.Streams;

public class testTwitch {
	public final GamesTwitchResource gamesTwitch = new GamesTwitchResource();
	public final TwitchSearchResource searchTwitch = new TwitchSearchResource();

	@Test
	public void getGamesTest() {
		Games games = gamesTwitch.getGames();
		
		assertNotNull("The trends are not null", games);
		assertTrue("The list of contacts is empty", games.getData().size() >= 1);
	}

	@Test
	public void getStreamsTest() {
		Streams streams = searchTwitch.getStreams("516575");
		
		assertNotNull("The trends are not null", streams);
		assertTrue("The list of contacts is empty", streams.getData().size() >= 1);
	}
}
