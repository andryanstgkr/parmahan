package com.parmahan.src.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parmahan.src.model.ProductCategory;
import com.parmahan.src.repository.ProductCategoryRepository;
import com.parmahan.src.service.ProductCategoryService;

public class ProductCategoryServiceImpl implements ProductCategoryService {

	@Autowired
	private ProductCategoryRepository productCategoryRepository;

	@Override
	public void delete(ProductCategory productCategory) {
		productCategoryRepository.delete(productCategory);
	}

	@Override
	public List<ProductCategory> getAll() {
		List<ProductCategory> productCategories = new ArrayList<>();
		productCategoryRepository.findAll().forEach(productCategories::add);
		return productCategories;
	}

	@Override
	public ProductCategory getDetail(String id) {
		ProductCategory productCategory = productCategoryRepository.findById(id).get();
		return productCategory;
	}

	@Override
	public ProductCategory save(ProductCategory productCategory) {
		productCategory = productCategoryRepository.save(productCategory);
		return productCategory;
	}

	@Override
	public boolean existsById(String id) {
		return productCategoryRepository.existsById(id);
	}

}
