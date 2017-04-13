package ua.course.java;

public class View {
	static String WRONG_INPUT = "Wrong input, try again! ";
	static String ASK_INPUT = "Please, write message! ";
	static String APPLY_INPUT = "Your answer is right!";
	static String OUTPUT_LINE = "Our message: ";

	public void printMessage(String message) {
		System.out.println(message);
	}

	public void printMessageAndValue(String message, String value) {
		System.out.println(message + value);
	}
}
