package com.ecommerce.oneclickcar.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.ecommerce.oneclickcar.dto.ChangePassword;
import com.ecommerce.oneclickcar.dto.UserCredentials;
import com.ecommerce.oneclickcar.model.Users;

@Service
public class UsersService {

	private static final ArrayList<Users> list = new ArrayList<Users>();
	
	public UsersService(){
		list.add(new Users(1L,"Queso oaxaca quesillo","5552565758","quesillo@oaxaca.com","10/12/2000","Ques4dill4","user"));
	}// UsersService
	
	public ArrayList<Users> getAllUsers() {
		return list;
	}// getAllUsers

	public Users getUser(UserCredentials userCredentials, Long userId) {
		Users user = null;
		for(Users userFromList: list) {
			if(userFromList.getId_account() == userId) {
				if(userFromList.getEmail().equalsIgnoreCase(userCredentials.getEmail())) {
					if(userFromList.getPassword().equals(userCredentials.getPassword())) {
						user = userFromList;
					}// if
					break;
				}// if
			}// if
		}// for
		return user;
	}// getUser
	
	public Users addUser(Users user) {
		boolean alreadyRegistered = false;
	
		for(Users userFromList: list) {
			if(userFromList.getEmail().equalsIgnoreCase(user.getEmail())) {
				alreadyRegistered = true;
				break;
			}// if
		}// for
		
		if(!alreadyRegistered) {
			list.add(user);
			return user;
		}else {
			return null;	
		}// else
		
	}// addUsuario

	public Users deleteUser(Long userId) {
		Users user = null;
		for(Users userFromList: list) {
			if(userFromList.getId_account() == userId) {
				user = list.remove(list.indexOf(userFromList));
				break;
			}// if
		}// for
		return user;
	}// deleteUser

	public Users updateUser(Long userId, String full_name, String phone_number, String birth_date, UserCredentials userCredentials) {
		Users user = null;
		for(Users userFromList: list) {
			if(userFromList.getId_account() == userId) {
				if(userFromList.getEmail().equalsIgnoreCase(userCredentials.getEmail())) {
					if(userFromList.getPassword().equals(userCredentials.getPassword())) {
						if(full_name != null) userFromList.setFull_name(full_name);
						if(phone_number != null) userFromList.setPhone_number(phone_number);
						if(birth_date != null) userFromList.setBirth_date(birth_date);
						user = userFromList;
					}// if
					break;
				}// if
			}// if
		}// for
		return user;
	}// updateUser

	public Users updatePassword(Long userId, ChangePassword changePassword) {
		Users user = null;
		
		for(Users userFromList: list) {
			if(userFromList.getId_account() == userId) {
				if(userFromList.getEmail().equalsIgnoreCase(changePassword.getEmail())) {
					if(userFromList.getPassword().equals(changePassword.getPassword())) {
						userFromList.setPassword(changePassword.getNpassword());
						user = userFromList;
					}// if
				}// if
			}// if
		}// for
		return user;
	}// updatePassword

	

	
	
	

	
	
}
