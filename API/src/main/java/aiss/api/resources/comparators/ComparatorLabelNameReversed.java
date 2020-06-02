package aiss.api.resources.comparators;

import java.util.Comparator;

import aiss.model.Label;
import aiss.model.Note;


public class ComparatorLabelNameReversed implements Comparator<Label> {

	@Override
	public int compare(Label n1, Label n2) {
		return n2.getName().compareTo(n1.getName());
	}

}
