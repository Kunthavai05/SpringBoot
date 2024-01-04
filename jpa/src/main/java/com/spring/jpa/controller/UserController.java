package com.spring.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.jpa.entity.User;
import com.spring.jpa.service.UserService;


@RestController
@RequestMapping("/User" )
public class UserController {

	@Autowired
	private UserService userService;
	
@PostMapping(value = "/create")
	public User creatUser(@RequestBody User user) {
	//user.setCreate_date(null);
	userService.saveUser(user);
	return user;
		
	}
}
