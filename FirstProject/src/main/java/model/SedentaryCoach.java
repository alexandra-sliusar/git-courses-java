package model;

import java.util.ResourceBundle;

public class SedentaryCoach extends Coach {
	public SedentaryCoach() {
		quantityOfCompartments = 18;
		compartmentPeopleCapacity = 4;
		baggageCapacityPerPerson = 0.2;
		pricePerPlace = 130;
	}

	public String getNameOfCoach(ResourceBundle bundle) {
		return bundle.getString("coach.sedentaryType");
	}
}
