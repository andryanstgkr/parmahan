package com.parmahan.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parmahan.src.dao.ProductCategoryDao;
import com.parmahan.src.model.ProductCategory;
import com.parmahan.src.service.ProductCategoryService;

public class ProductCategoryServiceImpl implements ProductCategoryService{

	@Autowired
	private ProductCategoryDao productCategoryDao;
	
	@Override
	public ProductCategory create(ProductCategory productCategory) {
		// TODO Auto-generated method stub
		return productCategoryDao.create(productCategory);
	}

	@Override
	public ProductCategory update(String id, ProductCategory productCategory) {
		// TODO Auto-generated method stub
		return productCategoryDao.update(id, productCategory);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProductCategory> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductCategory getDetail(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
