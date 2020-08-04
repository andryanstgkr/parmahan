package com.parmahan.src.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parmahan.src.model.OrderProduct;
import com.parmahan.src.repository.OrderProductRepository;
import com.parmahan.src.service.OrderProductService;

public class OrderProductServiceImpl implements OrderProductService {

	@Autowired
	private OrderProductRepository orderProductRepository;

	@Override
	public void delete(OrderProduct orderProduct) {
		orderProductRepository.delete(orderProduct);
	}

	@Override
	public List<OrderProduct> getAll() {
		List<OrderProduct> orderProducts = new ArrayList<>();
		orderProductRepository.findAll().forEach(orderProducts::add);
		return orderProducts;
	}

	@Override
	public OrderProduct getDetail(String id) {
		OrderProduct orderProduct = orderProductRepository.findById(id).get();
		return orderProduct;
	}

	@Override
	public OrderProduct save(OrderProduct orderProduct) {
		orderProduct = orderProductRepository.save(orderProduct);
		return orderProduct;
	}

	@Override
	public boolean existsById(String id) {
		return orderProductRepository.existsById(id);
	}

}
