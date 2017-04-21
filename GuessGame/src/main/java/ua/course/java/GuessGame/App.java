package ua.course.java.GuessGame;

public class App {
	public static void main(String[] args) {
		Model model = new Model();
		View view = new View();
		Controller controller = new Controller(model, view);
		controller.processUser();
	}
}
