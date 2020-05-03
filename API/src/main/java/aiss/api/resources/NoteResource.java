package aiss.api.resources;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import java.net.URI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.jboss.resteasy.spi.BadRequestException;
import org.jboss.resteasy.spi.NotFoundException;

import aiss.api.resources.comparators.ComparatorNotesColor;
import aiss.api.resources.comparators.ComparatorNotesColorReversed;
import aiss.api.resources.comparators.ComparatorNotesCreateDate;
import aiss.api.resources.comparators.ComparatorNotesCreateDateReversed;
import aiss.api.resources.comparators.ComparatorNotesLastModified;
import aiss.api.resources.comparators.ComparatorNotesLastModifiedReversed;
import aiss.api.resources.comparators.ComparatorNotesTitle;
import aiss.api.resources.comparators.ComparatorNotesTitleReversed;
import aiss.model.Note;
import aiss.model.repository.LabelRepository;
import aiss.model.repository.MapLabelRepository;

@Path("/notes")
public class NoteResource {
	public static NoteResource _instance=null;
	LabelRepository repository;
	
	private NoteResource(){
		repository=MapLabelRepository.getInstance();
	}
	
	public static NoteResource getInstance()
	{
		if(_instance==null)
			_instance=new NoteResource();
		return _instance; 
	}
	
	@GET
	@Produces("application/json")
	public Collection<Note> getAll(@QueryParam("order") String order, @QueryParam("q") String q)
	{
		List<Note> result = new ArrayList<Note>();
        
		//Search by query "q"
        for (Note note: repository.getAllNotes()) {
            if (q == null
					|| note.getTitle().toLowerCase().contains(q.toLowerCase())
					|| note.getNote().toLowerCase().contains(q.toLowerCase())
					|| note.getColor().toLowerCase().contains(q.toLowerCase())
            		|| (note.getCreatedDate() != null && note.getCreatedDate().toString().contains(q.toLowerCase()))
            		|| (note.getLastModified() != null && note.getLastModified().toString().contains(q.toLowerCase())))
            	result.add(note);
        }
        
        //Order by "order"
        if (order != null) {
            if (order.equals("title")) {
                Collections.sort(result, new ComparatorNotesTitle());
            } else if (order.equals("-title")) {
            	Collections.sort(result, new ComparatorNotesTitleReversed());
            } else if (order.equals("createDate")) {
            	Collections.sort(result, new ComparatorNotesCreateDate());
            } else if (order.equals("-createDate")) {
            	Collections.sort(result, new ComparatorNotesCreateDateReversed());
            } else if (order.equals("lastModified")) {
            	Collections.sort(result, new ComparatorNotesLastModified());
            } else if (order.equals("-lastModified")) {
            	Collections.sort(result, new ComparatorNotesLastModifiedReversed());
            }  else if (order.equals("color")) {
            	Collections.sort(result, new ComparatorNotesColor());
            } else if (order.equals("-color")) {
            	Collections.sort(result, new ComparatorNotesColorReversed());
            }else {
                throw new BadRequestException("The order parameter must be 'title', '-title, 'color', '-color', 'createDate','-createDate','lastModified' or '-lastModified'.");
            }
        }

        return result;
	}
	
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Note get(@PathParam("id") String noteId)
	{
		Note note = repository.getNote(noteId);
		
		if (note == null) {
			throw new NotFoundException("The note with id="+ noteId +" was not found");			
		}
		
		return note;
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response addNote(@Context UriInfo uriInfo, Note note) {
		if (note.getTitle() == null || "".equals(note.getTitle()))
			throw new BadRequestException("The title of the note must not be null");

		repository.addNote(note);

		// Builds the response. Returns the playlist the has just been added.
		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(note.getId());
		ResponseBuilder resp = Response.created(uri);
		resp.entity(note);			
		return resp.build();
	}
	
	
	@PUT
	@Consumes("application/json")
	public Response updateNote(Note note) {
		Note oldnote = repository.getNote(note.getId());
		if (oldnote == null) {
			throw new NotFoundException("The note with id="+ note.getId() +" was not found");			
		}
		
		if (note.getTitle()!=null)
			oldnote.setTitle(note.getTitle());
		
			oldnote.setLastModified();
		
		if (note.getNote()!=null)
			oldnote.setNote(note.getNote());
		
		if (note.getColor()!=null)
			oldnote.setColor(note.getColor());
		
		
		return Response.noContent().build();
	}
	
	@DELETE
	@Path("/{id}")
	public Response removeNote(@PathParam("id") String noteId) {
		Note toberemoved=repository.getNote(noteId);
		if (toberemoved == null)
			throw new NotFoundException("The note with id="+ noteId +" was not found");
		else {
			repository.deleteNote(noteId);
		}
			
		
		return Response.noContent().build();
	}
}
