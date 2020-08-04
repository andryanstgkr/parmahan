package com.parmahan.src.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parmahan.src.model.Session;

public interface SessionRepository extends JpaRepository<Session, String> {

}
