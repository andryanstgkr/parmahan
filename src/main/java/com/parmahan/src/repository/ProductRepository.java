package com.parmahan.src.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parmahan.src.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
