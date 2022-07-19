package com.example.voizfonicabackend.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.voizfonicabackend.dao.AdminDao;
import com.example.voizfonicabackend.entity.Admin;

@Service
@Transactional
public class AdminService {
	@Autowired
	private AdminDao admindao;


	public Admin fetchByEmail(String email) {
		// TODO Auto-generated method stub
		return admindao.findByEmail(email);
	}
	
	

}
