package com.parmahan.src.dao;

import java.util.List;

import com.parmahan.src.model.User;

public interface UserDao {
	User createUser(User user);

	User updateUser(String id, User user);

	void deleteUser(String id);

	List<User> getUsers();
}
