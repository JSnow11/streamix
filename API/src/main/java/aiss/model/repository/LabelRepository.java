package aiss.model.repository;

import java.util.Collection;

import aiss.model.Note;
import aiss.model.Label;



public interface LabelRepository {

	public void addNote(Note s);
	public Collection<Note> getAllNotes();
	public Note getNote(String NoteId);
	public void updateNote(Note s);
	public void deleteNote(String NoteId);
	
	// Labels
	public void addLabel(Label p);
	public Collection<Label> getAllLabels();
	public Label getLabel(String LabelId);
	public void updateLabel(Label p);
	public void deleteLabel(String LabelId);
	public Collection<Note> getAll(String LabelId);
	public void addNote(String LabelId, String NoteId);
	public void removeNote(String LabelId, String NoteId);

}
