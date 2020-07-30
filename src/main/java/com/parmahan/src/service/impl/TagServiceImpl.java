package com.parmahan.src.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parmahan.src.dao.TagDao;
import com.parmahan.src.model.Tag;
import com.parmahan.src.service.TagService;

public class TagServiceImpl implements TagService {

	@Autowired
	private TagDao tagDao;

	@Override
	public Tag create(Tag tag) {
		// TODO Auto-generated method stub
		return tagDao.create(tag);
	}

	@Override
	public Tag update(String id, Tag tag) {
		// TODO Auto-generated method stub
		return tagDao.update(id, tag);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		tagDao.delete(id);
	}

	@Override
	public Tag getDetail(String id) {
		// TODO Auto-generated method stub
		return tagDao.getDetail(id);
	}

	@Override
	public List<Tag> getAll() {
		// TODO Auto-generated method stub
		return tagDao.getAll();
	}

}
