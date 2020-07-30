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
		return null;
	}

	@Override
	public ProductStatus update(String id, ProductStatus productStatus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductStatus getDetail(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductStatus> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
