package taxistation.dao;

import java.util.Optional;

import taxistation.entity.User;

public interface UserDao extends GenericDao<User>, AutoCloseable {
	public Optional<User> getUserByLogin(String login);

	void close();
}
