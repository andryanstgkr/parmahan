package com.parmahan.src.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.parmahan.src.dao.UserDao;
import com.parmahan.src.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public User create(User user) {
		this.entityManager.persist(user);
		return user;
	}

	@Override
	@Transactional
	public User update(String id, User user) {
		this.entityManager.merge(user);
		return user;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> getAll() {
		List<User> users = entityManager.createQuery("from " + User.class.getSimpleName()).getResultList();
		return users;
	}

	@Override
	public User getDetail(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
