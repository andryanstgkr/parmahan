package com.parmahan.src.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.parmahan.src.model.Tag;
import com.parmahan.src.repository.TagRepository;
import com.parmahan.src.service.TagService;

public class TagServiceImpl implements TagService {

	@Autowired
	private TagRepository tagRepository;

	@Override
	public void delete(Tag tag) {
		tagRepository.delete(tag);
	}

	@Override
	public Tag getDetail(String id) {
		Tag tag = tagRepository.findById(id).get();
		return tag;
	}

	@Override
	public List<Tag> getAll() {
		List<Tag> tags = new ArrayList<>();
		tagRepository.findAll().forEach(tags::add);
		return tags;
	}

	@Override
	public Tag save(Tag tag) {
		tag = tagRepository.save(tag);
		return tag;
	}

	@Override
	public boolean existsById(String id) {
		return tagRepository.existsById(id);
	}

}
