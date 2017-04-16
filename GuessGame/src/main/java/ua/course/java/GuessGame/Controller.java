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
		Scanner sc = new Scanner(System.in);
		startGame();
		playGame(sc);

	}

	public void startGame() {
		model.setBounds(Constants.MIN_VALUE, Constants.MAX_VALUE);
		model.setSecretValue();
		view.printGameIsOn();
	}

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

}
