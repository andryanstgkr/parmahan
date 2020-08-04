package com.parmahan.src.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.parmahan.src.model.Category;
import com.parmahan.src.repository.CategoryRepository;
import com.parmahan.src.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	@Qualifier("categoryRepository")
	private CategoryRepository categoryRepository;

	@Override
	public Category save(Category category) {
		category = categoryRepository.save(category);
		return category;
	}

	@Override
	public void delete(Category category) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Category> getAll() {
		List<Category> categories = new ArrayList<Category>();
		categoryRepository.findAll().forEach(categories::add);
		return categories;
	}

	@Override
	public Category getDetail(String id) {
		Category category = categoryRepository.findById(id).stream().findFirst().get();
		return category;
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
