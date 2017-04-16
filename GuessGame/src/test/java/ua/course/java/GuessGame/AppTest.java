package ua.course.java.GuessGame;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

	public void testSetBoundsZeroAndOne() {
		Model model = new Model();
		model.setBounds(0, 1);
		assertTrue(model.getMinValue() < model.getMaxValue());
	}

	public void testSetBoundsOneAndZero() {
		Model model = new Model();
		model.setBounds(1, 0);
		assertTrue(model.getMinValue() < model.getMaxValue());
	}

	public void testInBoundsFifty() {
		Model model = new Model();
		model.setBounds(0, 100);
		assertTrue(model.inBounds(50));
	}

	public void testInBoundsMinusFifty() {
		Model model = new Model();
		model.setBounds(0, 100);
		assertFalse(model.inBounds(-50));
	}

	public void testSecretValueInBoundsUsingRandFunction() {
		Model model = new Model();
		model.setBounds(0, 100);
		model.setSecretValue();
		assertTrue(model.inBounds(model.getSecretValue()));
	}

	public void testRandFunctionWithEqualBounds() {
		Model model = new Model();
		model.setBounds(0, 0);
		assertTrue(model.inBounds(model.rand(model.getMinValue(), model.getMaxValue())));
	}
}
