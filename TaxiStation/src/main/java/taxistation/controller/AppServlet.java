package taxistation.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import taxistation.controller.command.CommandFactory;

@WebServlet(urlPatterns = { "/taxistation/*" }, loadOnStartup = 0)
public class AppServlet extends HttpServlet {

	private static final Logger LOGGER = Logger.getLogger(AppServlet.class);
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*
		 * String commandKey =
		 * CommandKeyGenerator.generateCommandKeyFromRequest(request); String
		 * resultRedirectResource =
		 * CommandFactory.getCommand(commandKey).execute(request, response); if
		 * (!resultRedirectResource.contains(RedirectionManager.REDIRECTION)) {
		 * request.getRequestDispatcher(resultRedirectResource).forward(request,
		 * response); }
		 */

	}
}
