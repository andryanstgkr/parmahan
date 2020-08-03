package com.parmahan.src.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.parmahan.src.common.CommonStatic;
import com.parmahan.src.model.Category;
import com.parmahan.src.service.CategoryService;

@Component
@RestController
@RequestMapping("/category")
public class CategoryController {
	private static final Logger logger = LoggerFactory.getLogger(CategoryController.class);

	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public ResponseEntity<List<Category>> getAllCategories() {
		List<Category> categories = categoryService.getAll();
		return new ResponseEntity<>(categories, HttpStatus.OK);
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ResponseEntity<Category> createCategory(@RequestBody Map<String, String> userMap) {
		Category category = new Category();
		category.setId(CommonStatic.generateUUID());
		category.setName(userMap.get("name"));

		category = categoryService.save(category);
		
		return new ResponseEntity<>(category, HttpStatus.OK);
	}
}
