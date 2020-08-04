package com.parmahan.src.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parmahan.src.model.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, String> {

}
