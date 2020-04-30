package aiss.api.resources;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.jboss.resteasy.spi.BadRequestException;
import org.jboss.resteasy.spi.NotFoundException;

import aiss.api.resources.comparators.ComparatorLabelName;
import aiss.api.resources.comparators.ComparatorLabelNameReversed;
import aiss.api.resources.comparators.ComparatorNamePlaylist;
import aiss.api.resources.comparators.ComparatorNamePlaylistReversed;
import aiss.model.Label;
import aiss.model.Note;
import aiss.model.Playlist;
import aiss.model.Song;
import aiss.model.repository.LabelRepository;
import aiss.model.repository.MapLabelRepository;
import aiss.model.repository.MapPlaylistRepository;
@Path("/label")
public class LabelResource {
	/* Singleton */
	private static LabelResource _instance=null;
	LabelRepository repository;
	
	private LabelResource() {
		repository= MapLabelRepository.getInstance();

	}
	
	public static LabelResource getInstance()
	{
		if(_instance==null)
				_instance=new LabelResource();
		return _instance;
	}
	
	
    @GET
    @Produces("application/json")
    public Collection<Label> getAll(@QueryParam("order") String order,
            @QueryParam("isEmpty") Boolean isEmpty, @QueryParam("name") String name)
    {
        List<Label> result = new ArrayList<Label>();
            
        for (Label Labels: repository.getAllLabels()) {
            if (name == null || Labels.getName().equals(name)) { // Name filter
                if (isEmpty == null // Empty playlist filter
                        || (isEmpty && (Labels.getNotes() == null || Labels.getNotes().size() == 0))
                        || (!isEmpty && (Labels.getNotes() != null && Labels.getNotes().size() > 0))) {
                    result.add(Labels);
                }
            }
        }
            
        if (order != null) { // Order results
            if (order.equals("name")) {
                Collections.sort(result, new ComparatorLabelName());
            } else if (order.equals("-name")) {
                Collections.sort(result, new ComparatorLabelNameReversed());
            } else {
                throw new BadRequestException("The order parameter must be 'name' or '-name'.");
            }
        }

        return result;
    }
	
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Label get(@PathParam("id") String id)
	{
		Label la = repository.getLabel(id);
		
		if (la == null) {
			throw new NotFoundException("The label wit id="+ id +" was not found");			
		}
		
		return la;
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response addLabel(@Context UriInfo uriInfo, Label Lab) {
		if (Lab.getName() == null || "".equals(Lab.getName()))
			throw new BadRequestException("The name of the label must not be null");
		
		if (Lab.getNotes()!=null)
			throw new BadRequestException("The notes property is not editable.");

		repository.addLabel(Lab);

		// Builds the response. Returns the playlist the has just been added.
		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(Lab.getId());
		ResponseBuilder resp = Response.created(uri);
		resp.entity(Lab);			
		return resp.build();
	}

	
	@PUT
	@Consumes("application/json")
	public Response updateLabel(Label Lab) {
		Label oldLabel = repository.getLabel(Lab.getId());
		if (oldLabel == null) {
			throw new NotFoundException("The Label with id="+ Lab.getId() +" was not found");			
		}
		
		if (Lab.getNotes()!=null)
			throw new BadRequestException("The notes property is not editable.");
		
		// Update name
		if (Lab.getName()!=null)
			oldLabel.setName(Lab.getName());
		
		// Update description
		if (Lab.getColor()!=null)
			oldLabel.setColor(Lab.getColor());
		
		return Response.noContent().build();
	}
	
	@DELETE
	@Path("/{id}")
	public Response removePlaylist(@PathParam("id") String id) {
		Label toberemoved=repository.getLabel(id);
		if (toberemoved == null)
			throw new NotFoundException("The label with id="+ id +" was not found");
		else
			repository.deleteLabel(id);
		
		return Response.noContent().build();
	}
	
	
	@POST	
	@Path("/{labelId}/{noteId}")
	@Produces("application/json")
	public Response addSong(@Context UriInfo uriInfo,@PathParam("labelId") String labelId, @PathParam("noteId") String noteId)
	{				
		
		Label label = repository.getLabel(labelId);
		Note note = repository.getNote(noteId);
		
		if (label==null)
			throw new NotFoundException("The label with id=" + labelId + " was not found");
		
		if (note == null)
			throw new NotFoundException("The note with id=" + noteId + " was not found");
		
		if (label.getNote(noteId)!=null)
			throw new BadRequestException("The note is already included in the playlist.");
			
		repository.addNote(labelId, noteId);		

		// Builds the response
		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(labelId);
		ResponseBuilder resp = Response.created(uri);
		resp.entity(label);			
		return resp.build();
	}
	
	
	@DELETE
	@Path("/{labelId}/{noteId}")
	public Response removeSong(@PathParam("labelId") String labelId, @PathParam("noteId") String noteId) {
		Label label = repository.getLabel(labelId);
		Note note = repository.getNote(noteId);
		
		if (label==null)
			throw new NotFoundException("The label with id=" + labelId + " was not found");
		
		if (note == null)
			throw new NotFoundException("The note with id=" + noteId + " was not found");
		
		
		repository.removeNote(labelId, noteId);		
		
		return Response.noContent().build();
	}
}
