package com.parmahan.src.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parmahan.src.model.SalesOrder;
import com.parmahan.src.repository.SalesOrderRepository;
import com.parmahan.src.service.SalesOrderService;

public class SalesOrderServiceImpl implements SalesOrderService {

	@Autowired
	private SalesOrderRepository salesOrderRepository;

	@Override
	public void delete(SalesOrder salesOrder) {
		salesOrderRepository.delete(salesOrder);
	}

	@Override
	public SalesOrder getDetail(String id) {
		SalesOrder salesOrder = salesOrderRepository.findById(id).get();
		return salesOrder;
	}

	@Override
	public List<SalesOrder> getAll() {
		List<SalesOrder> salesOrders = new ArrayList<>();
		salesOrderRepository.findAll().forEach(salesOrders::add);
		return salesOrders;
	}

	@Override
	public SalesOrder save(SalesOrder salesOrder) {
		salesOrder = salesOrderRepository.save(salesOrder);
		return salesOrder;
	}

	@Override
	public boolean existsById(String id) {
		return salesOrderRepository.existsById(id);
	}

}
