package com.parmahan.src.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parmahan.src.model.OrderProduct;

public interface OrderProductRepository extends JpaRepository<OrderProduct, String> {

}
