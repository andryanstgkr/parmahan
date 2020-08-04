package com.parmahan.src.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parmahan.src.model.Order;

public interface OrderRepository extends JpaRepository<Order, String> {

}
