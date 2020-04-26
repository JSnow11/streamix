package aiss.api.resources;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.jboss.resteasy.spi.BadRequestException;
import org.jboss.resteasy.spi.NotFoundException;

import aiss.api.resources.comparators.ComparatorAlbumSong;
import aiss.api.resources.comparators.ComparatorAlbumSongReversed;
import aiss.api.resources.comparators.ComparatorArtistSong;
import aiss.api.resources.comparators.ComparatorArtistSongReversed;
import aiss.api.resources.comparators.ComparatorNamePlaylist;
import aiss.api.resources.comparators.ComparatorNamePlaylistReversed;
import aiss.model.Playlist;
import aiss.model.Song;
import aiss.model.repository.MapPlaylistRepository;
import aiss.model.repository.PlaylistRepository;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


@Path("/songs")
public class SongResource {

	public static SongResource _instance=null;
	PlaylistRepository repository;
	
	private SongResource(){
		repository=MapPlaylistRepository.getInstance();
	}
	
	public static SongResource getInstance()
	{
		if(_instance==null)
			_instance=new SongResource();
		return _instance; 
	}
	
	@GET
	@Produces("application/json")
	public Collection<Song> getAll(@QueryParam("order") String order, @QueryParam("q") String q)
	{
		List<Song> result = new ArrayList<Song>();
        
        for (Song song: repository.getAllSongs()) {
            if (q == null
            		|| song.getTitle().toLowerCase().contains(q.toLowerCase())
            		|| (song.getArtist() != null && song.getArtist().toLowerCase().contains(q.toLowerCase()))
            		|| (song.getAlbum() != null && song.getAlbum().toLowerCase().contains(q.toLowerCase())))
            	result.add(song);
        }
            
        if (order != null) { // Order results
            if (order.equals("album")) {
                Collections.sort(result, new ComparatorAlbumSong());
            } else if (order.equals("-album")) {
            	Collections.sort(result, new ComparatorAlbumSongReversed());
            } else if (order.equals("artist")) {
            	Collections.sort(result, new ComparatorArtistSong());
            } else if (order.equals("-artist")) {
            	Collections.sort(result, new ComparatorArtistSongReversed());
            } else {
                throw new BadRequestException("The order parameter must be 'album', '-album, 'artist' or '-artist'.");
            }
        }

        return result;
	}
	
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Song get(@PathParam("id") String songId)
	{
		Song list = repository.getSong(songId);
		
		if (list == null) {
			throw new NotFoundException("The song wit id="+ songId +" was not found");			
		}
		
		return list;
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response addSong(@Context UriInfo uriInfo, Song song) {
		if (song.getTitle() == null || "".equals(song.getTitle()))
			throw new BadRequestException("The title of the song must not be null");

		repository.addSong(song);

		// Builds the response. Returns the playlist the has just been added.
		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(song.getId());
		ResponseBuilder resp = Response.created(uri);
		resp.entity(song);			
		return resp.build();
	}
	
	
	@PUT
	@Consumes("application/json")
	public Response updateSong(Song song) {
		Song oldsong = repository.getSong(song.getId());
		if (oldsong == null) {
			throw new NotFoundException("The song with id="+ song.getId() +" was not found");			
		}
		
		// Update title
		if (song.getTitle()!=null)
			oldsong.setTitle(song.getTitle());
		
		// Update album
		if (song.getAlbum()!=null)
			oldsong.setAlbum(song.getAlbum());
		
		// Update artist
		if (song.getArtist()!=null)
			oldsong.setArtist(song.getArtist());
		
		// Update year
		if (song.getYear()!=null)
			oldsong.setYear(song.getYear());
		
		return Response.noContent().build();
	}
	
	@DELETE
	@Path("/{id}")
	public Response removeSong(@PathParam("id") String songId) {
		Song toberemoved=repository.getSong(songId);
		if (toberemoved == null)
			throw new NotFoundException("The song with id="+ songId +" was not found");
		else
			repository.deleteSong(songId);
		
		return Response.noContent().build();
	}
	
}