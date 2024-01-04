package com.jpa.onetomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jpa.onetomany.entity.School;
import com.jpa.onetomany.service.SclService;



@RestController
@RequestMapping("/student")
public class sclController {
	

	@Autowired
	public SclService sclService;

	@PostMapping(value = "/encrypt")
	public String Datatransfer(@RequestBody School school ) {
		
		 sclService.usertoschl(school);

		
		return "created";

	}
}
	
	


