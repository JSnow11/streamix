package aiss.api.resources.comparators;

import java.util.Comparator;

import aiss.model.Note;

public class ComparatorNotesColorReversed implements Comparator<Note> {

	@Override
	public int compare(Note n1, Note n2) {
		return n2.getColor().compareTo(n1.getColor());
	}

}
