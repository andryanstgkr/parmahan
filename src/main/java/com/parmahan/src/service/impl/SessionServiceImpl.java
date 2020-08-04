package com.parmahan.src.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parmahan.src.model.Session;
import com.parmahan.src.repository.SessionRepository;
import com.parmahan.src.service.SessionService;

public class SessionServiceImpl implements SessionService {

	@Autowired
	private SessionRepository sessionRepository;

	@Override
	public void delete(Session session) {
		sessionRepository.delete(session);
	}

	@Override
	public Session getDetail(String id) {
		Session session = sessionRepository.findById(id).get();
		return session;
	}

	@Override
	public List<Session> getAll() {
		List<Session> sessions = new ArrayList<>();
		sessionRepository.findAll().forEach(sessions::add);
		return sessions;
	}

	@Override
	public Session save(Session session) {
		session = sessionRepository.save(session);
		return session;
	}

	@Override
	public boolean existsById(String id) {
		return sessionRepository.existsById(id);
	}

}
