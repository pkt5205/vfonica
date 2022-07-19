package com.example.voizfonicabackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.voizfonicabackend.entity.Bill;
import com.example.voizfonicabackend.service.BillService;

@RestController
@RequestMapping("/bill")
@CrossOrigin("http://localhost:4200")
public class BillController {
	@Autowired
	private BillService billservice;
	
	@PostMapping("/savebill")
	public ResponseEntity<Bill> saveBill(@RequestBody Bill bill){
		Bill billrecieved=billservice.savebill(bill);
		return new ResponseEntity<Bill>(billrecieved,HttpStatus.OK);
	}

}
