package ua.taxistation.controller.command;

import javax.servlet.http.HttpServletRequest;

public class CommandFactory {

	private static String CONTROLLER_PATH = ".*/taxistation/";
	private static String REPLACEMENT = "";

	public static String extractKeyFromRequest(HttpServletRequest request) {
		return request.getRequestURI().replaceAll(CONTROLLER_PATH, REPLACEMENT);
	}

	public static Command getCommand(HttpServletRequest request) {
		String key = extractKeyFromRequest(request);
		return CommandEnum.getCommand(key);
	}

}
