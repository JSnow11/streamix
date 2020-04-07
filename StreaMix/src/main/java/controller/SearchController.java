	package controller;

	import java.io.IOException;
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

			String queryYT = request.getParameter("searchQuery");
			log.log(Level.FINE, "Processing GET request, keywords: " + queryYT + " processed.");
			YTSearchResource ytsr = new YTSearchResource();
			YtSearch yts = ytsr.getVideos(queryYT);
			
			/*
			String queryTW = request.getParameter("searchQuery");
			log.log(Level.FINE, "Processing GET request, keywords: " + queryTW + " processed.");
			TwitchSearchResource twsr = new TwitchSearchResource();
			TwitchSearch tws = twsr.getStreams(queryTW);
			*/
			
			if(yts != null /*&& tws != null*/) {
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