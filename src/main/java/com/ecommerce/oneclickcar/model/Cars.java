package com.ecommerce.oneclickcar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cars")
public class Cars {

	// Table fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCar" , nullable = false, unique = true) 
	private Long idCar;
	
	@Column(nullable = false) private String type;
	@Column(nullable = false) private String brand;
	@Column(nullable = false) private String name;
	@Column(nullable = false) private Integer year;
	@Column(nullable = false) private Integer kilometer;
	@Column(nullable = false) private String transmission;
	@Column(nullable = false) private Integer price;
	@Column(nullable = false) private String img;
	@Column(nullable = false) private Integer owners;
	@Column(nullable = false) private String description;
	@Column(nullable = false) private Integer verified;
	@Column(nullable = false) private Integer sold;
	@Column(nullable = false, unique = true) private String nuSerial;
	@Column(nullable = false) private Long sellerIdUser;

	
	// Constructors
	public Cars() {}

	public Cars(String type, String brand, String name, Integer year, Integer kilometer, String transmission,
			Integer price, String img, Integer owners, String description, Integer verified, Integer sold,
			Long sellerIdUser) {
		this.type = type;
		this.brand = brand;
		this.name = name;
		this.year = year;
		this.kilometer = kilometer;
		this.transmission = transmission;
		this.price = price;
		this.img = img;
		this.owners = owners;
		this.description = description;
		this.verified = verified;
		this.sold = sold;
		this.sellerIdUser = sellerIdUser;
	}// Cars

	// Getters and setters
	public Long getIdCar() {
		return idCar;
	}

	public void setIdCar(Long idCar) {
		this.idCar = idCar;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getKilometer() {
		return kilometer;
	}

	public void setKilometer(Integer kilometer) {
		this.kilometer = kilometer;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Integer getOwners() {
		return owners;
	}

	public void setOwners(Integer owners) {
		this.owners = owners;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getVerified() {
		return verified;
	}

	public void setVerified(Integer verified) {
		this.verified = verified;
	}

	public Integer getSold() {
		return sold;
	}

	public void setSold(Integer sold) {
		this.sold = sold;
	}
	
	public String getNuSerial() {
		return nuSerial;
	}

	public void setNuSerial(String nuSerial) {
		this.nuSerial = nuSerial;
	}

	public Long getSellerIdUser() {
		return sellerIdUser;
	}

	public void setSellerIdUser(Long sellerIdUser) {
		this.sellerIdUser = sellerIdUser;
	}

	// toString
	@Override
	public String toString() {
		return "Cars [idCar=" + idCar + ", type=" + type + ", brand=" + brand + ", name=" + name + ", year=" + year
				+ ", kilometer=" + kilometer + ", transmission=" + transmission + ", price=" + price + ", img=" + img
				+ ", owners=" + owners + ", description=" + description + ", verified=" + verified + ", sold=" + sold
				+ ", sellerIdUser=" + sellerIdUser + "]";
	} // toString
	
	
}// Cars
