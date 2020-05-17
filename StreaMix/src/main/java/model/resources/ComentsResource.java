package model.resources;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import model.yt.comments.Item;
import model.yt.comments.Snippet;
import model.yt.comments.Snippet2;
import model.yt.comments.TopLevelComment;
import model.yt.comments.YoutubeComents;
import utility.Tools;



public class ComentsResource {
	private static final Logger log = Logger.getLogger(ComentsResource.class.getName());
	public static final String apiKey = "AIzaSyAyYc09Pm_U_PLG5wu-rmLGsp-NZj5Kq8k";
    private final String access_token;
    private final String uri = "https://www.googleapis.com/youtube/v3/commentThreads";
    
    
    public ComentsResource(String access_token) {
        this.access_token = access_token;
    }
    public List<Item> getComents(String videoid) {
        ClientResource cr = new ClientResource(uri +"?part=snippet&maxResults=20&videoId="+videoid+"&key="+apiKey);
        YoutubeComents coments = cr.get(YoutubeComents.class);
        log.log(Level.INFO, "comentarios solicitados");
        return coments.getItems();
    }
    
    public void postComents(String videoid, String comment) {
    	ClientResource cr = new ClientResource(uri + "?part=snippet&key=" + apiKey);
    	
    	Item newcomment = new Item();
    	Snippet sn = new Snippet();
    	TopLevelComment tlc = new TopLevelComment();
    	Snippet2 sn2 = new Snippet2();
    	sn2.setTextOriginal(comment);
    	tlc.setSnippet(sn2);
    	sn.setVideoId(videoid);
    	sn.setTopLevelComment(tlc);
    	newcomment.setSnippet(sn);
    	
    	ChallengeResponse chr = new ChallengeResponse(ChallengeScheme.HTTP_OAUTH_BEARER);
		chr.setRawValue(access_token);
		cr.setChallengeResponse(chr);
    	Tools.addHeader(cr, "Content-Type", "application/json");
    	
    	cr.post(newcomment, Item.class);  
    }
}
