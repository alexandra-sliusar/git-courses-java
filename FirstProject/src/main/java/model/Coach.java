package model;

import java.util.ResourceBundle;

public abstract class Coach {
	protected int quantityOfCompartments;
	protected int compartmentPeopleCapacity;
	protected double baggageCapacityPerPerson;
	protected double pricePerPlace;

	public int countPassengers() {
		return quantityOfCompartments * compartmentPeopleCapacity;
	}

	public double countBaggage() {
		return baggageCapacityPerPerson * countPassengers();
	}

	public boolean ifPassengersBetweenValues(int moreThan, int lessThan) {
		if (moreThan > lessThan) {
			int temp = moreThan;
			moreThan = lessThan;
			lessThan = temp;
		}
		if ((countPassengers() >= moreThan) && (countPassengers() <= lessThan))
			return true;
		return false;
	}

	public double getPricePerPlace() {
		return pricePerPlace;
	}

	public double getBaggageCapacityPerPerson() {
		return baggageCapacityPerPerson;
	}

	public abstract String getNameOfCoach(ResourceBundle bundle);

}
