package utility;

import org.restlet.data.Header;
import org.restlet.engine.header.HeaderConstants;
import org.restlet.resource.ClientResource;
import org.restlet.util.Series;

public class Tools {
	public static String decode(String st) {
		String str = st.split(" ")[0];
		
		str =  str.replace("\\"," ");
		String[] arr = str.split("u");
		
		String text = "";
		for(int i = 1; i < arr.length; i++){
		    int hexVal = Integer.parseInt(arr[i].trim(), 16);
		    text += (char)hexVal;
		}
		return text;
	}
	public static void addHeader(ClientResource cr, String headerName, String headerValue) {
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
