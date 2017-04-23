package ua.course.java.AddressBook.сontroller;

import java.util.Scanner;

import ua.course.java.AddressBook.model.Model;
import ua.course.java.AddressBook.view.View;

public class Controller {

	private View view;
	private Model model;

	public Controller(View view, Model model) {

		this.view = view;
		this.model = model;
	}

	public void processUser() {
		Scanner scanner = new Scanner(System.in);
		Utilities utilities = new Utilities(view, scanner);
		ControllerNotebook contrNotebook = new ControllerNotebook(view, model, utilities);
		contrNotebook.setAllValues();
		contrNotebook.transferValuesIntoModel();
		view.printMessage(model.toString());
	}
}
