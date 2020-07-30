package com.parmahan.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parmahan.src.dao.OrderDao;
import com.parmahan.src.model.Order;
import com.parmahan.src.service.OrderService;

public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao orderDao;
	
	@Override
	public Order create(Order order) {
		// TODO Auto-generated method stub
		return orderDao.create(order);
	}

	@Override
	public Order update(String id, Order order) {
		// TODO Auto-generated method stub
		return orderDao.update(id, order);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		this.orderDao.delete(id);
	}

	@Override
	public Order getDetail(String id) {
		// TODO Auto-generated method stub
		return orderDao.getDetail(id);
	}

	@Override
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return orderDao.getAll();
	}

}
