package com.spring.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.spring.jpa.repository.UserRepository;
import com.spring.jpa.entity.User;

@Service
public class UserService {

	@Autowired
	
	private UserRepository userRepository;
	
	public void saveUser(User user) {
		
		userRepository.save(user);
	}
}
