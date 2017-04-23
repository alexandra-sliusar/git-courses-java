package ua.course.java.AddressBook;

import ua.course.java.AddressBook.model.Model;
import ua.course.java.AddressBook.view.View;
import ua.course.java.AddressBook.сontroller.Controller;

public class App {
	public static void main(String[] args) {
		Model model = new Model();
		View view = new View();
		Controller controller = new Controller(view, model);
		controller.processUser();
	}
}
