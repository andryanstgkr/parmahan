package com.parmahan.src.dao.impl;

import java.util.List;

import com.parmahan.src.dao.CategoryDao;
import com.parmahan.src.model.Category;

public class CategoryDaoImpl implements CategoryDao{

	@Override
	public Category create(Category category) {
		return category;
	}

	@Override
	public Category update(String id, Category category) {
		return category;
	}

	@Override
	public void delete(String id) {
		
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
