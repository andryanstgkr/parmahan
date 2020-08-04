package com.parmahan.src.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parmahan.src.model.ProductCategory;

public interface ProductStatusRepository extends JpaRepository<ProductCategory, String> {

}
