package model.resources;

import java.util.Map;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.google.drive.FileItem;



public class ComentsResource {
	private static final Logger log = Logger.getLogger(ComentsResource.class.getName());

    private final String access_token;
    private final String uri = "https://www.googleapis.com/youtube/v3/comments";
    
    
    public ComentsResource(String access_token) {
        this.access_token = access_token;
    }
    public Coments getComents(String id) {

        ClientResource cr = null;
        Coments file = null;
        try {
            cr = new ClientResource(uri + "/" + id + "?access_token=" + access_token);
            file = cr.get(Coments.class);

        } catch (ResourceException re) {
            log.warning("Error when retrieving coments: " + cr.getResponse().getStatus());
        }

        return file;

    }
    public Coments postComents(String parentId, String content) {

    	ClientResource cr = null;
        String newId = null;
        try {
            cr = new ClientResource(uri + "?access_token=" + access_token);
            Coments newFile = cr.post(file, Coments.class);
            newId = newFile.getId();
            cr = new ClientResource(uri_upload + "/" + newId + "?uploadType=media&access_token=" + access_token);
            Map<String, Object> headers = cr.getRequestAttributes();
            headers.put("Content-Type", "text/plain");
            cr.put(content);
        } catch (ResourceException re) {
            log.warning("Error when inserting file: " + cr.getResponse().getStatus());
        }
        return newId;

}
