package taxistation.locale;

import java.util.Locale;
import java.util.ResourceBundle;

public final class LocaleManager {
	private LocaleManager() {
	}

	public static final String MESSAGES_BUNDLE_NAME = "/i18n/messages";

	// default Locale
	public static ResourceBundle BUNDLE = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("en", "GB"));

	public static void setResourceBundleLocale(Locale locale) {
		BUNDLE = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, locale);
	}

	// all from messages
	public static String LOGGED_IN_AS = "library.loggedIn";

}
