package com.example.voizfonicabackend.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.voizfonicabackend.dao.ComplainsDao;
import com.example.voizfonicabackend.entity.complains;

@Service
@Transactional
public class ComplainService {
	@Autowired
	private ComplainsDao complainsdao;

	public complains savecomplains(complains complains) {
		// TODO Auto-generated method stub
		return complainsdao.save(complains);
	}

	public List<complains> getallcomplains() {
		// TODO Auto-generated method stub
		return complainsdao.findAll();
	}
	
	

}
