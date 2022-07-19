package com.example.voizfonicabackend.entity;
//
//
//
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Table;
//
//
@Entity
@Table(name = "user_details")
public class UserDetails {
	
		
		private String firstname;
		private String lastname;
		
		@Id
		private String email;
		
		private String password;

		public UserDetails() {
			super();
			// TODO Auto-generated constructor stub
		}

		public UserDetails(String firstname, String lastname, String email, String password) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
			this.email = email;
			this.password = password;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
}
		
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int Id;
//	
//	private String Firstname;
//	private String Lastname;
//	@javax.persistence.Id
//	private String Email;
//	private String Password;
//	public UserDetails(int id, String firstname, String lastname, String email, String password) {
//		super();
//		this.Id = id;
//		this.Firstname = firstname;
//		this.Lastname = lastname;
//		this.Email = email;
//		this.Password = password;
//	}
//	public UserDetails() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//	public int getId() {
//		return Id;
//	}
//	public void setId(int id) {
//		this.Id = id;
//	}
//	public String getFirstname() {
//		return Firstname;
//	}
//	public void setFirstname(String firstname) {
//		this.Firstname = firstname;
//	}
//	public String getLastname() {
//		return Lastname;
//	}
//	public void setLastname(String lastname) {
//		this.Lastname = lastname;
//	}
//	public String getEmail() {
//		return Email;
//	}
//	public void setEmail(String email) {
//		this.Email = email;
//	}
//	public String getPassword() {
//		return Password;
//	}
//	public void setPassword(String password) {
//		this.Password = password;
//	}
//	
//
//}
