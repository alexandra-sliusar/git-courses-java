package ua.course.java.GuessGame;

public class View {
	static String WRONG_INPUT_DATA_MESSAGE = "Wrong input data!";
	static String WRONG_RANGE_DATA_MESSAGE = "Wrong range data!";
	static String TRY_AGAIN_MESSAGE = "Please, try again in range";
	static String GUESS_NUMBER_MESSAGE = "Try to guess number in range";
	static String CONGRATULATIONS_MESSAGE = "Congratulations! You guessed secret number";
	static String USER_GUESSES_MESSAGE = "Your tries:";
	static String GAME_IS_ON = "The game is on!";
	static String SPACE_SYMBOL = " ";
	static String L_BRACKET_SYMBOL = "[";
	static String R_BRACKET_SYMBOL = "]";
	static String ATTENTION_SYMBOL = "!";

	public void printGameIsOn() {
		printMessage(GAME_IS_ON);
	}

	public void printWrongInputDataMessage(Model m) {
		printMessage(WRONG_INPUT_DATA_MESSAGE + SPACE_SYMBOL + TRY_AGAIN_MESSAGE + SPACE_SYMBOL + L_BRACKET_SYMBOL
				+ m.getMinValue() + SPACE_SYMBOL + m.getMaxValue() + R_BRACKET_SYMBOL + ATTENTION_SYMBOL);
	}

	public void printWrongRangeDataMessage(Model m) {
		printMessage(WRONG_RANGE_DATA_MESSAGE + SPACE_SYMBOL + TRY_AGAIN_MESSAGE + SPACE_SYMBOL + L_BRACKET_SYMBOL
				+ m.getMinValue() + SPACE_SYMBOL + m.getMaxValue() + R_BRACKET_SYMBOL + ATTENTION_SYMBOL);
	}

	public void printTryToGuessMessage(Model m) {
		printMessage(GUESS_NUMBER_MESSAGE + SPACE_SYMBOL + L_BRACKET_SYMBOL + m.getMinValue() + SPACE_SYMBOL
				+ m.getMaxValue() + R_BRACKET_SYMBOL + ATTENTION_SYMBOL);
	}

	public void printCongratulationsMessage(Model m) {
		printMessage(CONGRATULATIONS_MESSAGE + SPACE_SYMBOL + m.getSecretValue() + ATTENTION_SYMBOL);
	}

	public void printUserGuesses(Model m) {
		printMessage(USER_GUESSES_MESSAGE + SPACE_SYMBOL + m.toString());
	}

	public void printMessage(String message) {
		System.out.println(message);
	}
}
