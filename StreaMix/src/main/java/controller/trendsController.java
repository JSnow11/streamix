package controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.resources.TrendsResource;
import model.resources.TwitchSearchResource;
import model.resources.YTSearchResource;
import model.twitch.TwitchSearch;
import model.twitter.Trending;
import model.yt.YtSearch;

public class trendsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(trendsController.class.getName());
       
	
    public trendsController() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.log(Level.INFO, "Peticion de trends realizada");

		RequestDispatcher rd = null;

		TrendsResource tr = new TrendsResource();
		Trending t = tr.getTrends();
		
		if(t != null) {
			rd = request.getRequestDispatcher("/browser.jsp");
			request.setAttribute("trends", t.getTrends());
		}else {
			log.log(Level.SEVERE, "Objects = null");
			rd = request.getRequestDispatcher("/error.jsp");
		}
		
		rd.forward(request, response);	
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
