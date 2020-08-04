package com.parmahan.src.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parmahan.src.model.CCTransaction;
import com.parmahan.src.repository.CCTransactionRepository;
import com.parmahan.src.service.CCTransactionService;

public class CCTransactionServiceImpl implements CCTransactionService {

	@Autowired
	private CCTransactionRepository cCTransactionRepository;

	@Override
	public void delete(CCTransaction ccTransaction) {
		cCTransactionRepository.delete(ccTransaction);
	}

	@Override
	public List<CCTransaction> getAll() {
		List<CCTransaction> ccTransactions = new ArrayList<>();
		cCTransactionRepository.findAll().forEach(ccTransactions::add);
		return ccTransactions;
	}

	@Override
	public CCTransaction getDetail(String id) {
		CCTransaction ccTransaction = cCTransactionRepository.findById(id).get();
		return ccTransaction;
	}

	@Override
	public CCTransaction save(CCTransaction ccTransaction) {
		ccTransaction = cCTransactionRepository.save(ccTransaction);
		return ccTransaction;
	}

	@Override
	public boolean existsById(String id) {
		return cCTransactionRepository.existsById(id);
	}

}
