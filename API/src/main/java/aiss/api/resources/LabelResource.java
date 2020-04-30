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

import aiss.api.resources.comparators.ComparatorNameLabel;
import aiss.api.resources.comparators.ComparatorNameLabelReversed;
import aiss.model.Note;
import aiss.model.Label;
import aiss.model.repository.LabelRepository;

public class LabelResource {
	/* Singleton */
	private static LabelResource _instance=null;
	LabelRepository repository;
	
	private LabelResource() {
		repository= LabelRepository.getInstance();

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
            
        for (Label Label: repository.getAllLabels()) {
            if (name == null || Label.getName().equals(name)) { // Name filter
                if (isEmpty == null // Empty Label filter
                        || (isEmpty && (Label.getNotes() == null || Label.getNotes().size() == 0))
                        || (!isEmpty && (Label.getNotes() != null && Label.getNotes().size() > 0))) {
                    result.add(Label);
                }
            }
        }
            
        if (order != null) { // Order results
            if (order.equals("name")) {
                Collections.sort(result, new ComparatorNameLabel());
            } else if (order.equals("-name")) {
                Collections.sort(result, new ComparatorNameLabelReversed());
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
		Label list = repository.getLabel(id);
		
		if (list == null) {
			throw new NotFoundException("The Label wit id="+ id +" was not found");			
		}
		
		return list;
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response addLabel(@Context UriInfo uriInfo, Label Label) {
		if (Label.getName() == null || "".equals(Label.getName()))
			throw new BadRequestException("The name of the Label must not be null");
		
		if (Label.getNotes()!=null)
			throw new BadRequestException("The Notes property is not editable.");

		repository.addLabel(Label);

		// Builds the response. Returns the Label the has just been added.
		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(Label.getId());
		ResponseBuilder resp = Response.created(uri);
		resp.entity(Label);			
		return resp.build();
	}

	
	@PUT
	@Consumes("application/json")
	public Response updateLabel(Label Label) {
		Label oldLabel = repository.getLabel(Label.getId());
		if (oldLabel == null) {
			throw new NotFoundException("The Label with id="+ Label.getId() +" was not found");			
		}
		
		if (Label.getNotes()!=null)
			throw new BadRequestException("The Notes property is not editable.");
		
		// Update name
		if (Label.getName()!=null)
			oldLabel.setName(Label.getName());
		
		// Update description
		if (Label.getDescription()!=null)
			oldLabel.setDescription(Label.getDescription());
		
		return Response.noContent().build();
	}
	
	@DELETE
	@Path("/{id}")
	public Response removeLabel(@PathParam("id") String id) {
		Label toberemoved=repository.getLabel(id);
		if (toberemoved == null)
			throw new NotFoundException("The Label with id="+ id +" was not found");
		else
			repository.deleteLabel(id);
		
		return Response.noContent().build();
	}
	
	
	@POST	
	@Path("/{LabelId}/{NoteId}")
	@Produces("application/json")
	public Response addNote(@Context UriInfo uriInfo,@PathParam("LabelId") String LabelId, @PathParam("NoteId") String NoteId)
	{				
		
		Label Label = repository.getLabel(LabelId);
		Note Note = repository.getNote(NoteId);
		
		if (Label==null)
			throw new NotFoundException("The Label with id=" + LabelId + " was not found");
		
		if (Note == null)
			throw new NotFoundException("The Note with id=" + NoteId + " was not found");
		
		if (Label.getNote(NoteId)!=null)
			throw new BadRequestException("The Note is already included in the Label.");
			
		repository.addNote(LabelId, NoteId);		

		// Builds the response
		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(LabelId);
		ResponseBuilder resp = Response.created(uri);
		resp.entity(Label);			
		return resp.build();
	}
	
	
	@DELETE
	@Path("/{LabelId}/{NoteId}")
	public Response removeNote(@PathParam("LabelId") String LabelId, @PathParam("NoteId") String NoteId) {
		Label Label = repository.getLabel(LabelId);
		Note Note = repository.getNote(NoteId);
		
		if (Label==null)
			throw new NotFoundException("The Label with id=" + LabelId + " was not found");
		
		if (Note == null)
			throw new NotFoundException("The Note with id=" + NoteId + " was not found");
		
		
		repository.removeNote(LabelId, NoteId);		
		
		return Response.noContent().build();
	}
}
