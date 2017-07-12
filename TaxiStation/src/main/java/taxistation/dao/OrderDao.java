package taxistation.dao;

import java.util.List;
import java.util.Optional;

import taxistation.entity.Order;
import taxistation.entity.enums.OrderStatus;

public interface OrderDao extends GenericDao<Order>, AutoCloseable {
	public List<Order> getOrdersByStatus(OrderStatus orderStatus);

	public List<Order> getOrdersByUserId(Long userId);

	public Optional<Order> getLastCarOrder(Long carId);

	void close();

}
