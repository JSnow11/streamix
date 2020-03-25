package controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.resources.YTSearchResource;
import model.yt.YtSearch;

public class YTSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private static final Logger log = Logger.getLogger(YTSearchController.class.getName());
	
    public YTSearchController() {
    	super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.log(Level.WARNING, "La query es: "+request.getParameter("searchQuery"));
		String query = request.getParameter("searchQuery");
		log.log(Level.WARNING, "La query es: "+query);
		RequestDispatcher rd = null;
		
		log.log(Level.FINE, "Processing GET request, keywords: " + query + " processed.");
		YTSearchResource ytsr = new YTSearchResource();
		YtSearch yts = ytsr.getVideos(query);
		
		
		if(yts != null) {
			rd = request.getRequestDispatcher("/double.jsp");
			request.setAttribute("ytvideos", yts.getItems());
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
