package com.spring.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.jpa.entity.CusAddress;
import com.spring.jpa.service.CusService;

@RestController
@RequestMapping("/CusAddress")
public class CusAddressController {
	
	@Autowired
private CusService cusservice;
		
	@PostMapping(value="/Address")
	public CusAddress CreateAddress(@RequestBody CusAddress Address) {
		cusservice.saveAddess(Address);
		return Address;
	}

}
