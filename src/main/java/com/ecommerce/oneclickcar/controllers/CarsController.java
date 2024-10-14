package com.ecommerce.oneclickcar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.oneclickcar.model.Cars;
import com.ecommerce.oneclickcar.service.CarsService;

@RestController
@RequestMapping(path = "/api/cars/")
public class CarsController {
	
	private final CarsService carsService;
	
	@Autowired
	public CarsController(CarsService carsService) {
		this.carsService = carsService;
	} //CarsController 
	
	@CrossOrigin(origins = "http://127.0.0.1:5501/")
	@GetMapping
	public List<Cars> getCars() {
		return carsService.getAllCars();
	}// getCars
	
	@CrossOrigin(origins = "http://127.0.0.1:5501/")
	@GetMapping(path="{carId}")
	public Cars getCar(@PathVariable("carId") Long carId) {
		return carsService.getCar(carId);
	}// getCar
	
	@CrossOrigin(origins = "http://127.0.0.1:5501/")
	@PostMapping
	public Cars addCar(@RequestBody Cars car) {
		return carsService.addCar(car);
	}// addCar
	
	@CrossOrigin(origins = "http://127.0.0.1:5501/")
	@PutMapping(path="{carId}")
	public Cars updateCar(@PathVariable("carId") Long carId,
			@RequestParam(required = false) String type,
			@RequestParam(required = false) String brand,
			@RequestParam(required = false) String name,
			@RequestParam(required = false) Integer year,
			@RequestParam(required = false) Integer kilometer,
			@RequestParam(required = false) String transmission,
			@RequestParam(required = false) Integer price,
			@RequestParam(required = false) String img,
			@RequestParam(required = false) Integer owners,
			@RequestParam(required = false) String description,
			@RequestParam(required = false) Integer verified,
			@RequestParam(required=false) Integer sold,
			@RequestParam(required=false) Long usersIdSeller) {
		return carsService.updateCar(carId,type,brand,name,year
				,kilometer,transmission,price,img,owners,description
				,verified, sold, usersIdSeller);
	}//updateCar
	
	@CrossOrigin(origins = "http://127.0.0.1:5501/")
	@DeleteMapping(path="{carId}")
	public Cars deleteCar(@PathVariable("carId") Long carId) {
		return carsService.deleteCar(carId);
	}
}
