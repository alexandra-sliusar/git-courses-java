package taxistation.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import taxistation.dao.CarDao;
import taxistation.dao.DaoConnection;
import taxistation.dao.DaoFactory;
import taxistation.dao.OrderDao;
import taxistation.dao.RequestDao;
import taxistation.entity.Car;
import taxistation.entity.Order;
import taxistation.entity.Request;
import taxistation.entity.User;
import taxistation.entity.enums.CarStatus;
import taxistation.entity.enums.OrderStatus;
import taxistation.entity.enums.RequestStatus;
import taxistation.exceptions.ServerAppException;

public class OrderService {

	private static final Logger LOGGER = LogManager.getLogger(UserService.class);

	private DaoFactory daoFactory;

	OrderService(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	private static class Holder {
		static final OrderService INSTANCE = new OrderService(DaoFactory.getDaoFactory());
	}

	public static OrderService getInstance() {
		return Holder.INSTANCE;
	}

	public List<Order> getOrdersByStatus(OrderStatus orderStatus) {
		List<Order> orders = new ArrayList<>();
		try (OrderDao orderDao = daoFactory.createOrderDao()) {
			orders.addAll(orderDao.getOrdersByStatus(orderStatus));
		}
		return orders;
	}

	public List<Order> getOrdersByUser(User user) {
		List<Order> orders = new ArrayList<>();
		try (OrderDao orderDao = daoFactory.createOrderDao()) {
			orders.addAll(orderDao.getOrdersByUserId(user.getId()));
		}
		return orders;
	}

	public Order createOrder(Request request, Car car) {
		try (DaoConnection connection = daoFactory.getConnection()) {
			connection.begin();
			OrderDao orderDao = daoFactory.createOrderDao(connection);
			RequestDao requestDao = daoFactory.createRequestDao(connection);
			CarDao carDao = daoFactory.createCarDao(connection);
			Order order = new Order.Builder().setCar(car).setRequest(request).setOrderStatus(OrderStatus.INCOMPLETE)
					.build();
			orderDao.create(order);
			request.setRequestStatus(RequestStatus.PROCESSED);
			car.setCarStatus(CarStatus.UNAVAILABLE);
			requestDao.update(request);
			carDao.update(car);
			connection.commit();
			return order;
		}
	}

	public void updateOrder(Order order) {
		try (DaoConnection connection = daoFactory.getConnection()) {
			connection.begin();
			OrderDao orderDao = daoFactory.createOrderDao(connection);
			CarDao carDao = daoFactory.createCarDao(connection);

			order.getCar().setCarStatus(CarStatus.AVAILABLE);
			orderDao.update(order);
			carDao.update(order.getCar());

			connection.commit();
		}
	}

	public Order getLastCarOrder(Car car) {
		try (OrderDao orderDao = daoFactory.createOrderDao()) {
			Optional<Order> order = orderDao.getLastCarOrder(car.getId());
			isOrderExist(order);
			return order.get();
		} catch (Exception e) {
			LOGGER.error("Getting last order of car " + car.getId() + " has failed", e);
			throw new ServerAppException("Getting last order of car " + car.getId() + " has failed");
		}
	}

	private void isOrderExist(Optional<Order> order) throws ServerAppException {
		if (!order.isPresent())
			throw new ServerAppException("Order doesn`t exist");
	}

}
