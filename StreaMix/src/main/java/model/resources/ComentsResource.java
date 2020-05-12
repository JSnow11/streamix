package model.resources;

import java.util.Map;
import java.util.logging.Logger;

import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;
import model.yt.YoutubeComents;
import utility.Tools;



public class ComentsResource {
	private static final Logger log = Logger.getLogger(ComentsResource.class.getName());
	public static final String apiKey = "AIzaSyAyYc09Pm_U_PLG5wu-rmLGsp-NZj5Kq8k";
    private final String access_token;
    private final String uri = "https://www.googleapis.com/youtube/v3/commentsThreads";
    
    
    public ComentsResource(String access_token) {
        this.access_token = access_token;
    }
    public YoutubeComents getComents(String videoid) {

        ClientResource cr = null;
        YoutubeComents coments = null;
        try {
            cr = new ClientResource(uri +"?part=snippet&parentId="+videoid+"key="+apiKey+"&maxResults=20");
            coments = cr.get(YoutubeComents.class);
           
    		ChallengeResponse chr = new ChallengeResponse(ChallengeScheme.HTTP_OAUTH_BEARER);
    		chr.setRawValue(access_token);
    		cr.setChallengeResponse(chr);
        } catch (ResourceException re) {
            log.warning("Error when retrieving coments: " + cr.getResponse().getStatus());
        }

        return coments;

    }
    public void postComents(YoutubeComents coment, String content) {

    	ClientResource cr = null;
        
        try {
            cr = new ClientResource(uri + "?part=snippet&key=" + apiKey);
            YoutubeComents newcomment = cr.post(coment, YoutubeComents.class);
            cr.put(newcomment);
            
            
           
        } catch (ResourceException re) {
            log.warning("Error when inserting file: " + cr.getResponse().getStatus());
        }
    }
        

}
