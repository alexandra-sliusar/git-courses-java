package model;

import java.util.ResourceBundle;

public class EconomClassCoach extends Coach {
	public EconomClassCoach() {
		quantityOfCompartments = 10;
		compartmentPeopleCapacity = 6;
		baggageCapacityPerPerson = 0.6;
		pricePerPlace = 200;
	}

	public String getNameOfCoach(ResourceBundle bundle) {
		return bundle.getString("coach.economClassType");
	}
}
