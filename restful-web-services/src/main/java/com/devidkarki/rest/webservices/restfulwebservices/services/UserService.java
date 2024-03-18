package com.devidkarki.rest.webservices.restfulwebservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devidkarki.rest.webservices.restfulwebservices.model.User;
import com.devidkarki.rest.webservices.restfulwebservices.repository.UserRepository;

//service layer for user-related business logic
@Service
public class UserService {
	
	UserRepository userRepository;
	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}

}
