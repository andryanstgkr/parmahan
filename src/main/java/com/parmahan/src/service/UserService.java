package com.parmahan.src.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.parmahan.src.model.User;

@Service
public interface UserService {
	User createUser(User user);

	User updateUser(String id, User user);

	void deleteUser(String id);

	List<User> getUsers();
}
