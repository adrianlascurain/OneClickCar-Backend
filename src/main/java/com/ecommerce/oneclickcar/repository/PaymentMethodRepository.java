package com.ecommerce.oneclickcar.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.oneclickcar.model.PaymentMethod;

@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {

	Optional <PaymentMethod> findByNumberCard(String numberCard);
}
