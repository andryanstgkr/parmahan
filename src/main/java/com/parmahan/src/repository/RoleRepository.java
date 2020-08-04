package com.parmahan.src.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parmahan.src.model.Role;

public interface RoleRepository extends JpaRepository<Role, String> {

}
