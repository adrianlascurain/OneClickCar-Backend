package com.ecommerce.oneclickcar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUser" , nullable = false, unique = true) 
	private Long idUser;
	
	@Column(nullable = false) private String fullName;
	@Column(nullable = false) private String phoneNumber;
	@Column(nullable = false, unique = true) private String email;
	@Column(nullable = false) private String birthDate;
	@Column(nullable = false) private String password;
	@Column(nullable = false) private String typeUser;
	
   // Constructors
	public Users(String fullName, String phoneNumber, String email, String birthDate, String password, String typeUser) {
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.birthDate = birthDate;
		this.password = password;
		this.typeUser = typeUser;
	}
	
	public Users() {}
	
	// Getters and setters
	
	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTypeUser() {
		return typeUser;
	}

	public void setTypeUser(String typeUser) {
		this.typeUser = typeUser;
	}

	
	// toString
	@Override
	public String toString() {
		return "Users [idUser=" + idUser + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", email="
				+ email + ", birthDate=" + birthDate + ", password=" + password + ", typeUser=" + typeUser + "]";
	}

	
	


	
	
	
}
