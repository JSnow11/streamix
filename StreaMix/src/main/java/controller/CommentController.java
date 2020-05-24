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
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String accessToken = (String) request.getSession().getAttribute("Youtube-token");
		String videoId = request.getParameter("videoID");
		String content = request.getParameter("comentario");
		String pickedTopic = request.getParameter("pickedTopic");
		System.out.println(accessToken + ", " + videoId + ", " + content + pickedTopic);

		if (accessToken != null && !"".equals(accessToken)) {
			if (videoId != null && !"".equals(videoId)) {
				log.info("Posting");
				System.out.println(pickedTopic);
				System.out.println(videoId);
				ComentsResource coR = new ComentsResource(accessToken);
				if(content == null) content = (String) request.getSession().getAttribute("content");
				if(pickedTopic == null) content = (String) request.getSession().getAttribute("pickedTopic");
				coR.postComents(videoId, content);
				request.setAttribute("videoID", videoId);
				request.setAttribute("pickedTopic", pickedTopic);
				request.getRequestDispatcher("/view").forward(request, response);
			} else {
				log.info("Invalid comment going back to trends");
				request.getRequestDispatcher("/trends").forward(request, response);
			}
		} else {
			log.info("Trying to access YT without an access token, redirecting to OAuth servlet");
			request.getRequestDispatcher("/AuthController/Youtube").forward(request, response);
		}
	}

}
