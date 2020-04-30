package aiss.model;

import java.util.ArrayList;
import java.util.List;

public class Label {
    private String id;
	private String name;
	private String color;
    private List<Note> notes;

    public Label(String name) {
        this.name = name;
    }

    public Label() {
	}

	public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Note> getNotes() {
        return this.notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public Note getNote(String id) {
		if (notes==null)
			return null;
		
		Note song =null;
		for(Note s: notes)
			if (s.getId().equals(id))
			{
				song=s;
				break;
			}
		
		return song;
	}
	
	public void addNote(Note s) {
		if (notes==null)
			notes = new ArrayList<Note>();
		notes.add(s);
	}
	
	public void deleteNote(Note s) {
		notes.remove(s);
	}
	
	public void deleteNote(String id) {
		Note s = getNote(id);
		if (s!=null)
			notes.remove(s);
	}

}
