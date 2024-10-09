package com.ecommerce.oneclickcar.model;

import java.util.Date;

public class Users {
	
	private String full_name;
	private String phone_number;
	private String email;
	private Date birth_date;
	private String password;
	private String type_user;
	private Long id_account;
	
	private static Long total = 0L;

	// Constructors
	public Users(String full_name, String phone_number, String email, Date birth_date, String password,
			String type_user) {
		this.full_name = full_name;
		this.phone_number = phone_number;
		this.email = email;
		this.birth_date = birth_date;
		this.password = password;
		this.type_user = type_user;
		total++;
		this.id_account = total;
	}// Users
	
	public Users() {
		total++;
		this.id_account = total;
	}// Users

	// Getters and setters
	public String getFull_name() {
		return full_name;
	}// getFull_name

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}// setFull_name

	public String getPhone_number() {
		return phone_number;
	}// getPhone_number

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}// setPhone_number

	public String getEmail() {
		return email;
	}// getEmail

	public void setEmail(String email) {
		this.email = email;
	}// setEmail

	public Date getBirth_date() {
		return birth_date;
	}// getBirth_date

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}// setBirth_date

	public String getPassword() {
		return password;
	}// getPassword

	public void setPassword(String password) {
		this.password = password;
	}// setPasswor

	public String getType_user() {
		return type_user;
	}// getType_user

	public void setType_user(String type_user) {
		this.type_user = type_user;
	}// setType_user

	public Long getId_account() {
		return id_account;
	}// getId_account

	public void setId_account(Long id_account) {
		this.id_account = id_account;
	} //setId_account

	// toString method
	@Override
	public String toString() {
		return "Users [full_name=" + full_name + ", phone_number=" + phone_number + ", email=" + email + ", birth_date="
				+ birth_date + ", password=" + password + ", type_user=" + type_user + ", id_account=" + id_account
				+ "]";
	}// toString
	
	
	
	
}
