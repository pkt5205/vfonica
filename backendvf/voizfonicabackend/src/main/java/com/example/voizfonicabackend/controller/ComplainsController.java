package com.example.voizfonicabackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.voizfonicabackend.entity.complains;
import com.example.voizfonicabackend.service.ComplainService;

@RestController
@RequestMapping("/complains")
@CrossOrigin("http://localhost:4200")
public class ComplainsController {
	@Autowired
	private ComplainService complainservice;
	
	@PostMapping("/saveComplains")
	public ResponseEntity<complains> saveComplains(@RequestBody complains complains){
		complains complainsrecieved=complainservice.savecomplains(complains);
		return new ResponseEntity<complains>(complainsrecieved,HttpStatus.OK);
	}
	@GetMapping("/getallcomplains")
	public ResponseEntity<List<complains>> getallcomplains(){
		List<complains> complains=complainservice.getallcomplains();
		return new ResponseEntity<List<complains>>(complains,HttpStatus.OK);
	}

}
