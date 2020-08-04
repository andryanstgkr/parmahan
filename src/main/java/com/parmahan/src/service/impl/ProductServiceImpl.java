package com.parmahan.src.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parmahan.src.model.Product;
import com.parmahan.src.repository.ProductRepository;
import com.parmahan.src.service.ProductService;

public class ProductServiceImpl implements ProductService {
	


	@Autowired
	private ProductRepository productRepository;

	@Override
	public void delete(Product product) {
		productRepository.delete(product);
	}

	@Override
	public Product getDetail(String id) {
		Product product = productRepository.findById(id).get();
		return product;
	}

	@Override
	public List<Product> getAll() {
		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add);
		return products;
	}

	@Override
	public Product save(Product product) {
		product = productRepository.save(product);
		return product;
	}

	@Override
	public boolean existsById(String id) {
		return productRepository.existsById(id);
	}

}
