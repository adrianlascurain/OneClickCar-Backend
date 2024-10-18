package com.ecommerce.oneclickcar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PaymentMethods")
public class PaymentMethod {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Long idCard;
	@Column(nullable=false)
	private String nameCard;
	@Column(nullable=false)
	private String typeCard;
	@Column(nullable=false)
	private String numberCard;
	@Column(nullable=false)
	private String dateCard;
	@Column(nullable=false)
	private String cvvCard;
	@Column(nullable = false)
	private String nameBank;
	@Column(nullable=false)
	private Long usersIdUser;
	
	// Constructores
	public PaymentMethod() {
	}

	public PaymentMethod(String nameCard, String typeCard, String numberCard, String dateCard,
			String cvvCard,String nameBank, Long usersIdUser) {
		this.nameCard = nameCard;
		this.typeCard = typeCard;
		this.numberCard = numberCard;
		this.dateCard = dateCard;
		this.cvvCard = cvvCard;
		this.nameBank = nameBank;
		this.usersIdUser = usersIdUser;
	}
	// Setters and getters

	public Long getIdCard() {
		return idCard;
	}

	public void setIdCard(Long idCard) {
		this.idCard = idCard;
	}

	public String getNameCard() {
		return nameCard;
	}

	public void setNameCard(String nameCard) {
		this.nameCard = nameCard;
	}

	public String getTypeCard() {
		return typeCard;
	}

	public void setTypeCard(String typeCard) {
		this.typeCard = typeCard;
	}

	public String getNumberCard() {
		return numberCard;
	}

	public void setNumberCard(String numberCard) {
		this.numberCard = numberCard;
	}

	public String getDateCard() {
		return dateCard;
	}

	public void setDateCard(String dateCard) {
		this.dateCard = dateCard;
	}

	public String getCvvCard() {
		return cvvCard;
	}

	public void setCvvCard(String cvvCard) {
		this.cvvCard = cvvCard;
	}

	public String getNameBank() {
		return nameBank;
	}

	public void setNameBank(String nameBank) {
		this.nameBank = nameBank;
	}

	public Long getUsersIdUser() {
		return usersIdUser;
	}

	public void setUsersIdUser(Long usersIdUser) {
		this.usersIdUser = usersIdUser;
	}
	
	}
