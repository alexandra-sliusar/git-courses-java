package taxistation.controller;

import java.util.HashSet;
import java.util.Set;

import taxistation.entity.enums.CarCharacteristics;

public class RequestDto {
	private String pickup;
	private String destination;
	private Set<CarCharacteristics> carCharacteristics = new HashSet<>();

	public RequestDto() {

	}

	public RequestDto(String pickup, String destination, Set<CarCharacteristics> carCharacteristics) {
		super();
		this.pickup = pickup;
		this.destination = destination;
		this.carCharacteristics = carCharacteristics;
	}

	public String getPickup() {
		return pickup;
	}

	public void setPickup(String pickup) {
		this.pickup = pickup;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Set<CarCharacteristics> getCarCharacteristics() {
		return carCharacteristics;
	}

	public void setCarCharacteristics(Set<CarCharacteristics> carCharacteristics) {
		this.carCharacteristics = carCharacteristics;
	}

	@Override
	public String toString() {
		return "RequestDto [pickup=" + pickup + ", destination=" + destination + ", carCharacteristics="
				+ carCharacteristics + "]";
	}

}
