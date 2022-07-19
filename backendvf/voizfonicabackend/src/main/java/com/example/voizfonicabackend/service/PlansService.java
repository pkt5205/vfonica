package com.example.voizfonicabackend.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.voizfonicabackend.dao.PrepaidPlansDao;
import com.example.voizfonicabackend.entity.PrepaidPlans;

@Service
@Transactional
public class PlansService {
	@Autowired
	private PrepaidPlansDao prepaid;

	public List<PrepaidPlans> getallplans() {
		// TODO Auto-generated method stub
		return prepaid.findAll();
	}

	public PrepaidPlans getplansbyprice(long price) {
		// TODO Auto-generated method stub
		return prepaid.findByPrice(price);
	}
	
	

}
