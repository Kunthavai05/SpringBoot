package com.jpa.onetomany.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.onetomany.service.CusService;

@RestController
@RequestMapping("/customer")
public class CusController {

		
		@Autowired
		public CusService cusservice;
		
		
	/*	@PostMapping(value="/cusrk")
		public Cus CreateCus(@RequestBody Cus cus) {
			cusservice.saveCus(cus);
			return cus;
		}*/
		
		
		@DeleteMapping(value = "/deleteorder/{id}")
		public String deleteCustomer(@PathVariable("id") UUID id) {
			cusservice.deleteorder(id);
	
			return "deleted";
	}

	}


