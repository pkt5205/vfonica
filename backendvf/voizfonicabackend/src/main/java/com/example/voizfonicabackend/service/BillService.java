package com.example.voizfonicabackend.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.voizfonicabackend.dao.BillDao;
import com.example.voizfonicabackend.entity.Bill;

@Service
@Transactional
public class BillService {
	@Autowired
	private BillDao billdao;

	public Bill savebill(Bill bill) {
		// TODO Auto-generated method stub
		return billdao.save(bill);
	}
	
	

}
