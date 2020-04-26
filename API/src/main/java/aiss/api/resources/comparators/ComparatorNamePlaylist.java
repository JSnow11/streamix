package aiss.api.resources.comparators;

import java.util.Comparator;

import aiss.model.Playlist;

public class ComparatorNamePlaylist implements Comparator<Playlist> {

	@Override
	public int compare(Playlist p1, Playlist p2) {
		return p1.getName().compareTo(p2.getName());
	}

}
