package streamix;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.junit.Test;
import org.restlet.resource.ResourceException;
import model.resources.GamesTwitchResource;
import model.resources.TwitchSearchResource;
import model.twitch.Games;
import model.twitch.Streams;

public class testTwitch {
	public final GamesTwitchResource gamesTiwch = new GamesTwitchResource();
	public final TwitchSearchResource searchTiwch = new TwitchSearchResource();

	@Test
	public void getGamesTest() throws UnsupportedEncodingException {
		Games games = gamesTiwch.getGames();
		
		assertNotNull("The trends are not null", games);
		assertTrue("The list of contacts is empty", games.getData().size() >= 1);
	}

	@Test
	public void getStreamsTest() throws ResourceException, IOException {
		Streams streams = searchTiwch.getStreams("516575");
		
		assertNotNull("The trends are not null", streams);
		assertTrue("The list of contacts is empty", streams.getData().size() >= 1);
	}
}
