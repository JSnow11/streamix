package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.resources.PostsRedditResource;
import model.resources.TweetsResource;

/**
 * Servlet implementation class statusesController
 */
public class ViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(TrendsController.class.getName());

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.log(Level.INFO, "Peticion de trends realizada");

		String pickedTopic = request.getParameter("pickedTopic");
		log.log(Level.FINE, "Processing GET request, keywords: " + pickedTopic + " processed.");
		
		RequestDispatcher rd = null;
		TweetsResource tr = new TweetsResource();
		List<String> t = tr.getTweets("hola");
		
		PostsRedditResource sprr = new PostsRedditResource();
		List<String> rp = sprr.getPosts(pickedTopic);
		
		if(t != null && rp != null) {
			rd = request.getRequestDispatcher("/browser.jsp");
			request.setAttribute("tweets", t);
			request.setAttribute("redditPosts", rp);
		}else {
			log.log(Level.SEVERE, "Objects = null");
			List<String> errores = new ArrayList<>();
			if(t == null) errores.add("Fallo al obtener Trends de Twitter");
			if(rp == null) errores.add("Fallo al obtener Posts de Reddit");
			request.setAttribute("errors", errores);
			rd = request.getRequestDispatcher("/error.jsp");
		}
		
		rd.forward(request, response);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
