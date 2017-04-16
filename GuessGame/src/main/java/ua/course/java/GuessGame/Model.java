package ua.course.java.GuessGame;

import java.util.ArrayList;
import java.util.Random;

public class Model {
	private int maxValue;
	private int minValue;
	private int secretValue;
	private ArrayList<Integer> guesses = new ArrayList();

	public void setBounds(int minValue, int maxValue) {
		if (minValue < maxValue) {
			setMinValue(minValue);
			setMaxValue(maxValue);
		} else {
			setMaxValue(minValue);
			setMinValue(maxValue);
		}
	}

	public boolean inBounds(int value) {
		if ((value >= minValue) && (value <= maxValue)) {
			return true;
		}
		return false;
	}

	public int rand(int min, int max) {
		Random rand = new Random();
		if (max > min)
			return rand.nextInt(max - min + 1) + min;
		else
			return rand.nextInt(min - max + 1) + max;
	}

	public void addGuessInGuessesList(int newValue) {
		guesses.add(newValue);
	}

	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

	public int getMinValue() {
		return minValue;
	}

	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}

	public int getSecretValue() {
		return secretValue;
	}

	public void setSecretValue() {
		secretValue = rand(minValue, maxValue);
	}

	public ArrayList<Integer> getGuesses() {
		return guesses;
	}

	public String toString() {
		return guesses.toString();
	}

}
