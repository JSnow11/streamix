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

	import model.resources.TwitchSearchResource;
	import model.resources.YTSearchResource;
	import model.twitch.TwitchSearch;
	import model.yt.YtSearch;

	public class SearchController extends HttpServlet {
		private static final long serialVersionUID = 1L;
		
		private static final Logger log = Logger.getLogger(SearchController.class.getName());
		
		public SearchController() {
			super();
		}

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			log.log(Level.INFO, "La query es: "+request.getParameter("searchQuery"));

			RequestDispatcher rd = null;
			String query = request.getParameter("searchQuery");
			log.log(Level.FINE, "Processing GET request, keywords: " + query + " processed.");
			
			YTSearchResource ytsr = new YTSearchResource();
			YtSearch yts = ytsr.getVideos(query);

			TwitchSearchResource twsr = new TwitchSearchResource();
			TwitchSearch tws = twsr.getStreams(query);
			
			
			if((yts != null) && (tws != null)) {
				rd = request.getRequestDispatcher("/double.jsp");
				request.setAttribute("ytvideos", yts.getItems());
				request.setAttribute("twstreams", tws.getStreams());
			}else {
				log.log(Level.SEVERE, "Objects = null");
				List<String> errores = new ArrayList<>();
				if(tws == null) errores.add("Fallo al obtener Streams de Twitch");
				if(yts == null) errores.add("Fallo al obtener Videos de YT");
				request.setAttribute("errors", errores);
				rd = request.getRequestDispatcher("/error.jsp");
			}
			
			rd.forward(request, response);	
		
		}
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
		}

	}