package controller;

import java.io.IOException;
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
		String accessToken = (String) request.getSession().getAttribute("Youtube-token");
		String pickedTopic = request.getParameter("pickedTopic");
		String videoID = request.getParameter("videoID");
		String content = request.getParameter("comentario");
		if (pickedTopic == null) {
			pickedTopic = (String) request.getSession().getAttribute("pickedTopic");
			videoID = (String) request.getSession().getAttribute("videoID");
			content = (String) request.getSession().getAttribute("content");
		}
		System.out.println(accessToken + ", " + videoID + ", " + content + pickedTopic);

		if (accessToken != null && !"".equals(accessToken)) {
			if (videoID != null && !"".equals(videoID)) {
				log.info("Posting");
				System.out.println(pickedTopic);
				System.out.println(videoID);
				ComentsResource coR = new ComentsResource(accessToken);
				coR.postComents(videoID, content);
				request.setAttribute("videoID", videoID);
				request.setAttribute("pickedTopic", pickedTopic);
				request.getRequestDispatcher("/view").forward(request, response);
			} else {
				log.info("Invalid comment");
				request.setAttribute("message", "You must provide a valid title for file");
				request.setAttribute("content", content);
				request.setAttribute("videoId", videoID);
				request.setAttribute("pickedTopic", pickedTopic);
				request.getRequestDispatcher("/trends").forward(request, response);
			}
		} else {
			request.getSession().setAttribute("content", content);
			request.getSession().setAttribute("videoID", videoID);
			request.getSession().setAttribute("pickedTopic", pickedTopic);
			log.info("Trying to access YT without an access token, redirecting to OAuth servlet");
			request.getRequestDispatcher("/AuthController/Youtube").forward(request, response);
		}
	}

}
