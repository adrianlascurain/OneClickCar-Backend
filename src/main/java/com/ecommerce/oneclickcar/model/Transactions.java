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
	private Long usersIdBuyer;
	@Column(nullable=false)
	private Long usersIdSeller;
	@Column(nullable=false)
	private Long carsIdCars;
	@Column(nullable=false)
	private Long paymentMethodIdCard;
	@Column(nullable=false)
	private Long depositMethodIdAccount;
	
	public Transactions(String dateTransaction, Long userIdBuyer, Long usersIdSeller,
			Long carsIdCars, Long paymentMethodIdCard, Long depositMethodIdAccount) {
		this.dateTransaction = dateTransaction;
		this.usersIdBuyer = userIdBuyer;
		this.usersIdSeller = usersIdSeller;
		this.carsIdCars = carsIdCars;
		this.paymentMethodIdCard = paymentMethodIdCard;
		this.depositMethodIdAccount = depositMethodIdAccount;
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
	
	public Long getUsersIdBuyer() {
		return usersIdBuyer;
	}
	
	public void setUsersIdBuyer(Long usersIdBuyer) {
		this.usersIdBuyer = usersIdBuyer;
	}
	
	public Long getUsersIdSeller() {
		return usersIdSeller;
	}
	
	public void setUsersIdSeller(Long usersIdSeller) {
		this.usersIdSeller = usersIdSeller;
	}
	
	public Long getCarsIdCars() {
		return carsIdCars;
	}
	
	public void setCarsIdCars(Long carsIdCars) {
		this.carsIdCars = carsIdCars;
	}
	
	public Long getPaymentMethodIdCard() {
		return paymentMethodIdCard;
	}
	
	public void setPaymentMethodIdCard(Long paymentMethodIdCard) {
		this.paymentMethodIdCard = paymentMethodIdCard;
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
				+ ", usersIdBuyer=" + usersIdBuyer + ", usersIdSeller=" + usersIdSeller + ", carsIdCars="
				+ carsIdCars + ", paymentMethodIdCard=" + paymentMethodIdCard + ", depositMethodIdAccount="
				+ depositMethodIdAccount + "]";
	}
	
	
	
	
}
