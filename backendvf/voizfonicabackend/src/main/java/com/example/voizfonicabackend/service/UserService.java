package com.example.voizfonicabackend.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.voizfonicabackend.dao.UserDao;
import com.example.voizfonicabackend.entity.UserDetails;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserDao userdao;
	
	public UserDetails addUser(UserDetails user) {
		return userdao.save(user);
	}

	public List<UserDetails> getallUsers() {
		
		return userdao.findAll();
	}

	public UserDetails fetchByEmailId(String email) {
		// TODO Auto-generated method stub
		return userdao.findByEmail(email);
	}
	
	
	

}
