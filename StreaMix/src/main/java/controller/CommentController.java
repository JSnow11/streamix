package controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.resources.ComentsResource;

public class CommentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(CommentController.class.getName());

	public CommentController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.log(Level.INFO, "COMMENTCONTROLLER - Posteo de comentarios ...");
		String accessToken = (String) request.getSession().getAttribute("Youtube-token");
		String pickedTopic = request.getParameter("pickedTopic");
		String videoID = request.getParameter("videoID");
		String content = request.getParameter("comentario");

		if (pickedTopic == null) {
			pickedTopic = (String) request.getSession().getAttribute("pickedTopic");
			videoID = (String) request.getSession().getAttribute("videoID");
			content = (String) request.getSession().getAttribute("content");
		}

		log.log(Level.INFO, "Parametros para el comentario obtenidos: ");
		System.out.println("aT: " + accessToken + ",\n" + " vID: " + videoID + ",\n" + " c: " + content + ",\n"
				+ " pT: " + pickedTopic);

		if (accessToken != null && !"".equals(accessToken)) {
			if (videoID != null && !"".equals(videoID)) {
				log.log(Level.INFO, "Posteando el comentario: ");

				ComentsResource coR = new ComentsResource(accessToken);
				coR.postComents(videoID, content);
				request.setAttribute("videoID", videoID);
				request.setAttribute("pickedTopic", pickedTopic);
				request.getRequestDispatcher("/view").forward(request, response);
			} else {
				log.log(Level.INFO, "Comentario no válido");
				request.setAttribute("videoId", videoID);
				request.setAttribute("pickedTopic", pickedTopic);
				request.getRequestDispatcher("/view").forward(request, response);
			}
		} else {
			request.getSession().setAttribute("content", content);
			request.getSession().setAttribute("videoID", videoID);
			request.getSession().setAttribute("pickedTopic", pickedTopic);
			log.log(Level.INFO, "Se requiere autentificación, se procede con oauth, Identifiquese.");
			request.getRequestDispatcher("/AuthController/Youtube").forward(request, response);
		}
	}

}
