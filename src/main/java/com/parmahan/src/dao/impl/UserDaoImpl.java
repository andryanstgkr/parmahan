package com.parmahan.src.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.parmahan.src.dao.UserDao;
import com.parmahan.src.model.User;

public class UserDaoImpl implements UserDao{

	@Override
	public User createUser(User user) {
		return user;
	}

	@Override
	public User updateUser(String id, User user) {
		
		return user;
	}

	@Override
	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getUsers() {
		List<User> users = new ArrayList<>();
		User user = new User();
		user.setId("123456789");
		user.setFirstName("Andryan");
		user.setLastName("Situngkir");
		user.setActive(true);
		user.setEmail("and.dryan@gmail.com");
		user.setInsertedAt(new Date());
		user.setUpdatedAt(new Date());
		users.add(user);
		return users;
	}

}
