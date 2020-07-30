package com.parmahan.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parmahan.src.dao.UserRoleDao;
import com.parmahan.src.model.UserRole;
import com.parmahan.src.service.UserRoleService;

public class UserRoleServiceImpl implements UserRoleService {

	@Autowired
	private UserRoleDao userRoleDao;

	@Override
	public UserRole create(UserRole userRole) {
		// TODO Auto-generated method stub
		return userRoleDao.create(userRole);
	}

	@Override
	public UserRole update(String id, UserRole userRole) {
		// TODO Auto-generated method stub
		return userRoleDao.update(id, userRole);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		userRoleDao.delete(id);
	}

	@Override
	public UserRole getDetail(String id) {
		// TODO Auto-generated method stub
		return userRoleDao.getDetail(id);
	}

	@Override
	public List<UserRole> getAll() {
		// TODO Auto-generated method stub
		return userRoleDao.getAll();
	}

}
