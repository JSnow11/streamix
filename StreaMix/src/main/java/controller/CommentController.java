package controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.resources.ComentsResource;
import model.resources.TweetsResource;

/**
 * Servlet implementation class CommentController
 */
public class CommentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(CommentController.class.getName());
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accessToken = (String) request.getSession().getAttribute("Youtube-token");
        String videoId = request.getParameter("videoID");
        String content = request.getParameter("comentario");
        String pickedTopic = request.getParameter("pickedTopic");
         
        if (accessToken != null && !"".equals(accessToken)) {
            if (videoId != null && !"".equals(videoId)) {
                ComentsResource coR = new ComentsResource(accessToken);
                coR.postComents(videoId, content);
                request.setAttribute("videoId", videoId);
                request.setAttribute("pickedTopic", pickedTopic);
                request.getRequestDispatcher("/view").forward(request, response);
            } else {
                request.setAttribute("message", "You must provide a valid title for file");
                request.setAttribute("content", content);
                request.setAttribute("videoId", videoId);
                request.setAttribute("pickedTopic", pickedTopic);
                request.getRequestDispatcher("/view").forward(request, response);
            }
        } else {
            log.info("Trying to access YT without an access token, redirecting to OAuth servlet");
            request.getRequestDispatcher("/AuthController/Youtube").forward(request, response);
        }
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
