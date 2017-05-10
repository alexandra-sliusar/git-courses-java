package ua.course.java.FirstProject;

import java.util.Scanner;

import controller.ScannerController;
import junit.framework.TestCase;
import main.GlobalConstants;

public class ScannerControllerTest extends TestCase {
	public ScannerController scannerController = new ScannerController(new Scanner(System.in));

	public void testCheckWithRegexAssertTrue() {
		assertTrue(scannerController.checkWithRegex("2394", GlobalConstants.DIGIT_REGEX));
	}

	public void testCheckWithRegexTwoDigitsWithSpace() {
		assertFalse(scannerController.checkWithRegex("23 23", GlobalConstants.DIGIT_REGEX));
	}

	public void testCheckWithRegexDigitThenSymbols() {
		assertFalse(scannerController.checkWithRegex("239fnf", GlobalConstants.DIGIT_REGEX));
	}

	public void testCheckWithRegexEmptyString() {
		assertFalse(scannerController.checkWithRegex("", GlobalConstants.DIGIT_REGEX));
	}

}
