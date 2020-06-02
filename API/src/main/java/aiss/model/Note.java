package aiss.model;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class Note {

    private String id;
    private String title;
    private String note;
	private String color;
    private String createdDate;
    private String lastModified;
    private List<Note> links;

    public Note(String id, String title, String note, List<Note> links) {
        this.id = id;
        this.title = title;
        this.note = note;
        this.links = links;
        this.createdDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy -  HH:mm"));
        this.lastModified = createdDate;
    }

    public static Note subNote(Note parent){
        Note n = new Note();
        parent.addLink(n);
        return n;
    }

    public Note() {
        this.createdDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy -  HH:mm"));
        this.lastModified = createdDate;
        this.color = "default";
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
    
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void cleanColor() {
		this.color = "default";
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

    public String getCreatedDate() {
        return createdDate;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified() {
        this.lastModified = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy -  HH:mm"));
    }
}