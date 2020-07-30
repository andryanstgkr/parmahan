package com.parmahan.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parmahan.src.dao.CategoryDao;
import com.parmahan.src.model.Category;
import com.parmahan.src.service.CategoryService;

public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryDao categoryDao;
	@Override
	public Category create(Category category) {
		// TODO Auto-generated method stub
		return categoryDao.create(category);
	}

	@Override
	public Category update(String id, Category category) {
		// TODO Auto-generated method stub
		return categoryDao.update(id, category);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category getDetail(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
