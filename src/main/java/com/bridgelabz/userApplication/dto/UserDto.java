package com.bridgelabz.userApplication.dto;

public class UserDto {
	
	private String email;
	private String firstname;
	private String lastname;
	private String password;
	private String address;
	private String mob_no;
	
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMob_no() {
		return mob_no;
	}
	public void setMob_no(String mob_no) {
		this.mob_no = mob_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDto [email=" + email + ", firstname=" + firstname + ", lastname=" + lastname + ", password="
				+ password + ", address=" + address + ", mob_no=" + mob_no + "]";
	}

	
	
	

}
