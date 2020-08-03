package com.parmahan.src.service.impl;

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
	public User create(User user) {
		user = userRepository.save(user);
		return user;
	}

	@Override
	public User update(String id, User user) {
		
		return userRepository.save(user);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getDetail(String id) {
		Optional<User> result = userRepository.findById(id).stream().findFirst();
		return result.get();
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
