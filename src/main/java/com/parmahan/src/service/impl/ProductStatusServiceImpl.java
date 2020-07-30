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
	public ProductStatus create(ProductStatus productStatus) {
		// TODO Auto-generated method stub
		return productStatusDao.create(productStatus);
	}

	@Override
	public ProductStatus update(String id, ProductStatus productStatus) {
		// TODO Auto-generated method stub
		return productStatusDao.update(id, productStatus);
	}

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

}
