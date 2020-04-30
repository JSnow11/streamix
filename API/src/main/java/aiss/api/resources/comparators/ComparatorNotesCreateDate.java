package aiss.api.resources.comparators;

import java.util.Comparator;

import aiss.model.Note;
import aiss.model.Playlist;
import aiss.model.Song;

public class ComparatorNotesCreateDate implements Comparator<Note> {

	@Override
	public int compare(Note n1, Note n2) {
		return n1.getCreatedDate().compareTo(n2.getCreatedDate());
	}

}
