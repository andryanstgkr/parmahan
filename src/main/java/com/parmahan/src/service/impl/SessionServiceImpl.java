package com.parmahan.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parmahan.src.dao.SessionDao;
import com.parmahan.src.model.Session;
import com.parmahan.src.service.SessionService;

public class SessionServiceImpl implements SessionService {

	@Autowired
	private SessionDao sessionDao;

	@Override
	public Session create(Session session) {
		// TODO Auto-generated method stub
		return sessionDao.create(session);
	}

	@Override
	public Session update(String id, Session session) {
		// TODO Auto-generated method stub
		return sessionDao.update(id, session);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		sessionDao.delete(id);
	}

	@Override
	public Session getDetail(String id) {
		// TODO Auto-generated method stub
		return sessionDao.getDetail(id);
	}

	@Override
	public List<Session> getAll() {
		// TODO Auto-generated method stub
		return sessionDao.getAll();
	}

}
