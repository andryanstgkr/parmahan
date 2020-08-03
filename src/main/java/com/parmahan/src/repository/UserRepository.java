package com.parmahan.src.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parmahan.src.model.User;

public interface UserRepository extends JpaRepository<User, String> {

}
