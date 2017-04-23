package ua.course.java.AddressBook.сontroller;

import java.util.Scanner;

import ua.course.java.AddressBook.view.View;

public class Utilities {
	private View view;
	private Scanner scanner;

	public Utilities(View view, Scanner scanner) {
		this.scanner = scanner;
		this.view = view;
	}

	public String checkAndGetStringWithRegex(String regex) {
		String value = scanner.next();
		while (!(value.matches(regex))) {
			view.printWrongInput();
			value = scanner.next();
		}
		return value;
	}

}
