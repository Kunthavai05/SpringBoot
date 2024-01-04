package com.jpa.onetomany.service;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.jpa.onetomany.entity.PasswordUtil;
import com.jpa.onetomany.entity.School;
import com.jpa.onetomany.entity.User;
import com.jpa.onetomany.repository.SclRepository;
import com.jpa.onetomany.repository.UserRepository;

@Service
public class SclService {
	
	@Autowired
	public  SclRepository sclRepository;
	
	@Autowired
	public  UserRepository userRepository;
	

	public User usertoschl(School school) {
		
		
		School SchoolObj = sclRepository.save(school);
		String phonenum =PasswordUtil.getPassword(school.getPhone());
		
		User userObj = new User();
		userObj.setRefId(SchoolObj.getId());
		userObj.setUserName(SchoolObj.getStuName());
		userObj.setPassword(phonenum);
		userObj.setUserDob(SchoolObj.getStuDob());
		userObj.setStatus(SchoolObj.getStatus());		
		
		return userRepository.save(userObj);	
		
	}
	

	


}
 