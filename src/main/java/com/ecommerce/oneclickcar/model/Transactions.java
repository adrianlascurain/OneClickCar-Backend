package com.ecommerce.oneclickcar.model;

public class Transactions {

	private Long id_transaction;
	private String date_transaction;
	private Long user_id_buyer;
	private Long user_id_seller;
	private Long cars_id_cars;
	private Long payment_method_id_cars;
	private Long deposit_method_id_account;
	
	public Transactions(Long id_transaction, String date_transaction, Long user_id_buyer, Long user_id_seller,
			Long cars_id_cars, Long payment_method_id_cars, Long deposit_method_id_account) {
		this.id_transaction = id_transaction;
		this.date_transaction = date_transaction;
		this.user_id_buyer = user_id_buyer;
		this.user_id_seller = user_id_seller;
		this.cars_id_cars = cars_id_cars;
		this.payment_method_id_cars = payment_method_id_cars;
		this.deposit_method_id_account = deposit_method_id_account;
	}//constructor
	
	public Transactions() {
	}//constructor

	// Getters and setters
	public Long getId_transaction() {
		return id_transaction;
	}
	
	public void setId_transaction(Long id_transaction) {
		this.id_transaction = id_transaction;
	}
	
	public String getDate_transaction() {
		return date_transaction;
	}
	
	public void setDate_transaction(String date_transaction) {
		this.date_transaction = date_transaction;
	}
	
	public Long getUser_id_buyer() {
		return user_id_buyer;
	}
	
	public void setUser_id_buyer(Long user_id_buyer) {
		this.user_id_buyer = user_id_buyer;
	}
	
	public Long getUser_id_seller() {
		return user_id_seller;
	}
	
	public void setUser_id_seller(Long user_id_seller) {
		this.user_id_seller = user_id_seller;
	}
	
	public Long getCars_id_cars() {
		return cars_id_cars;
	}
	
	public void setCars_id_cars(Long cars_id_cars) {
		this.cars_id_cars = cars_id_cars;
	}
	
	public Long getPayment_method_id_cars() {
		return payment_method_id_cars;
	}
	
	public void setPayment_method_id_cars(Long payment_method_id_cars) {
		this.payment_method_id_cars = payment_method_id_cars;
	}
	
	public Long getDeposit_method_id_account() {
		return deposit_method_id_account;
	}
	
	public void setDeposit_method_id_account(Long deposit_method_id_account) {
		this.deposit_method_id_account = deposit_method_id_account;
	}
	@Override
	public String toString() {
		return "Transactions [id_transaction=" + id_transaction + ", date_transaction=" + date_transaction
				+ ", user_id_buyer=" + user_id_buyer + ", user_id_seller=" + user_id_seller + ", cars_id_cars="
				+ cars_id_cars + ", payment_method_id_cars=" + payment_method_id_cars + ", deposit_method_id_account="
				+ deposit_method_id_account + "]";
	}
	
	
	
	
}
