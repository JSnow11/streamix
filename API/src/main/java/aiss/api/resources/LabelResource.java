package aiss.api.resources;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.jboss.resteasy.spi.BadRequestException;
import org.jboss.resteasy.spi.NotFoundException;

import aiss.api.resources.comparators.ComparatorLabelName;
import aiss.api.resources.comparators.ComparatorLabelNameReversed;
import aiss.model.Label;
import aiss.model.Note;
import aiss.model.repository.LabelRepository;
import aiss.model.repository.MapLabelRepository;

@Path("/labels")
public class LabelResource {
	private static final Logger log = Logger.getLogger(LabelResource.class.getName());
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
            
        for (Label label: repository.getAllLabels()) {
            if (name == null || label.getName().toLowerCase().equals(name.toLowerCase())) { // Name filter
                if (isEmpty == null // Empty label filter
                        || (isEmpty && (label.getNotes() == null || label.getNotes().size() == 0))
                        || (!isEmpty && (label.getNotes() != null && label.getNotes().size() > 0))) {
                    result.add(label);
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
        log.log(Level.INFO, "GET Labels done");
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

		log.log(Level.INFO, "GET Label by id "+id+" done");	
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

		// Builds the response. Returns the label the has just been added.
		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(Lab.getId());
		ResponseBuilder resp = Response.created(uri);
		resp.entity(Lab);
		log.log(Level.INFO, "POST Label "+Lab.getId()+" done");	
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
		
		log.log(Level.INFO, "UPDATE Label "+Lab.getId()+" done");		
		return Response.noContent().build();
	}
	
	@DELETE
	@Path("/{id}")
	public Response removeLabel(@PathParam("id") String id) {
		Label toberemoved=repository.getLabel(id);
		if (toberemoved == null)
			throw new NotFoundException("The label with id="+ id +" was not found");
		else
			repository.deleteLabel(id);
		log.log(Level.INFO, "DELETE Label by id "+id+" done");
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
			throw new BadRequestException("The note is already included in the label.");
			
		repository.addNote(labelId, noteId);		

		// Builds the response
		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(labelId);
		ResponseBuilder resp = Response.created(uri);
		resp.entity(label);
		log.log(Level.INFO, "POST note "+noteId+"to label "+labelId+" done");
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
		log.log(Level.INFO, "DELETE note of Label done");
		return Response.noContent().build();
	}
}
