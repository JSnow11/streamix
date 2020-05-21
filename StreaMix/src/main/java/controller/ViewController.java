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

import model.resources.ComentsResource;
import model.resources.PostsRedditResource;
import model.resources.TweetsResource;
import model.yt.comments.Item;

public class ViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(ViewController.class.getName());

	public ViewController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.log(Level.INFO, "Peticion de view realizada");
		String pickedTopic = request.getParameter("pickedTopic");
		String videoID = request.getParameter("videoID");
		String streamID = request.getParameter("streamID");

		log.log(Level.FINE, "Processing GET request, keywords: " + pickedTopic + " processed.");

		RequestDispatcher rd = null;
		TweetsResource tr = new TweetsResource();
		log.log(Level.WARNING, "Se procede con twitter");
		List<String> t = tr.getTweets(pickedTopic);

		PostsRedditResource sprr = new PostsRedditResource();
		List<String> rp = sprr.getPosts(pickedTopic);

		if (t != null && rp != null) {
			rd = request.getRequestDispatcher("/view.jsp");
			if (videoID != null) {
				request.setAttribute("videoID", videoID);
				String accessToken = (String) request.getSession().getAttribute("YouTube-token");
				ComentsResource ytcr = new ComentsResource(accessToken);
				List<Item> comments = ytcr.getComents(videoID);
				request.setAttribute("comments", comments);
			}
			if (streamID != null)
				request.setAttribute("streamID", streamID);
			request.setAttribute("tweets", t);
			request.setAttribute("redditPosts", rp);
			request.setAttribute("pickedTopic", pickedTopic);
		} else {
			log.log(Level.SEVERE, "Objects = null");
			List<String> errores = new ArrayList<>();
			if (t == null)
				errores.add("Fallo al obtener Trends de Twitter");
			if (rp == null)
				errores.add("Fallo al obtener Posts de Reddit");
			request.setAttribute("errors", errores);
			rd = request.getRequestDispatcher("/error.jsp");
		}

		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
