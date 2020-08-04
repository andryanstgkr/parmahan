package com.parmahan.src.repository;

import org.springframework.data.jpa.repository.JpaRepository;

@SuppressWarnings("hiding")
public interface BaseRepository<Object> extends JpaRepository<Object, String> {

}
