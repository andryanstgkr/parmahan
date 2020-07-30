package com.parmahan.src.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.parmahan.src.dao.UserDao;
import com.parmahan.src.model.User;

public class UserDaoImpl implements UserDao{

	@Override
	public User create(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(String id, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
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

	@Override
	public User getDetail(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
