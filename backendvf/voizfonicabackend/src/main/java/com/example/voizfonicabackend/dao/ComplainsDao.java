package com.example.voizfonicabackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.voizfonicabackend.entity.complains;
@Repository
public interface ComplainsDao extends JpaRepository<complains, Integer> {
	

}
