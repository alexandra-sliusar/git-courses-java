package controller;

import java.util.Scanner;

import view.Printer;

public class ScannerController {
	Scanner scanner;

	public ScannerController(Scanner scanner) {
		this.scanner = scanner;
	}

	public String handleScanning(String regex, Printer printer) {
		String value = scanner.next();
		while (!checkWithRegex(value, regex)) {
			printer.printWrongDataMessage();
			value = scanner.next();
		}
		return value;
	}

	private boolean checkWithRegex(String string, String regex) {
		return string.matches(regex);
	}

}
