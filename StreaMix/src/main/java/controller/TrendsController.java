package controller;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.io.WriteFlusher.Listener;

import model.resources.GamesTwitchResource;
import model.resources.TrendsResource;
import model.resources.TwitchSearchResource;
import model.resources.YTSearchResource;
import model.twitch.Games;
import model.twitch.TwitchSearch;
import model.twitter.Trending;
import model.yt.YtSearch;

public class TrendsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(TrendsController.class.getName());

	public TrendsController() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.log(Level.INFO, "Peticion de trends realizada");

		RequestDispatcher rd = null;
		TrendsResource tr = new TrendsResource();
		Trending t = tr.getTrends();
		
		GamesTwitchResource ltr = new GamesTwitchResource();
		Games l = ltr.getGames();
		
		if(t != null && l != null) {
			rd = request.getRequestDispatcher("/browser.jsp");
			request.setAttribute("trends", t.getTrends());
			request.setAttribute("games", l.getData());
		}else {
			log.log(Level.SEVERE, "Objects = null");
			List<String> errores = new ArrayList<>();
			if(t == null) errores.add("Fallo al obtener Trends de Twitter");
			if(l == null) errores.add("Fallo al obtener los Streams de Twitch");
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
