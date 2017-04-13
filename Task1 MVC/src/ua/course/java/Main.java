package ua.course.java;

public class Main {
	/*
	 * demonstration of MVC
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model model = new Model();
		View view = new View();
		Controller controller = new Controller(model, view);

		controller.processUser();
	}

}
