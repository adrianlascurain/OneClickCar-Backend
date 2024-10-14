package com.ecommerce.oneclickcar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.oneclickcar.model.Cars;
import com.ecommerce.oneclickcar.repository.CarsRepository;

@Service
public class CarsService {

	public final CarsRepository carsRepository;
	
	@Autowired
	public CarsService(CarsRepository carsRepository) {
		this.carsRepository = carsRepository;
	}// CarsService

	public List<Cars> getAllCars() {
		return carsRepository.findAll();
	}// getAllCars

	public Cars getCar(Long carId) {
		return carsRepository.findById(carId).orElseThrow(() -> new IllegalArgumentException("El auto con el id [" + carId
				+ "] no existe."));
	}// getCar

	public Cars addCar(Cars car) {
		Optional<Cars> carFromDB = carsRepository.findByNuSerial(car.getNuSerial());
		if(carFromDB.isEmpty()) {
			return carsRepository.save(car);
		}else {
			System.out.println("El auto con el número de serie [" + car.getNuSerial()
					+ "] ya está registrado.");
		}// else
		return car;
	}// addCar

	public Cars updateCar(Long carId, String type, String brand, String name, Integer year, Integer kilometer,
			String transmission, Integer price, String img, Integer owners, String description, Integer verified, Integer sold,
			Long usersIdSeller) {
		Cars car = null;
		if(carsRepository.existsById(carId)) {
				Cars carFromDB = carsRepository.findById(carId).get();
				if (type != null) carFromDB.setType(type);
				if (brand != null) carFromDB.setBrand(brand);
				if (name != null) carFromDB.setName(name);
				if (year != null) carFromDB.setYear(year);
				if (kilometer != null) carFromDB.setKilometer(kilometer);
				if (transmission != null) carFromDB.setTransmission(transmission);
				if (price != null) carFromDB.setPrice(price);
				if (img != null) carFromDB.setImg(img);
				if (owners != null) carFromDB.setOwners(owners);
				if (description != null) carFromDB.setDescription(description);
				if (verified != null) carFromDB.setVerified(verified);
				if (sold != null) carFromDB.setSold(sold);
				if (usersIdSeller != null) carFromDB.setUsersIdSeller(usersIdSeller);
				carsRepository.save(carFromDB);
				car = carFromDB;
		}

		return car;
	}// updateCar

	public Cars deleteCar(Long carId) {
		Cars car = null;
		if(carsRepository.existsById(carId)) {
			car = carsRepository.findById(carId).get();
			carsRepository.deleteById(carId);
		}// if 
		return car;
	}// deleteCar

	
	
	
}
