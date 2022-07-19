package com.example.voizfonicabackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.voizfonicabackend.entity.Bill;
@Repository
public interface BillDao extends JpaRepository<Bill, Integer> {

}
