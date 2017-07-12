package taxistation.controller.utils;

import javax.servlet.http.HttpSession;

import taxistation.entity.User;

public class SessionManager {

	public static boolean isUserLoggedIn(HttpSession session) {
		return session.getAttribute(Attribute.USER) != null;
	}

	public static void addUserToSession(HttpSession session, User user) {
		session.setAttribute(Attribute.USER, user);
	}

	public static User getUserFromSession(HttpSession session) {
		return (User) session.getAttribute(Attribute.USER);
	}

	public static void invalidateSession(HttpSession session) {
		session.invalidate();
	}
}
