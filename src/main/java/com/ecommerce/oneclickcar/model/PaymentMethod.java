package com.ecommerce.oneclickcar.model;


public class PaymentMethod {
	private Long id_card;
	private String name_card;
	private String type_card;
	private String number_card;
	private String date_card;
	private String cvv_card;
	private Long users_id_user;
	
	// Constructores
	public PaymentMethod() {
	}

	public PaymentMethod(Long id_card, String name_card, String type_card, String number_card, String date_card,
			String cvv_card, Long users_id_user) {
		this.id_card = id_card;
		this.name_card = name_card;
		this.type_card = type_card;
		this.number_card = number_card;
		this.date_card = date_card;
		this.cvv_card = cvv_card;
		this.users_id_user = users_id_user;
	}
	// Setters and getters

	public Long getId_card() {
		return id_card;
	}

	public void setId_card(Long id_card) {
		this.id_card = id_card;
	}

	public String getName_card() {
		return name_card;
	}

	public void setName_card(String name_card) {
		this.name_card = name_card;
	}

	public String getType_card() {
		return type_card;
	}

	public void setType_card(String type_card) {
		this.type_card = type_card;
	}

	public String getNumber_card() {
		return number_card;
	}

	public void setNumber_card(String number_card) {
		this.number_card = number_card;
	}

	public String getDate_card() {
		return date_card;
	}

	public void setDate_card(String date_card) {
		this.date_card = date_card;
	}

	public String getCvv_card() {
		return cvv_card;
	}

	public void setCvv_card(String cvv_card) {
		this.cvv_card = cvv_card;
	}

	public Long getUsers_id_user() {
		return users_id_user;
	}

	public void setUsers_id_user(Long users_id_user) {
		this.users_id_user = users_id_user;
	}
	
	}
