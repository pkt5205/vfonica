package com.example.voizfonicabackend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bill {
	@Id
	private long price;
	private String description;
	private String validity;
	private String email;
	public Bill(long price, String description, String validity, String email) {
		super();
		this.price = price;
		this.description = description;
		this.validity = validity;
		this.email = email;
	}
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
