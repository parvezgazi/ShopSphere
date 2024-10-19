package com.gazi.service;

import com.gazi.exception.UserException;
import com.gazi.model.User;

public interface UserService {

	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public User findUserByEmail(String email) throws UserException;


}
