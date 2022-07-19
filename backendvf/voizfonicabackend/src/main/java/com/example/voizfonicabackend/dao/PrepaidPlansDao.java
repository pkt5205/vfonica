package com.example.voizfonicabackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.voizfonicabackend.entity.PrepaidPlans;
@Repository
public interface PrepaidPlansDao extends JpaRepository<PrepaidPlans, Integer> {

	PrepaidPlans findByPrice(long price);

}
