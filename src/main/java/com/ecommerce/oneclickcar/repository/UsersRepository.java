package com.ecommerce.oneclickcar.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.oneclickcar.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{

	Optional<Users> findByEmail(String email);

}
