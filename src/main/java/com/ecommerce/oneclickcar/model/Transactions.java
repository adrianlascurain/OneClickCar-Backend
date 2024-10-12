package com.ecommerce.oneclickcar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Transactions")
public class Transactions {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idTransaction", unique=true, nullable=false)
	private Long idTransaction;
	@Column(nullable=false)
	private String dateTransaction;
	@Column(nullable=false)
	private Long userIdBuyer;
	@Column(nullable=false)
	private Long userIdSeller;
	@Column(nullable=false)
	private Long carsIdCars;
	@Column(nullable=false)
	private Long paymentMethodIdCars;
	@Column(nullable=false)
	private Long depositMethodIdAccount;
	
	public Transactions(Long id_transaction, String date_transaction, Long user_id_buyer, Long user_id_seller,
			Long cars_id_cars, Long payment_method_id_cars, Long deposit_method_id_account) {
		this.idTransaction = id_transaction;
		this.dateTransaction = date_transaction;
		this.userIdBuyer = user_id_buyer;
		this.userIdSeller = user_id_seller;
		this.carsIdCars = cars_id_cars;
		this.paymentMethodIdCars = payment_method_id_cars;
		this.depositMethodIdAccount = deposit_method_id_account;
	}//constructor
	
	public Transactions() {
	}//constructor

	// Getters and setters
	public Long getIdTransaction() {
		return idTransaction;
	}
	
	public void setIdTransaction(Long idTransaction) {
		this.idTransaction = idTransaction;
	}
	
	public String getDateTransaction() {
		return dateTransaction;
	}
	
	public void setDateTransaction(String dateTransaction) {
		this.dateTransaction = dateTransaction;
	}
	
	public Long getUserIdBuyer() {
		return userIdBuyer;
	}
	
	public void setUserIdBuyer(Long userIdBuyer) {
		this.userIdBuyer = userIdBuyer;
	}
	
	public Long getUser_id_seller() {
		return userIdSeller;
	}
	
	public void setUserIdSeller(Long userIdSeller) {
		this.userIdSeller = userIdSeller;
	}
	
	public Long getCarsIdCars() {
		return carsIdCars;
	}
	
	public void setCarsIdCars(Long carsIdCars) {
		this.carsIdCars = carsIdCars;
	}
	
	public Long getPaymentMethodIdCars() {
		return paymentMethodIdCars;
	}
	
	public void setPaymentMethodIdCars(Long paymentMethodIdCars) {
		this.paymentMethodIdCars = paymentMethodIdCars;
	}
	
	public Long getDepositMethodIdAccount() {
		return depositMethodIdAccount;
	}
	
	public void setDepositMethodIdAccount(Long depositMethodIdAccount) {
		this.depositMethodIdAccount = depositMethodIdAccount;
	}
	@Override
	public String toString() {
		return "Transactions [idTransaction=" + idTransaction + ", dateTransaction=" + dateTransaction
				+ ", userIdBuyer=" + userIdBuyer + ", userIdSeller=" + userIdSeller + ", carsIdCars="
				+ carsIdCars + ", paymentMethodIdCars=" + paymentMethodIdCars + ", depositMethodIdAccount="
				+ depositMethodIdAccount + "]";
	}
	
	
	
	
}
