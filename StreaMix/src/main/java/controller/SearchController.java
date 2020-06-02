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

import model.resources.GamesTwitchResource;
import model.resources.TwitchSearchResource;
import model.resources.YTSearchResource;
import model.twitch.Streams;
import model.yt.YtSearch;

public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(SearchController.class.getName());

	public SearchController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		log.log(Level.INFO, "SEARCHCONTROLLER - Buscando videos y streams ...");

		RequestDispatcher rd = null;
		String query = request.getParameter("searchQuery");
		log.log(Level.INFO, "Query: " + query);

		YTSearchResource videosr = new YTSearchResource();
		YtSearch videos = videosr.getVideos(query);
		log.log(Level.INFO,
				videos != null ? "Videos recibidos en el controller" : "No se han recibido videos de youtube");

		String gameId = GamesTwitchResource.getGameID(query);
		TwitchSearchResource twsr = new TwitchSearchResource();
		Streams streams = twsr.getStreams(gameId);
		log.log(Level.INFO,
				streams != null ? "Streams recibidos en el controller" : "No se han recibido streams de twitch");

		if ((videos != null)) {
			rd = request.getRequestDispatcher("/double.jsp");
			request.setAttribute("ytvideos", videos.getItems());
			request.setAttribute("searchQuery", query);
			if (streams != null)
				request.setAttribute("twstreams", streams.getData());
			log.log(Level.INFO, "Los videos y/o streams recibidos se han enviado a la vista double.jsp");

		} else {
			log.log(Level.WARNING, "No se han obtenido recursos en el controller");
			List<String> errores = new ArrayList<>();
			if (streams == null)
				errores.add("No se han obtenido Streams");
			if (videos == null)
				errores.add("No se han obtenido Videos de youtube");
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