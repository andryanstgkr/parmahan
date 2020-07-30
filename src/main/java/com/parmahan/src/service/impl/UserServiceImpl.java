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
	public User create(User user) {
		return userDao.create(user);
		
	}

	@Override
	public User update(String id, User user) {
		// TODO Auto-generated method stub
		return userDao.update(id, user);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		List<User> users = userDao.getAll();
		return users;
	}

	@Override
	public User getDetail(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
