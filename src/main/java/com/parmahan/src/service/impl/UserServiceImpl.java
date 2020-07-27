package com.parmahan.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parmahan.src.dao.UserDao;
import com.parmahan.src.model.User;
import com.parmahan.src.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	@Override
	public User createUser(User user) {
		return userDao.createUser(user);
		
	}

	@Override
	public User updateUser(String id, User user) {
		// TODO Auto-generated method stub
		return userDao.updateUser(id, user);
	}

	@Override
	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getUsers() {
		List<User> users = userDao.getUsers();
		return users;
	}

}
