package com.ecommerce.oneclickcar.controllers;

import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;

import com.ecommerce.oneclickcar.dto.Token;
import com.ecommerce.oneclickcar.dto.UserCredentials;
import com.ecommerce.oneclickcar.model.Users;
import com.ecommerce.oneclickcar.security.JwtFilter;
import com.ecommerce.oneclickcar.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping(path="/api/login/")
public class LoginController {
	private final UsersService usersService;
	
	@Autowired
	public LoginController(UsersService usersService) {
		this.usersService = usersService;
	}
	
	@PostMapping
	public Token loginUser(@RequestBody UserCredentials userCredentials) throws ServletException {
		if (usersService.validateUser(userCredentials)) {
			System.out.println("Users valido " + userCredentials.getEmail());
			Users user = usersService.getUsersByEmail(userCredentials.getEmail());
			return new Token(generateToken(userCredentials.getEmail(), user.getTypeUser()));
		}//validateUser
		throw new ServletException("Nombre de users o contraseña incorrectos [" + 
				userCredentials.getEmail() +"]");
	}//loginUser

	private String generateToken(String email, String typeUsers) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.HOUR,12); //Prueba/Desarrollo
	//calendar.add(Calendar.HOUR,10);
	
		return Jwts.builder().setSubject(email).claim("role", typeUsers)
				.setIssuedAt(new Date())
				.setExpiration(calendar.getTime())
				.signWith(SignatureAlgorithm.HS256,JwtFilter.secret)
				.compact();
	}//generateToken
}//class LoginController
