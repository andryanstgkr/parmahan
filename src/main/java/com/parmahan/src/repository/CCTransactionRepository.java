package com.parmahan.src.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parmahan.src.model.CCTransaction;

public interface CCTransactionRepository extends JpaRepository<CCTransaction, String> {

}
