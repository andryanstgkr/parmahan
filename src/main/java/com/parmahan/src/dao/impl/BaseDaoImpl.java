package com.parmahan.src.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BaseDaoImpl {
	@Autowired
	@Qualifier("sessionFactory")
	protected SessionFactory sessionFactory;

	protected void init(SessionFactory factory) {
		try {
			setSessionFactory(factory);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() throws HibernateException {
		return sessionFactory.getCurrentSession();
	}

}
