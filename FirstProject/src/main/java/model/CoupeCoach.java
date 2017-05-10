package model;

import java.util.ResourceBundle;

public class CoupeCoach extends Coach {
	public CoupeCoach() {
		quantityOfCompartments = 10;
		compartmentPeopleCapacity = 4;
		baggageCapacityPerPerson = 1;
		pricePerPlace = 320;
	}

	public String getNameOfCoach(ResourceBundle bundle) {
		return bundle.getString("coach.coupeType");
	}
}
