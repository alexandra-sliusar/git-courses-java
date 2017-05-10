package controller;

import java.util.Locale;

public enum LanguageController {
	ENGLISH(new Locale("en", "US")), RUSSIAN(new Locale("ru", "RU"));

	private final Locale locale;

	private LanguageController(final Locale locale) {
		this.locale = locale;
	}

	public Locale getLocale() {
		return locale;
	}

}
