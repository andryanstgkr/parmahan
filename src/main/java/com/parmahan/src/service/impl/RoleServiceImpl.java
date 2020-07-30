package com.parmahan.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parmahan.src.dao.RoleDao;
import com.parmahan.src.model.Role;
import com.parmahan.src.service.RoleService;

public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleDao roleDao;
	
	@Override
	public Role create(Role role) {
		// TODO Auto-generated method stub
		return roleDao.create(role);
	}

	@Override
	public Role update(String id, Role role) {
		// TODO Auto-generated method stub
		return roleDao.update(id, role);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		roleDao.delete(id);
	}

	@Override
	public Role getDetail(String id) {
		// TODO Auto-generated method stub
		return roleDao.getDetail(id);
	}

	@Override
	public List<Role> getAll() {
		// TODO Auto-generated method stub
		return roleDao.getAll();
	}

}
