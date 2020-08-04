package com.parmahan.src.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parmahan.src.model.UserRole;
import com.parmahan.src.repository.UserRoleRepository;
import com.parmahan.src.service.UserRoleService;

public class UserRoleServiceImpl implements UserRoleService {

	@Autowired
	private UserRoleRepository userRoleRepository;

	@Override
	public void delete(UserRole userRole) {
		userRoleRepository.delete(userRole);
	}

	@Override
	public UserRole getDetail(String id) {
		UserRole userRole = userRoleRepository.findById(id).get();
		return userRole;
	}

	@Override
	public List<UserRole> getAll() {
		List<UserRole> userRoles = new ArrayList<>();
		userRoleRepository.findAll().forEach(userRoles::add);
		return userRoles;
	}

	@Override
	public UserRole save(UserRole userRole) {
		userRole = userRoleRepository.save(userRole);
		return userRole;
	}

	@Override
	public boolean existsById(String id) {
		return userRoleRepository.existsById(id);
	}

}
