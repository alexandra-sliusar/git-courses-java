package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Train {
	List<Coach> coaches = new ArrayList<Coach>();

	public boolean addCoach(Coach coach) {
		return coaches.add(coach);
	}

	public List<Coach> getCoaches() {
		return coaches;
	}

	private Train setCoaches(List<Coach> coaches) {
		this.coaches.addAll(coaches);
		return this;
	}

	public void removeAllCoaches() {
		coaches.clear();
	}

	public Train sortCoaches() {
		List<Coach> sortedCoaches = coaches.stream().sorted(Comparator.comparing(Coach::getPricePerPlace))
				.collect(Collectors.toList());
		return new Train().setCoaches(sortedCoaches);
	}

	public Train getCoachesWithPlacesBetweenValues(int firstValue, int secondValue) {
		List<Coach> filteredCoaches = coaches.stream()
				.filter(coach -> coach.ifPassengersBetweenValues(firstValue, secondValue) == true)
				.collect(Collectors.toList());
		return new Train().setCoaches(filteredCoaches);
	}

	public int getTotalAmountOfPassengers() {
		int amount = 0;
		for (Coach c : coaches) {
			amount += c.countPassengers();
		}
		return amount;
	}

	public double getTotalAmountOfBaggage() {
		double amount = 0;
		for (Coach c : coaches) {
			amount += c.countBaggage();
		}
		return amount;
	}

}
