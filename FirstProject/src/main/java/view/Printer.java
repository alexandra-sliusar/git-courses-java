package view;

import java.util.ResourceBundle;

import main.GlobalConstants;
import model.Coach;
import model.Train;

public class Printer {
	ResourceBundle bundle = ResourceBundle.getBundle("resourceBundle");

	public void setBundle(ResourceBundle bundle) {
		this.bundle = bundle;
	}

	private void printMessage(String message) {
		System.out.println(message);
	}

	public void printStartMenu() {
		printMessage(bundle.getString("startmenu.chooseoption"));
		printMessage(bundle.getString("startmenu.addcoach"));
		printMessage(bundle.getString("startmenu.showtrain"));
		printMessage(bundle.getString("startmenu.counttotalpassengers"));
		printMessage(bundle.getString("startmenu.counttotalbaggage"));
		printMessage(bundle.getString("startmenu.showsortedtrain"));
		printMessage(bundle.getString("startmenu.showfilteredtrain"));
		printMessage(bundle.getString("startmenu.cleartrain"));
		printMessage(bundle.getString("startmenu.changelang"));
		printMessage(GlobalConstants.SPACE_SYMBOL);
		printMessage(bundle.getString("startmenu.exit"));
		printMessage(GlobalConstants.SPACE_SYMBOL);
	}

	public void printAddCoachMenu() {
		printMessage(bundle.getString("addcoachmenu.chooseoption"));
		printMessage(bundle.getString("addcoachmenu.economclass"));
		printMessage(bundle.getString("addcoachmenu.coupe"));
		printMessage(bundle.getString("addcoachmenu.sleeper"));
		printMessage(bundle.getString("addcoachmenu.luxury"));
		printMessage(bundle.getString("addcoachmenu.sedentary"));
		printMessage(GlobalConstants.SPACE_SYMBOL);
		printMessage(bundle.getString("menus.backtomenu"));
		printMessage(GlobalConstants.SPACE_SYMBOL);
	}

	public void printLanguageMenu() {
		printMessage(bundle.getString("languagemenu.chooseoption"));
		printMessage(bundle.getString("languagemenu.english"));
		printMessage(bundle.getString("languagemenu.russian"));
		printMessage(GlobalConstants.SPACE_SYMBOL);
		printMessage(bundle.getString("menus.backtomenu"));
		printMessage(GlobalConstants.SPACE_SYMBOL);
	}

	public void printWrongChoiceMessage() {
		printMessage(bundle.getString("menus.wrongoption"));
	}

	public void printWrongDataMessage() {
		printMessage(bundle.getString("menus.wrongdata") + GlobalConstants.SPACE_SYMBOL
				+ bundle.getString("menus.tryagain"));
	}

	public void printTrain(Train train) {
		printMessage(bundle.getString("info.printtrain"));
		printMessage(GlobalConstants.SPACE_SYMBOL);
		for (Coach c : train.getCoaches()) {
			printCoach(c);
		}
	}

	public void printCoach(Coach c) {
		printMessage(bundle.getString("coach.type") + GlobalConstants.SPACE_SYMBOL + c.getNameOfCoach(bundle));
		printMessage(bundle.getString("coach.countOfPassengers") + GlobalConstants.SPACE_SYMBOL + c.countPassengers());
		printMessage(bundle.getString("coach.baggagePerPerson") + GlobalConstants.SPACE_SYMBOL
				+ c.getBaggageCapacityPerPerson());
		printMessage(bundle.getString("coach.priceperplace") + GlobalConstants.SPACE_SYMBOL + c.getPricePerPlace());
		printMessage(GlobalConstants.SPACE_SYMBOL);
	}

	public void printEmptyTrainInfo() {
		printMessage(bundle.getString("info.trainisempty"));
		printMessage(GlobalConstants.SPACE_SYMBOL);
	}

	public void printAmountOfPassengers(Train train) {
		printMessage(bundle.getString("info.totalamountofpassengers") + GlobalConstants.SPACE_SYMBOL
				+ train.getTotalAmountOfPassengers());
		printMessage(GlobalConstants.SPACE_SYMBOL);
	}

	public void printAmountOfBaggage(Train train) {
		printMessage(bundle.getString("info.totalamountofbaggage") + GlobalConstants.SPACE_SYMBOL
				+ train.getTotalAmountOfBaggage());
		printMessage(GlobalConstants.SPACE_SYMBOL);
	}

	public void printDeleteCoachesInfo() {
		printMessage(bundle.getString("info.deletecoaches"));
		printMessage(GlobalConstants.SPACE_SYMBOL);
	}

	public void printBye() {
		printMessage(bundle.getString("info.bye"));
	}

	public void printEnterFirstValueInfo() {
		printMessage(bundle.getString("getvalues.firstvalue"));
	}

	public void printEnterSecondValueInfo() {
		printMessage(bundle.getString("getvalues.secondvalue"));
	}

}
