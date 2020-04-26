package aiss.api.resources.comparators;

import java.util.Comparator;

import aiss.model.Playlist;
import aiss.model.Song;

public class ComparatorArtistSongReversed implements Comparator<Song> {

	@Override
	public int compare(Song s1, Song s2) {
		return s2.getArtist().compareTo(s1.getArtist());
	}

}
