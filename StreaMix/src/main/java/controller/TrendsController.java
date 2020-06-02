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

import model.resources.GamesTwitchResource;
import model.resources.TrendsResource;
import model.twitch.Games;
import model.twitter.Trending;

public class TrendsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(TrendsController.class.getName());

	public TrendsController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getSession().setAttribute("Youtube-token", null);

		log.log(Level.INFO, "TRENDSCONTROLLER - Buscando trending topics y games ...");
		RequestDispatcher rd = null;

		TrendsResource tr = new TrendsResource();
		Trending trends = tr.getTrends();
		log.log(Level.INFO,
				trends != null ? "Trends recibidas en el controller" : "No se han recibido trends de twitter");

		GamesTwitchResource gtr = new GamesTwitchResource();
		Games games = gtr.getGames();
		log.log(Level.INFO,
				games != null ? "Top Games recibidos en el controller" : "No se han recibido games de twitch");

		if (trends != null && games != null) {
			rd = request.getRequestDispatcher("/browser.jsp");
			request.setAttribute("trends", trends.getTrends());
			request.setAttribute("games", games.getData());
			log.log(Level.INFO, "Los trending topics y top games se han enviado a la vista browser.jsp");

		} else {
			log.log(Level.WARNING, "No se han obtenido recursos en el controller");
			List<String> errores = new ArrayList<>();
			if (trends == null)
				errores.add("Fallo al obtener Trends de Twitter");
			if (games == null)
				errores.add("Fallo al obtener los Streams de Twitch");
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
