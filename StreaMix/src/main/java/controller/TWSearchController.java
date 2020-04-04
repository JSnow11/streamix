package controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.resources.TwitchSearchResource;
import model.twitch.TwitchSearch;

public class TWSearchController {

    private static final long serialVersionUID = 1L;
    
	private static final Logger log = Logger.getLogger(TWSearchController.class.getName());
	
    public TWSearchController() {
    	super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.log(Level.INFO, "La query es: "+request.getParameter("searchQuery"));
		String query = request.getParameter("searchQuery");
		log.log(Level.INFO, "La query es: "+query);
		RequestDispatcher rd = null;
		
		log.log(Level.FINE, "Processing GET request, keywords: " + query + " processed.");
		TwitchSearchResource twsr = new TwitchSearchResource();
		TwitchSearch tws = twsr.getStreams(query);
		
		
		if(tws != null) {
			rd = request.getRequestDispatcher("/double.jsp");
			request.setAttribute("twStreams", tws.getStreams());
		}else {
			log.log(Level.SEVERE, "Objects = null");
			rd = request.getRequestDispatcher("/error.jsp");
		}
		
		rd.forward(request, response);
		
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


}