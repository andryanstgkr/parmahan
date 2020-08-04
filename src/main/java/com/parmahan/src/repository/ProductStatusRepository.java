package com.parmahan.src.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parmahan.src.model.ProductStatus;

public interface ProductStatusRepository extends JpaRepository<ProductStatus, String> {

}
