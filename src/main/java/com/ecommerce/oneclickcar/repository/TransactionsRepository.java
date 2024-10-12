package com.ecommerce.oneclickcar.repository;

import com.ecommerce.oneclickcar.model.Transactions;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface TransactionsRepository extends JpaRepository<Transactions, Long> {
	Optional<Transactions> findByCarsIdCars(Long carsIdCars);
}

