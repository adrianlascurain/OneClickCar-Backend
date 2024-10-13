package com.ecommerce.oneclickcar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ecommerce.oneclickcar.dto.ChangePassword;
import com.ecommerce.oneclickcar.dto.UserCredentials;
import com.ecommerce.oneclickcar.model.Users;
import com.ecommerce.oneclickcar.repository.UsersRepository;

@Service
public class UsersService {

	@Autowired
	private PasswordEncoder encoder;
	
	private final UsersRepository usersRepository;
	
	@Autowired
	public UsersService(UsersRepository usersRepository){
		this.usersRepository = usersRepository;
	}// UsersService
	
	public List<Users> getAllUsers() {
		return usersRepository.findAll();
	}// getAllUsers

	public Users getUser(UserCredentials userCredentials, Long userId) {
			return usersRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("El usuario con el id [" + userId
					+ "] no existe."));
	}// getUser
	
	public Users addUser(Users user) {
		Optional<Users> userFromDB = usersRepository.findByEmail(user.getEmail());
		if(userFromDB.isEmpty()) {
			user.setPassword(encoder.encode(user.getPassword()));
			return usersRepository.save(user);
		}else {
			System.out.println("El correo electrónico [" + user.getEmail()
					+ "] ya está registrado.");
		}
		return user;
	}// addUsuario

	public Users deleteUser(Long userId) {
		Users user = null;
		if(usersRepository.existsById(userId)) {
			user = usersRepository.findById(userId).get();
			usersRepository.delete(user);
		}// for
		return user;
	}// deleteUser

	public Users updateUser(Long userId, String full_name, String phone_number, String birth_date) {
		Users user = null;
		if(usersRepository.existsById(userId)) {
			Users userFromDB = usersRepository.findById(userId).get();
			if(full_name != null) userFromDB.setFullName(full_name);
			if(phone_number != null) userFromDB.setPhoneNumber(phone_number);
			if(birth_date != null) userFromDB.setBirthDate(birth_date);
			user = userFromDB;
		}// if 
		return user;
	}// updateUser

	public Users updatePassword(Long userId, ChangePassword changePassword) {
		Users user = null;
		if(usersRepository.existsById(userId)) {
			Users userFromDB = usersRepository.findById(userId).get();
			if(userFromDB.getEmail().equalsIgnoreCase(changePassword.getEmail())) {
				if(encoder.matches(changePassword.getPassword(), userFromDB.getPassword())) {
					userFromDB.setPassword(encoder.encode(changePassword.getNpassword()));
					usersRepository.save(userFromDB);
					user = userFromDB;
				}// if passwords matches
			}// if emails matches
		}// if existById
		return user;
	}// updatePassword
	
	
}
