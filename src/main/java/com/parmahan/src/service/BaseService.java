package com.parmahan.src.service;

import java.util.List;

public interface BaseService <T> {
	T save (T t);

	void delete(T t);
	
	T getDetail(String id);

	List<T> getAll();
	
	boolean existsById(String id);
}