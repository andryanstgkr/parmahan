package com.parmahan.src.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parmahan.src.model.Role;
import com.parmahan.src.repository.RoleRepository;
import com.parmahan.src.service.RoleService;

public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public void delete(Role role) {
		roleRepository.delete(role);
	}

	@Override
	public Role getDetail(String id) {
		Role role = roleRepository.findById(id).get();
		return role;
	}

	@Override
	public List<Role> getAll() {
		List<Role> roles = new ArrayList<>();
		roleRepository.findAll().forEach(roles::add);
		return roles;
	}

	@Override
	public Role save(Role role) {
		roleRepository.save(role);
		return null;
	}

	@Override
	public boolean existsById(String id) {
		return roleRepository.existsById(id);
	}

}
