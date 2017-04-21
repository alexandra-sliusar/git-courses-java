package ua.course.java.GuessGame;

import java.util.Scanner;

public class Controller {

	Model model;
	View view;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	public void processUser() {
		// Scanner sc = new Scanner(System.in);
		// startGame();
		// playGame(sc);
		startGameWithEnum();
		playGameWithEnum();

	}

	/**
	 * Method that adjust model's fields to begin working with them and print
	 * information when ready
	 */
	public void startGame() {
		model.setBounds(Constants.MIN_VALUE, Constants.MAX_VALUE);
		model.setSecretValue();
		view.printGameIsOn();
	}

	/**
	 * Method gets your input and checks whether it is number or not After
	 * successful guessing prints congratulation message and your previous
	 * guesses
	 */
	public void playGame(Scanner sc) {
		view.printTryToGuessMessage(model);
		while (true) {
			while (!sc.hasNextInt()) {
				view.printWrongInputDataMessage(model);
				sc.nextLine();
			}
			if (checkGuess(Integer.parseInt(sc.nextLine()))) {
				break;
			}
		}
		view.printCongratulationsMessage(model);
		view.printUserGuesses(model);

	}

	/**
	 * Checks whether number is between min and max values if true - changes min
	 * or max value depending on secret value if false - prints message about it
	 */
	public boolean checkGuess(int guess) {
		model.addGuessInGuessesList(guess);
		if (guess == model.getSecretValue()) {
			return true;
		}
		if (model.inBounds(guess)) {
			if (guess > model.getSecretValue()) {
				model.setMaxValue(guess);
			} else {
				model.setMinValue(guess);
			}
			view.printTryToGuessMessage(model);
		} else {
			view.printWrongRangeDataMessage(model);
		}
		return false;
	}

	/**
	 * Method that adjust model's fields to begin working with enumeration and
	 * print information when ready
	 */
	public void startGameWithEnum() {
		model.setBounds(Constants.MIN_VALUE, Constants.MAX_VALUE);
		model.setExactSecretValue(69);
		view.printGameIsOn();
	}

	/**
	 * For all values in enum checks them till the enum ends or gets to secret
	 * value in enumeration
	 */
	public void playGameWithEnum() {
		view.printTryToGuessMessage(model);
		for (Guesses g : Guesses.values()) {
			view.printMessage(g.toString());
			if (checkGuess(g.getValue())) {
				break;
			}
		}
		view.printCongratulationsMessage(model);
		view.printUserGuesses(model);

	}

}

enum Guesses {
	Guess1(1), Guess2(4), Guess3(78), Guess4(96), Guess5(32), Guess6(55), Guess7(60), Guess8(74), Guess9(63), Guess10(
			69);

	private final int value;

	Guesses(final int newValue) {
		value = newValue;
	}

	public int getValue() {
		return value;
	}

	public String toString() {
		return String.valueOf(getValue());
	}
}
