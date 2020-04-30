package aiss.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.w3c.dom.ls.LSOutput;

import aiss.model.Label;
import aiss.model.Note;


public class MapLabelRepository implements LabelRepository{

	Map<String, Label> LabelMap;
	Map<String, Note> NoteMap;
	private static MapLabelRepository instance=null;
	private int index=0;			// Index to create Labels and Notes identifiers.
	
	
	public static MapLabelRepository getInstance() {
		
		if (instance==null) {
			instance = new MapLabelRepository();
			instance.init();
		}
		
		return instance;
	}
	
	public void init() {
		
		LabelMap = new HashMap<String,Label>();
		NoteMap = new HashMap<String,Note>();
		
		// Create Notes
		Note N0 = new Note();
        N0.setTitle("Nueva nota 0");
        N0.setNote("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce commodo justo quis sapien dignissim, ut commodo neque elementum. Ut sollicitudin, est quis maximus tempor, turpis velit hendrerit odio, vitae dapibus magna libero quis erat. Phasellus in risus neque. Nulla hendrerit massa lectus. Aenean tincidunt, est sit amet aliquam vehicula, diam justo scelerisque metus, sed condimentum erat lorem eget magna. Etiam volutpat, mi a pharetra placerat, dui tortor varius metus, eget aliquet dolor lectus sed neque. Nunc tincidunt libero quam, in venenatis justo consequat sed. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Sed eu sagittis magna. Vivamus purus lacus, vulputate sed diam ut, varius imperdiet quam. Duis et lacus quis ante consequat condimentum eget quis eros. Vivamus cursus efficitur blandit. Duis quis dui convallis neque rutrum accumsan nec sed velit. Integer dignissim risus erat, sit amet malesuada magna lacinia eget.");
        N0.cleanLinks();

        Note N1 = new Note();
        N1.setTitle("Nueva nota 1");
        N1.setNote("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce commodo justo quis sapien dignissim, ut commodo neque elementum. Ut sollicitudin, est quis maximus tempor, turpis velit hendrerit odio, vitae dapibus magna libero quis erat. Phasellus in risus neque. Nulla hendrerit massa lectus. Aenean tincidunt, est sit amet aliquam vehicula, diam justo scelerisque metus, sed condimentum erat lorem eget magna. Etiam volutpat, mi a pharetra placerat, dui tortor varius metus, eget aliquet dolor lectus sed neque. Nunc tincidunt libero quam, in venenatis justo consequat sed. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Sed eu sagittis magna. Vivamus purus lacus, vulputate sed diam ut, varius imperdiet quam. Duis et lacus quis ante consequat condimentum eget quis eros. Vivamus cursus efficitur blandit. Duis quis dui convallis neque rutrum accumsan nec sed velit. Integer dignissim risus erat, sit amet malesuada magna lacinia eget.");
        N1.cleanLinks();

        Note N2 = new Note();
        N2.setTitle("Nueva nota 2");
        N2.setNote("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce commodo justo quis sapien dignissim, ut commodo neque elementum. Ut sollicitudin, est quis maximus tempor, turpis velit hendrerit odio, vitae dapibus magna libero quis erat. Phasellus in risus neque. Nulla hendrerit massa lectus. Aenean tincidunt, est sit amet aliquam vehicula, diam justo scelerisque metus, sed condimentum erat lorem eget magna. Etiam volutpat, mi a pharetra placerat, dui tortor varius metus, eget aliquet dolor lectus sed neque. Nunc tincidunt libero quam, in venenatis justo consequat sed. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Sed eu sagittis magna. Vivamus purus lacus, vulputate sed diam ut, varius imperdiet quam. Duis et lacus quis ante consequat condimentum eget quis eros. Vivamus cursus efficitur blandit. Duis quis dui convallis neque rutrum accumsan nec sed velit. Integer dignissim risus erat, sit amet malesuada magna lacinia eget.");
        N2.cleanLinks();

        Note N3 = Note.subNote(N0);
        N3.setTitle("Subnota de N0");
        N3.setNote("Esta nota esta linkeada a N0");
        N3.cleanLinks();

        Label L1 = new Label();
        
		
		
		
		// Add Notes to Labels
		addNote(jaLabel.getId(), rollingInTheDeep.getId());
		addNote(jaLabel.getId(), one.getId());
		addNote(jaLabel.getId(), smellLikeTeenSpirit.getId());
		addNote(jaLabel.getId(), losingMyReligion.getId());
		
		addNote(Label.getId(), losingMyReligion.getId());
		addNote(Label.getId(), gotye.getId());
	}
	
	// Label related operations
	
	public void addLabel(Label l) {
		String id = "p" + index++;	
		l.setId(id);
		LabelMap.put(id,l);
	}
	
	
	public Collection<Label> getAllLabels() {
			return LabelMap.values();
	}

	
	public Label getLabel(String id) {
		return LabelMap.get(id);
	}
	
	
	public void updateLabel(Label l) {
		LabelMap.put(l.getId(),l);
	}

	
	public void deleteLabel(String id) {	
		LabelMap.remove(id);
	}
	

	
	public void addNote(String LabelId, String NoteId) {
		Label Label = getLabel(LabelId);
		Label.addNote(NoteMap.get(NoteId));
    }
    
	
	public Collection<Note> getAll(String LabelId) {
		return getLabel(LabelId).getNotes();
	}

	
	public void removeNote(String LabelId, String NoteId) {
		getLabel(LabelId).deleteNote(NoteId);
	}

	
	// Note related operations
	
	
	public void addNote(Note n) {
		String id = "n" + index++;
		n.setId(id);
		NoteMap.put(id, n);
	}
	
	
	public Collection<Note> getAllNotes() {
			return NoteMap.values();
	}

	public Note getNote(String NoteId) {
		return NoteMap.get(NoteId);
	}

	
	public void updateNote(Note n) {
		Note note = NoteMap.get(n.getId());
		note.setTitle(n.getTitle());
        note.setNote(n.getNote());
		note.setLastModified();
	}

	
	public void deleteNote(String NoteId) {
		NoteMap.remove(NoteId);
	}
	
}
