package com.parmahan.src.dao;

import java.util.List;

public interface BaseDao<T> {
	T create(T t);

	T update(String id, T t);

	void delete(String id);

	T getDetail(String id);
	
	List<T> getAll();
}
