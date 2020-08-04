package com.parmahan.src.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parmahan.src.model.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, String> {

}
