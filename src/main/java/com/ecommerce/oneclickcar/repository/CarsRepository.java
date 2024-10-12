package com.ecommerce.oneclickcar.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.oneclickcar.model.Cars;

public interface CarsRepository extends JpaRepository<Cars,Long>{
	public Optional<Cars> findByNuSerial(String nuSerial);
	public Boolean existsByNuSerial(String nuSerial);
}
