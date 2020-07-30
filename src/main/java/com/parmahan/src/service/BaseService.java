package com.parmahan.src.service;

import java.util.List;

public interface BaseService <T> {
	T create(T t);

	T update(String id, T t);

	void delete(String id);
	
	T getDetail(String id);

	List<T> getAll();
}