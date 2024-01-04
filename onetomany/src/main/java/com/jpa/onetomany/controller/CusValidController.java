package com.jpa.onetomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.onetomany.entity.CusValid;
import com.jpa.onetomany.service.CusValidService;

@RestController
@RequestMapping("/cusValid")
public class CusValidController {
	

	@Autowired
	public CusValidService cusValidService;
	
	@PostMapping(value="/valid")
	public ResponseEntity<String> createCusvalid(@RequestBody CusValid cusValid) {
		try {
			CusValid validEmail = cusValidService.findByEmailId(cusValid.getEmail());

			if (null != validEmail) {
				throw new Exception("duplicate mail value");
			}
			CusValid validPhone = cusValidService.findByPhoneNo(cusValid.getPhone());

			if (null != validPhone) {
				throw new Exception("duplicate phone value");
			}
			cusValidService.saveCus(cusValid);
			return ResponseEntity.ok("Email and phone sent successfully");
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body("Error sending mail and phone: " + e);

		}

	}
}