package ua.taxistation.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.taxistation.controller.command.Command;
import ua.taxistation.controller.command.CommandFactory;
import ua.taxistation.exceptions.ServerAppException;

@WebServlet("/taxistation")
public class Taxistation extends HttpServlet {

	// private static final Logger LOGGER = Logger.getLogger(Taxistation.class);
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
		Command command = CommandFactory.getCommand(request);
		try {
			String resultPath = command.execute(request, response);
			System.out.println(resultPath);
			// request.getRequestDispatcher(resultPath).forward(request,
			// response);
			request.getRequestDispatcher("/WEB-INF/pages/allRequests.jsp").forward(request, response);
		} catch (ServerAppException e) {

		}
		System.out.println(request.getMethod());
		System.out.println(request.getRequestURI());
		/*
		 * response.setContentType("text/html"); PrintWriter out =
		 * response.getWriter(); out.println("<title>Example</title>" +
		 * "<body bgcolor=DCD1CA>");
		 * 
		 * out.println("<div><color=FFFFFF>Hello</color></div>");
		 * out.println("<a href=./index.jsp>Return</a>");
		 */
		// getServletContext().getRequestDispatcher("/index.jsp").forward(request,
		// response);

	}
}
