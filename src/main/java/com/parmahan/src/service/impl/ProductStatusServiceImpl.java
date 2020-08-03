package com.parmahan.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parmahan.src.dao.ProductStatusDao;
import com.parmahan.src.model.ProductStatus;
import com.parmahan.src.service.ProductStatusService;

public class ProductStatusServiceImpl implements ProductStatusService{
	
	@Autowired
	private ProductStatusDao productStatusDao;

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		productStatusDao.delete(id);
	}

	@Override
	public ProductStatus getDetail(String id) {
		// TODO Auto-generated method stub
		return productStatusDao.getDetail(id);
	}

	@Override
	public List<ProductStatus> getAll() {
		// TODO Auto-generated method stub
		return productStatusDao.getAll();
	}

	@Override
	public ProductStatus save(ProductStatus t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
