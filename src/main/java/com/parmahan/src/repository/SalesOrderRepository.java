package com.parmahan.src.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parmahan.src.model.SalesOrder;

public interface SalesOrderRepository extends JpaRepository<SalesOrder, String> {

}
