package com.parmahan.src.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parmahan.src.model.User;
import com.parmahan.src.repository.UserRepository;
import com.parmahan.src.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User save(User user) {
		user = userRepository.save(user);
		return user;
	}

	@Override
	public void delete(User user) {
		userRepository.delete(user);
	}

	@Override
	public User getDetail(String id) {
		Optional<User> result = userRepository.findById(id).stream().findFirst();
		return result.get();
	}

	@Override
	public List<User> getAll() {
		List<User> users = new ArrayList<User>();
		userRepository.findAll().forEach(users::add);
		return users;
	}

	@Override
	public boolean existsById(String id) {
		return userRepository.existsById(id);
	}

}
