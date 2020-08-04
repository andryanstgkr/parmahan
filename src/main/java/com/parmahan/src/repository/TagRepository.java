package com.parmahan.src.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parmahan.src.model.Tag;

public interface TagRepository extends JpaRepository<Tag, String> {

}
