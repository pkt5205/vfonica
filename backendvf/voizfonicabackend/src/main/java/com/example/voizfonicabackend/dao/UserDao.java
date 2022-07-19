package com.example.voizfonicabackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.voizfonicabackend.entity.UserDetails;
@Repository
public interface UserDao extends JpaRepository<UserDetails, Integer> {

	public UserDetails findByEmail(String email);
	
	
	
}
