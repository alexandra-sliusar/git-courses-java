package taxistation.services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import taxistation.controller.dto.RequestDto;
import taxistation.dao.DaoConnection;
import taxistation.dao.DaoFactory;
import taxistation.dao.RequestDao;
import taxistation.entity.Request;
import taxistation.entity.User;
import taxistation.entity.enums.CarCharacteristics;
import taxistation.entity.enums.RequestStatus;

public class RequestService {

	private static final Logger LOGGER = LogManager.getLogger(UserService.class);

	private DaoFactory daoFactory;

	RequestService(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	private static class Holder {
		static final RequestService INSTANCE = new RequestService(DaoFactory.getDaoFactory());
	}

	public static RequestService getInstance() {
		return Holder.INSTANCE;
	}

	public List<Request> getUnprocessedRequests() {
		List<Request> requests = new ArrayList<>();
		try (DaoConnection connection = daoFactory.getConnection()) {
			connection.begin();
			RequestDao requestDao = daoFactory.createRequestDao(connection);
			requests.addAll(requestDao.getRequestsByStatus(RequestStatus.UNPROCESSED));
			connection.commit();
		}
		return requests;
	}

	public void updateRequestStatus(Request request) {
		try (RequestDao requestDao = daoFactory.createRequestDao()) {
			requestDao.update(request);
		}
	}

	public Request createRequest(RequestDto requestDto, User client) {
		String pickup = requestDto.getPickup();
		String destination = requestDto.getDestination();
		Set<CarCharacteristics> carCharacteristics = requestDto.getCarCharacteristics();

		try (RequestDao requestDao = daoFactory.createRequestDao()) {
			Request request = new Request.Builder().setUser(client).setDateOfRequest(LocalDateTime.now())
					.setPickup(pickup).setDestination(destination).setCarCharacteristics(carCharacteristics)
					.setRequestStatus(RequestStatus.UNPROCESSED).build();
			requestDao.create(request);
			return request;
		}
	}
}
