package com.ecommerce.oneclickcar.dto;

public class Token {

private final String accessToken;
	
	public Token(String accesToken) {
		this.accessToken = accesToken;
	}//constructor

	

	public String getAccessToken() {
		return accessToken;
	}//getAccessToken
	
}//Token
