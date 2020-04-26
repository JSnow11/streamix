package aiss.api.resources.comparators;

import java.util.Comparator;

import aiss.model.Playlist;

public class ComparatorNamePlaylistReversed implements Comparator<Playlist> {

	@Override
	public int compare(Playlist p1, Playlist p2) {
		return p2.getName().compareTo(p1.getName());
	}

}
