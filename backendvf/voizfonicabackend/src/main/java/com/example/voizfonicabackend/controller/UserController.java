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
import com.example.voizfonicabackend.entity.UserDetails;
import com.example.voizfonicabackend.service.UserService;

@RestController
@RequestMapping("/userdetails")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	@Autowired
	private UserService userservice;
	
	@PostMapping("/save")
	public ResponseEntity<UserDetails> addUser(@RequestBody UserDetails user ){
		UserDetails userRecieved=userservice.addUser(user);
		return new ResponseEntity<UserDetails>(userRecieved,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getallusers")
	public ResponseEntity<List<UserDetails>> getallUsers(){
		List<UserDetails> users=userservice.getallUsers();
		return new ResponseEntity<List<UserDetails>>(users,HttpStatus.OK);
	}
	@PostMapping("/userlogin")
	public  ResponseEntity<?> loginUser(@RequestBody UserDetails userData){
		System.out.println(userData);
		UserDetails user=userservice.fetchByEmailId(userData.getEmail());
		if(user.getPassword() == null || user.getPassword().equals(userData.getPassword()))
			return ResponseEntity.ok(user);
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
		
	}
}
