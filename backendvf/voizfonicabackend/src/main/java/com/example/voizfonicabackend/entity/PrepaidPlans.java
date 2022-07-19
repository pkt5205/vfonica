package com.example.voizfonicabackend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class PrepaidPlans {
	@Id
	private long price;
	private String description;
	private String validity;
	public PrepaidPlans(long price, String description, String validity) {
		super();
		this.price = price;
		this.description = description;
		this.validity = validity;
	}
	public PrepaidPlans() {
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
	
}
