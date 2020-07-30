package com.parmahan.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parmahan.src.dao.SalesOrderDao;
import com.parmahan.src.model.SalesOrder;
import com.parmahan.src.service.SalesOrderService;

public class SalesOrderServiceImpl implements SalesOrderService{

	@Autowired
	private SalesOrderDao salesOrderDao;
	
	@Override
	public SalesOrder create(SalesOrder salesOrder) {
		// TODO Auto-generated method stub
		return salesOrderDao.create(salesOrder);
	}

	@Override
	public SalesOrder update(String id, SalesOrder salesOrder) {
		// TODO Auto-generated method stub
		return salesOrderDao.update(id, salesOrder);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		salesOrderDao.delete(id);
	}

	@Override
	public SalesOrder getDetail(String id) {
		// TODO Auto-generated method stub
		return salesOrderDao.getDetail(id);
	}

	@Override
	public List<SalesOrder> getAll() {
		// TODO Auto-generated method stub
		return salesOrderDao.getAll();
	}

}
