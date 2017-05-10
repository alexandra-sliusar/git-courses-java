package main;

import java.util.Scanner;

import controller.MainController;
import controller.ScannerController;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ScannerController sc = new ScannerController(scanner);
		MainController controller = new MainController(sc);
		controller.processUser();
	}

}
