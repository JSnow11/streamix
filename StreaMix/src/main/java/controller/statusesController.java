package controller;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.resources.TweetsResource;
import model.twitter.TweetList;

/**
 * Servlet implementation class statusesController
 */
public class statusesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(trendsController.class.getName());
       
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public statusesController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.log(Level.INFO, "Peticion de trends realizada");

		RequestDispatcher rd = null;
		TweetsResource tr = new TweetsResource();
		List<String> t = tr.getTweets("hola");
		
		if(t != null) {
			rd = request.getRequestDispatcher("/browser.jsp");
			request.setAttribute("tweets", t);
		}else {
			log.log(Level.SEVERE, "Objects = null");
			rd = request.getRequestDispatcher("/error.jsp");
		}
		
		rd.forward(request, response);	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
