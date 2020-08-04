package com.parmahan.src.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parmahan.src.model.Order;
import com.parmahan.src.repository.OrderRepository;
import com.parmahan.src.service.OrderService;

public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void delete(Order order) {
		orderRepository.delete(order);
	}

	@Override
	public Order getDetail(String id) {
		Order order = orderRepository.findById(id).get();
		return order;
	}

	@Override
	public List<Order> getAll() {
		List<Order> orders = new ArrayList<>();
		orderRepository.findAll().forEach(orders::add);
		return orders;
	}

	@Override
	public Order save(Order order) {
		order = orderRepository.save(order);
		return order;
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
