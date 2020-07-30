package com.parmahan.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parmahan.src.dao.OrderProductDao;
import com.parmahan.src.model.OrderProduct;
import com.parmahan.src.service.OrderProductService;

public class OrderProductServiceImpl implements OrderProductService {

	@Autowired
	private OrderProductDao orderProductDao;
	
	@Override
	public OrderProduct create(OrderProduct orderProduct) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderProduct update(String id, OrderProduct orderProduct) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<OrderProduct> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderProduct getDetail(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
