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
		log.log(Level.INFO, "VIEWCONTROLLER - Buscando tweets, post de reddit y comentarios ...");
		String pickedTopic = request.getParameter("pickedTopic");
		String videoID = request.getParameter("videoID");
		String streamID = request.getParameter("streamID");
		if (pickedTopic == null) {
			pickedTopic = (String) request.getSession().getAttribute("pickedTopic");
			videoID = (String) request.getSession().getAttribute("videoID");
		}

		log.log(Level.WARNING, "Tema elegido: " + pickedTopic + ", ID:" + videoID != null ? videoID : streamID);

		RequestDispatcher rd = null;
		TweetsResource tr = new TweetsResource();
		List<String> t = tr.getTweets(pickedTopic);
		log.log(Level.INFO, t != null ? "Tweets recibidos" : "No se han recibido tweets de Twitter");

		PostsRedditResource sprr = new PostsRedditResource();
		List<String> rp = sprr.getPosts(pickedTopic);
		log.log(Level.INFO, rp != null ? "Post recibidos en el controler" : "No se han recibido post de Reddit");

		if ((videoID != null || streamID != null) && t != null) {
			rd = request.getRequestDispatcher("/view.jsp");
			if (videoID != null) {
				request.setAttribute("videoID", videoID);
				String accessToken = (String) request.getSession().getAttribute("YouTube-token");
				ComentsResource ytcr = new ComentsResource(accessToken);
				List<Item> comments = ytcr.getComents(videoID);
				log.log(Level.INFO,
						comments != null ? "Comments recibidos en el controler" : "No se han recibido comments de YT");

				request.setAttribute("comments", comments);
				log.log(Level.INFO,
						"El video, los tweets, los posts de reddit y los comments de yt recibidos se han enviado a la vista view.jsp");
			}
			if (streamID != null)
				request.setAttribute("streamID", streamID);

			request.setAttribute("tweets", t);
			request.setAttribute("redditPosts", rp);
			request.setAttribute("pickedTopic", pickedTopic);
			log.log(Level.INFO,
					"El stream, los tweets y los posts de reddit recibidos se han enviado a la vista view.jsp");
		} else {
			log.log(Level.WARNING, "No se han obtenido respuestas en el controller");
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
