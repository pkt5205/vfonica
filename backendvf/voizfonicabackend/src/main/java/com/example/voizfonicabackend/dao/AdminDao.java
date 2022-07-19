package com.example.voizfonicabackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.voizfonicabackend.entity.Admin;
@Repository
public interface AdminDao extends JpaRepository<Admin, Integer> {

	Admin findByEmail(String email);

}
