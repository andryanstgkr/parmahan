package com.parmahan.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parmahan.src.dao.CCTransactionDao;
import com.parmahan.src.model.CCTransaction;
import com.parmahan.src.service.CCTransactionService;

public class CCTransactionServiceImpl implements CCTransactionService {

	@Autowired
	private CCTransactionDao cCTransactionDao;
	
	@Override
	public CCTransaction create(CCTransaction ccTransaction) {
		// TODO Auto-generated method stub
		return cCTransactionDao.create(ccTransaction);
	}

	@Override
	public CCTransaction update(String id, CCTransaction ccTransaction) {
		// TODO Auto-generated method stub
		return cCTransactionDao.update(id, ccTransaction);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<CCTransaction> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CCTransaction getDetail(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
