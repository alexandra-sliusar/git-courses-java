package taxistation.dao;

import java.util.List;
import java.util.Optional;

import taxistation.entity.Car;
import taxistation.entity.enums.CarCharacteristics;
import taxistation.entity.enums.CarStatus;

public interface CarDao extends GenericDao<Car>, AutoCloseable {
	public List<Car> getCarsByCharacteristicAndStatus(CarCharacteristics characteristics, CarStatus carStatus);

	public Optional<Car> getCarByDriver(Long driverId);

	public List<CarCharacteristics> getCarCharacteristicsByCarId(Long carId);

	void close();
}
