package model;

public class CoachSelector {
	private static CoachSelector coachSelector;

	private CoachSelector() {
	}

	public static CoachSelector getInstance() {
		if (coachSelector == null)
			coachSelector = new CoachSelector();
		return coachSelector;
	}

	public Coach getCoach(int choice) {
		switch (choice) {
		case (1): {
			return new EconomClassCoach();
		}
		case (2): {
			return new CoupeCoach();
		}
		case (3): {
			return new SleeperCoach();
		}
		case (4): {
			return new LuxuryCoach();
		}
		case (5): {
			return new SedentaryCoach();
		}
		}
		return null;
	}
}
