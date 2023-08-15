package com.r2s.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.r2s.demo.entity.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {

}
