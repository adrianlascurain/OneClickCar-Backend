package com.ecommerce.oneclickcar.dto;

public class ChangePassword {

	private String email;
	private String password;
	private String npassword;
	
	// Constructor
	public ChangePassword(String password, String npassword, String email) {
		this.password = password;
		this.npassword = npassword;
		this.email = email;
	}
	
	public ChangePassword() {}

	// Getters and setters
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNpassword() {
		return npassword;
	}

	public void setNpassword(String npassword) {
		this.npassword = npassword;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "ChangePassword [password=" + password + ", npassword=" + npassword + "]";
	}
	
}
