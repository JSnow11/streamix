package aiss.api.resources.comparators;

import java.util.Comparator;

import aiss.model.Playlist;
import aiss.model.Song;

public class ComparatorArtistSong implements Comparator<Song> {

	@Override
	public int compare(Song s1, Song s2) {
		return s1.getArtist().compareTo(s2.getArtist());
	}

}
