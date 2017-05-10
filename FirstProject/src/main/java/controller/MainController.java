package controller;

import java.util.ResourceBundle;

import main.GlobalConstants;
import model.Coach;
import model.CoachSelector;
import model.Train;
import view.Printer;

public class MainController {

	ScannerController scannerController;
	Printer printer;
	Train train;
	boolean ifExit;

	public MainController(ScannerController scannerController) {
		this.scannerController = scannerController;
		this.printer = new Printer();
		this.train = new Train();
		this.ifExit = false;
	}

	public void processUser() {
		while (!ifExit) {
			processStartMenu();
		}
	}

	private void processStartMenu() {
		printer.printStartMenu();
		String choice = scannerController.handleScanning(GlobalConstants.DIGIT_REGEX, printer);
		handleStartMenuChoice(Integer.parseInt(choice));
	}

	private void handleStartMenuChoice(int choice) {
		switch (choice) {
		case (1): {
			processAddCoach();
			break;
		}
		case (2): {
			processPrintTrain(this.train);
			break;
		}
		case (3): {
			printer.printAmountOfPassengers(train);
			break;
		}
		case (4): {
			printer.printAmountOfBaggage(train);
			break;
		}
		case (5): {
			processPrintTrain(train.sortCoaches());
			break;
		}
		case (6): {
			processFilterTrain();
			break;
		}
		case (7): {
			train.removeAllCoaches();
			printer.printDeleteCoachesInfo();
			break;
		}
		case (8): {
			processLanguageChange();
			break;
		}
		case (0): {
			printer.printBye();
			ifExit = true;
			break;
		}
		default: {
			printer.printWrongChoiceMessage();
		}
		}
	}

	private void processPrintTrain(Train train) {
		if (train.getCoaches().isEmpty()) {
			printer.printEmptyTrainInfo();
		} else {
			printer.printTrain(train);
		}
	}

	private void processAddCoach() {
		printer.printAddCoachMenu();
		String value = scannerController.handleScanning(GlobalConstants.DIGIT_REGEX, printer);
		handleAddCoachMenuChoice(Integer.parseInt(value));
	}

	private void handleAddCoachMenuChoice(int choice) {
		if (choice == 0)
			return;
		Coach newCoach = CoachSelector.getInstance().getCoach(choice);
		if (newCoach != null) {
			train.addCoach(newCoach);
		} else {
			printer.printWrongChoiceMessage();
		}

	}

	private void processLanguageChange() {
		printer.printLanguageMenu();
		String choice = scannerController.handleScanning(GlobalConstants.DIGIT_REGEX, printer);
		handleLanguageChoice(Integer.parseInt(choice));
	}

	private void handleLanguageChoice(int choice) {
		switch (choice) {
		case (1): {
			printer.setBundle(ResourceBundle.getBundle("resourceBundle", LanguageController.ENGLISH.getLocale()));
			break;
		}
		case (2): {
			printer.setBundle(ResourceBundle.getBundle("resourceBundle", LanguageController.RUSSIAN.getLocale()));
			break;
		}
		case (0): {
			break;
		}
		default: {
			printer.printWrongChoiceMessage();
		}
		}
	}

	private void processFilterTrain() {
		printer.printEnterFirstValueInfo();
		int firstValue = Integer.parseInt(scannerController.handleScanning(GlobalConstants.DIGIT_REGEX, printer));
		printer.printEnterSecondValueInfo();
		int secondValue = Integer.parseInt(scannerController.handleScanning(GlobalConstants.DIGIT_REGEX, printer));
		processPrintTrain(train.getCoachesWithPlacesBetweenValues(firstValue, secondValue));
	}

}
