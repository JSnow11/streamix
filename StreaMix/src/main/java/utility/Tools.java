package utility;

import java.util.HashMap;
import java.util.Map;

import org.restlet.data.Header;
import org.restlet.engine.header.HeaderConstants;
import org.restlet.resource.ClientResource;
import org.restlet.util.Series;

public class Tools {
	@SuppressWarnings("serial")
	private static final Map<String, String> Map = new HashMap<String, String>() {{
	    put("\\u00ED", "í");
	    put("\\u00E9", "é");
	    put("\\u00E1", "á");
	    put("\\u00F3", "ó");
	    put("\\u00FA", "ú");
	    put("\\u003C", "<");
	    put("\\u003E", ">");
	    put("\\u00F1", "ñ");
	}};
	public static String decode(String st) {
		
		for(String s:Map.keySet()) {
			st=st.replace(s, Map.get(s));
		}
		return st;
	}
	public static void addHeader(ClientResource cr, String headerName, String headerValue) {
	    @SuppressWarnings("unchecked")
		Series<Header> headers = (Series<Header>) cr.getRequest().getAttributes()
	        .get(HeaderConstants.ATTRIBUTE_HEADERS);
	    
	    if (headers == null) {
	    	headers = new Series<Header>(Header.class);
	    	cr.getRequest().getAttributes().put(HeaderConstants.ATTRIBUTE_HEADERS, headers);
	    }
	    headers.add(headerName, headerValue);
	}
	
	public static String parseHtml(String st) {
		String s = "";
		for(String trd: st.split("[{},]")) {
			if(trd.contains("html")) {
				s = trd.split(":")[1].trim();
			}
		}
		return s;
	}
}
