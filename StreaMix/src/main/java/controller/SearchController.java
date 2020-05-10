package controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.resources.GamesTwitchResource;
import model.resources.TwitchSearchResource;
import model.resources.YTSearchResource;
import model.twitch.Datum;
import model.twitch.Games;
import model.twitch.Streams;
import model.twitch.TwitchSearch;
import model.yt.YtSearch;


public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final Logger log = Logger.getLogger(SearchController.class.getName());

	public SearchController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.log(Level.INFO, "La query es: " + request.getParameter("searchQuery"));
		RequestDispatcher rd = null;
		String query = request.getParameter("searchQuery");
		String queryFormatted = URLEncoder.encode(query, "UTF-8");
		log.log(Level.FINE, "Processing GET request, keywords: " + query + " processed.");

		YTSearchResource videosr = new YTSearchResource();
		YtSearch videos = videosr.getVideos(query);

		Games games = GamesTwitchResource.getGamesStatic();
		String gameId = "";

		for (Datum game : games.getData()) {
			if ((game.getName().toLowerCase().contains(queryFormatted.toLowerCase())))
				gameId = game.getId();
		}

		Streams streams = null;

		if (!gameId.equals("")) {
			TwitchSearchResource twsr = new TwitchSearchResource();
			streams = twsr.getStreams(gameId);
		}

		if ((videos != null)) {
			rd = request.getRequestDispatcher("/double.jsp");
			request.setAttribute("ytvideos", videos.getItems());
			request.setAttribute("searchQuery", query);
			if (streams != null)
				request.setAttribute("twstreams", streams.getData());
		} else {
			log.log(Level.SEVERE, "Objects = null");
			List<String> errores = new ArrayList<>();
			if (streams == null)
				errores.add("Fallo al obtener Streams de Twitch");
			if (videos == null)
				errores.add("Fallo al obtener Videos de YT");
			request.setAttribute("errors", errores);
			rd = request.getRequestDispatcher("/error.jsp");
		}

		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}