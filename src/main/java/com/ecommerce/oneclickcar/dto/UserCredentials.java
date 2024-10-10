package com.ecommerce.oneclickcar.dto;

public class UserCredentials {
	private String email;
	private String password;
	
	// Constructor
	public UserCredentials(String email, String password) {
		this.email = email;
		this.password = password;
	}// UserCredentials
	
	public UserCredentials() {}
	
	// Getters and setters
	public String getEmail() {
		return email;
	}// getEmail
	
	public void setEmail(String email) {
		this.email = email;
	}// setEmail
	
	public String getPassword() {
		return password;
	}// getPassword
	 
	public void setPassword(String password) {
		this.password = password;
	}// setPassword
	
	@Override
	public String toString() {
		return "UserCredentials [email=" + email + ", password=" + password + "]";
	}// toString
	
	
}
