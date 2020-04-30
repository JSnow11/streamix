package aiss.model;

import java.util.ArrayList;
import java.util.List;

import com.google.appengine.repackaged.org.joda.time.LocalDate;

public class Note {

    private String id;
    private String title;
    private String note;
    private List<Note> links;
    private LocalDate createdDate;
    private LocalDate lastModified;

    public Note(String id, String title, String note, List<Note> links) {
        this.id = id;
        this.title = title;
        this.note = note;
        this.links = links;
        this.createdDate = LocalDate.now();
        this.lastModified = createdDate;
    }

    public static Note subNote(Note parent){
        Note n = new Note();
        parent.addLink(n);
        return n;
    }

    public Note() {
        this.createdDate = LocalDate.now();
        this.lastModified = createdDate;
        this.links = new ArrayList<Note>();
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<Note> getLinks() {
        return links;
    }

    public void cleanLinks() {
        this.links = new ArrayList<Note>();
    }

    public void addLink(Note link) {
        this.links.add(link);
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getLastModified() {
        return lastModified;
    }

    public void setLastModified() {
        this.lastModified = LocalDate.now();
    }
}