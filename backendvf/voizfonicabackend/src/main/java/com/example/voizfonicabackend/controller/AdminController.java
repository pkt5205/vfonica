package com.example.voizfonicabackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.voizfonicabackend.entity.Admin;
import com.example.voizfonicabackend.service.AdminService;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {
	@Autowired
	private AdminService adminservice;
	
	@PostMapping("/adminlogin")
	public  ResponseEntity<?> loginAdmin(@RequestBody Admin admin){
		Admin adm=adminservice.fetchByEmail(admin.getEmail());
		if(adm.getPassword()==null || adm.getPassword().equals(admin.getPassword()))
			return ResponseEntity.ok(admin);
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
		
		
	}
}
