package aiss.api.resources.comparators;

import java.util.Comparator;

import aiss.model.Note;

public class ComparatorNotesLastModifiedReversed implements Comparator<Note> {

	@Override
	public int compare(Note n1, Note n2) {
		return n1.getLastModified().compareTo(n2.getLastModified());
	}

}
