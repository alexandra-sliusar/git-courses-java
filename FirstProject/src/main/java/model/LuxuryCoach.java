package model;

import java.util.ResourceBundle;

public class LuxuryCoach extends Coach {
	public LuxuryCoach() {
		quantityOfCompartments = 6;
		compartmentPeopleCapacity = 2;
		baggageCapacityPerPerson = 3;
		pricePerPlace = 800;
	}

	public String getNameOfCoach(ResourceBundle bundle) {
		return bundle.getString("coach.luxuryType");
	}
}
