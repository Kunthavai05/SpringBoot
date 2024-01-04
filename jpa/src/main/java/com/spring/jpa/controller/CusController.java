package com.spring.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.jpa.entity.Cus;
import com.spring.jpa.service.CusService;

@RestController
@RequestMapping("/customer")
public class CusController {
	
	@Autowired
	private CusService cusservice;
	
	
	@PostMapping(value="/cusrk")
	public Cus CreateCus(@RequestBody Cus cus) {
		cusservice.savecus(cus);
		return cus;
	}

}
