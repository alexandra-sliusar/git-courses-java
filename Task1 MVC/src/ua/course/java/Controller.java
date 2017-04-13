package ua.course.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
	static String HELLO_REGEX = "[Hh]ello[, ]? ?";
	static String WORLD_REGEX = "[Ww]orld[! ]?";

	Model model;
	View view;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	public void processUser() {
		Scanner sc = new Scanner(System.in);
		model.setValue(inputStartOfSentence(sc));
		model.addValue(inputEndOfSentence(sc));

		view.printMessageAndValue(View.OUTPUT_LINE, model.getValue());
	}

	private String inputStartOfSentence(Scanner sc) {
		view.printMessage(View.ASK_INPUT);
		String resultNeeded;
		while (true) {
			resultNeeded = sc.nextLine();
			if (checkPattern(resultNeeded, HELLO_REGEX)) {
				view.printMessage(View.APPLY_INPUT);
				return resultNeeded;
			} else {
				view.printMessage(View.WRONG_INPUT);
			}
		}
	}

	private String inputEndOfSentence(Scanner sc) {
		view.printMessage(View.ASK_INPUT);
		String resultNeeded;
		while (true) {
			resultNeeded = sc.nextLine();
			if (checkPattern(resultNeeded, WORLD_REGEX)) {
				view.printMessage(View.APPLY_INPUT);
				return resultNeeded;
			} else {
				view.printMessage(View.WRONG_INPUT);
			}
		}
	}

	private boolean checkPattern(String message, String regex) {
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(message);
		return m.matches();
	}
}
