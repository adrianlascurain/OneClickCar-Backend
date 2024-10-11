package com.ecommerce.oneclickcar.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ecommerce.oneclickcar.model.DepositMethod;

@Repository
public interface DepositMethodRepository extends JpaRepository<DepositMethod, Long>{
	Optional <DepositMethod> findByAccountBank(String accountBank);
}
