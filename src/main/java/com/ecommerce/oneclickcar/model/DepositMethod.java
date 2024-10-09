package com.ecommerce.oneclickcar.model;

public class DepositMethod {
	private Long id_account;
	private String name_account;
	private String name_bank;
	private String account_bank;
	private Long user_id_user;
	
	
	// Getters and setters
	public Long getId_account() {
		return id_account;
	}
	
	public void setId_account(Long id_account) {
		this.id_account = id_account;
	}
	
	public String getName_account() {
		return name_account;
	}
	
	public void setName_account(String name_account) {
		this.name_account = name_account;
	}
	
	public String getName_bank() {
		return name_bank;
	}
	
	public void setName_bank(String name_bank) {
		this.name_bank = name_bank;
	}
	
	public String getAccount_bank() {
		return account_bank;
	}
	
	public void setAccount_bank(String account_bank) {
		this.account_bank = account_bank;
	}
	
	public Long getUser_id_user() {
		return user_id_user;
	}
	
	public void setUser_id_user(Long user_id_user) {
		this.user_id_user = user_id_user;
	}
	
	@Override
	public String toString() {
		return "DepositMethod [id_account=" + id_account + ", name_account=" + name_account + ", name_bank=" + name_bank
				+ ", account_bank=" + account_bank + ", user_id_user=" + user_id_user + "]";
	}
	
	
}
