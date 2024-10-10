package com.ecommerce.oneclickcar.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.ecommerce.oneclickcar.model.Cars;

@Service
public class CarsService {

	private static final ArrayList<Cars> list = new ArrayList<Cars>();
	
	public CarsService() {
		list.add(new Cars(1L,"SUV","Nissan","Kicks",2009,10000,"Estándar",600000,"img.png",2
				,"camioneta nueva",1,0,1L));
	}// CarsService

	public ArrayList<Cars> getAllCars() {
		return list;
	}// getAllCars

	public Cars getCar(Long carId) {
		Cars car = null;
		for(Cars carFromList : list) {
			if(carFromList.getId_cars() == carId) {
				car = carFromList;
				break;
			}// if
		}// for
		return car;
	}// getCar

	public Cars addCar(Cars car) {
		list.add(car);
		return car;
	}// addCar

	public Cars updateCar(Long carId, String type, String brand, String name, Integer year, Integer kilometer,
			String transmission, Integer price, String img, Integer owners, String description, Integer verified) {
		Cars car = null;
		for(Cars carFromList : list) {
			if(carFromList.getId_cars() == carId) {
				if (type != null) carFromList.setType(type);
				if (brand != null) carFromList.setBrand(brand);
				if (name != null) carFromList.setName(name);
				if (year != null) carFromList.setYear(year);
				if (kilometer != null) carFromList.setKilometer(kilometer);
				if (transmission != null) carFromList.setTransmission(transmission);
				if (price != null) carFromList.setPrice(price);
				if (img != null) carFromList.setImg(img);
				if (owners != null) carFromList.setOwners(owners);
				if (description != null) carFromList.setDescription(description);
				if (verified != null) carFromList.setVerified(verified);
				car = carFromList;
				break;
			}// if
		}// for
		return car;
	}// updateCar

	public Cars deleteCar(Long carId) {
		Cars car = null;
		for(Cars carFromList : list) {
			if(carFromList.getId_cars() == carId) {
				car = list.remove(list.indexOf(carFromList));
				break;
			}// if
		}// for
		return car;
	}// deleteCar

	
	
	
}
