package model;

import java.util.ResourceBundle;

public class SleeperCoach extends Coach {
	public SleeperCoach() {
		quantityOfCompartments = 6;
		compartmentPeopleCapacity = 2;
		baggageCapacityPerPerson = 2;
		pricePerPlace = 600;
	}

	public String getNameOfCoach(ResourceBundle bundle) {
		return bundle.getString("coach.sleeperType");
	}
}
