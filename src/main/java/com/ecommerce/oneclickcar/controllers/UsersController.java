package com.ecommerce.oneclickcar.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.oneclickcar.dto.ChangePassword;
import com.ecommerce.oneclickcar.dto.UserCredentials;
import com.ecommerce.oneclickcar.model.Users;
import com.ecommerce.oneclickcar.service.UsersService;

@RestController
@RequestMapping(path="api/users/")
public class UsersController {
	
	private final UsersService userService;
	
	@Autowired
	public UsersController(UsersService userService) {
		this.userService = userService;
	}// UserController
	
	@GetMapping
	public ArrayList<Users> getAllUsers() {
		return userService.getAllUsers();
	}// getAllUsers
	
	@GetMapping(path="{userId}")
	public Users getUser(@RequestBody UserCredentials userCredentials,@PathVariable("userId") Long userId) {
		return userService.getUser(userCredentials, userId);
	}// getUser
	
	@PostMapping
	public Users createUser(@RequestBody Users user) {
		return userService.addUser(user);
	}// createUser
	
	@PutMapping(path="{userId}")
	public Users updateUser(@PathVariable("userId") Long userId,
			@RequestParam(required = false) String full_name,
			@RequestParam(required = false) String phone_number,
			@RequestParam(required = false) String birth_date,
			@RequestBody UserCredentials userCredentials) {
		return userService.updateUser(userId, full_name, phone_number, birth_date, userCredentials);
	}// updateUser
	
	@PutMapping(path="/passwords/{userId}")
	public Users updatePassword(@PathVariable("userId") Long userId,
			@RequestBody ChangePassword changePassword) {
		return userService.updatePassword(userId, changePassword);
	}// updatePassword
	
	@DeleteMapping(path="{userId}")
	public Users deleteUser(@PathVariable("userId") Long userId) {
		return userService.deleteUser(userId);
	}// deleteUser
}
