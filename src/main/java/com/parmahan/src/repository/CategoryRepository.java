package com.parmahan.src.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parmahan.src.model.Category;

public interface CategoryRepository extends JpaRepository<Category, String> {

}
