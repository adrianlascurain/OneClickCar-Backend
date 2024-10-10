package com.ecommerce.oneclickcar.model;

//import java.time.Year;

public class Cars {

	private Long id_cars;
	private String type;
	private String brand;
	private String name;
	private int year;
	private int kilometer;
	private String transmission;
	private int price;
	private String img;
	private int owners;
	private String description;
	private int verified;
	private int sold;
	private Long seller_id_user;
	
	// Constructors
	public Cars(Long id_cars, String type, String brand, String name, int year, int kilometer, String transmission,
			int price, String img, int owners, String description, int verified, int sold, Long seller_id_user) {
		this.id_cars = id_cars;
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
		this.seller_id_user = seller_id_user;
	}
	
	public Cars() {}
	
	// Getters and setters
	public Long getId_cars() {
		return id_cars;
	}
	
	public void setId_cars(Long id_cars) {
		this.id_cars = id_cars;
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
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getKilometer() {
		return kilometer;
	}
	
	public void setKilometer(int kilometer) {
		this.kilometer = kilometer;
	}
	
	public String getTransmission() {
		return transmission;
	}
	
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getImg() {
		return img;
	}
	
	public void setImg(String img) {
		this.img = img;
	}
	
	public int getOwners() {
		return owners;
	}
	
	public void setOwners(int owners) {
		this.owners = owners;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getVerified() {
		return verified;
	}
	
	public void setVerified(int verified) {
		this.verified = verified;
	}
	
	public int getSold() {
		return sold;
	}
	
	public void setSold(int sold) {
		this.sold = sold;
	}
	
	public Long getSeller_id_user() {
		return seller_id_user;
	}
	
	public void setSeller_id_user(Long seller_id_user) {
		this.seller_id_user = seller_id_user;
	}

	@Override
	public String toString() {
		return "CarsService [id_cars=" + id_cars + ", type=" + type + ", brand=" + brand + ", name=" + name + ", year="
				+ year + ", kilometer=" + kilometer + ", transmission=" + transmission + ", price=" + price + ", img="
				+ img + ", owners=" + owners + ", description=" + description + ", verified=" + verified + ", sold="
				+ sold + ", Users_id_user=" + seller_id_user + "]";
	}
	
}
