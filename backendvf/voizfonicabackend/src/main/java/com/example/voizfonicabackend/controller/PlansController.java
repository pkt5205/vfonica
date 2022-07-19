package com.example.voizfonicabackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.voizfonicabackend.entity.PrepaidPlans;
import com.example.voizfonicabackend.service.PlansService;

@RestController
@RequestMapping("/plans")
@CrossOrigin(origins="http://localhost:4200")
public class PlansController {
	@Autowired
	private PlansService plansservice;
	
	@GetMapping("/getallprepaidplans")
	public ResponseEntity<List<PrepaidPlans>> getallPlans(){
		List<PrepaidPlans> plans=plansservice.getallplans();
		return new ResponseEntity<List<PrepaidPlans>>(plans,HttpStatus.OK);
	}
	@GetMapping("/getprepaidplansbyprice/{price}")
	public ResponseEntity<PrepaidPlans> getusersbyhotelid(@PathVariable long price){
		PrepaidPlans plans=plansservice.getplansbyprice(price);
		return new ResponseEntity<PrepaidPlans>(plans,HttpStatus.OK);
	}

}
