package com.parmahan.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parmahan.src.model.ProductStatus;
import com.parmahan.src.repository.ProductStatusRepository;
import com.parmahan.src.service.ProductStatusService;

public class ProductStatusServiceImpl implements ProductStatusService {

	@Autowired
	private ProductStatusRepository productStatusRepository;

	@Override
	public void delete(ProductStatus productStatus) {
		productStatusRepository.delete(productStatus);
	}

	@Override
	public ProductStatus getDetail(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductStatus> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductStatus save(ProductStatus t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
