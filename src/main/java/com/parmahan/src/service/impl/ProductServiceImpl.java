package com.parmahan.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parmahan.src.dao.ProductDao;
import com.parmahan.src.model.Product;
import com.parmahan.src.service.ProductService;

public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;
	
	@Override
	public Product create(Product product) {
		// TODO Auto-generated method stub
		return productDao.create(product);
	}

	@Override
	public Product update(String id, Product product) {
		// TODO Auto-generated method stub
		return productDao.update(id, product);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		this.productDao.delete(id);

	}

	@Override
	public Product getDetail(String id) {
		// TODO Auto-generated method stub
		return this.productDao.getDetail(id);
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return this.productDao.getAll();
	}

}
