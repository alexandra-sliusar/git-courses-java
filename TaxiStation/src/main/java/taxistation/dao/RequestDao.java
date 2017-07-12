package taxistation.dao;

import java.util.List;

import taxistation.entity.Request;
import taxistation.entity.enums.CarCharacteristics;
import taxistation.entity.enums.RequestStatus;

public interface RequestDao extends GenericDao<Request>, AutoCloseable {

	public List<Request> getRequestsByStatus(RequestStatus requestStatus);

	public List<CarCharacteristics> getCarCharacteristicsByRequestId(Long requestId);

	void close();

}
