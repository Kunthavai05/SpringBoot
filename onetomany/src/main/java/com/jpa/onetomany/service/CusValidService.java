package com.jpa.onetomany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.onetomany.entity.CusValid;
import com.jpa.onetomany.repository.CusValidRepository;
@Service
public class CusValidService {
	
	@Autowired
	public CusValidRepository cusValidRepository;

	public void saveCus(CusValid cusValid) {
		cusValidRepository.save(cusValid);
	}

	public CusValid findByEmailId(String email) {
		
		return cusValidRepository.findByEmail(email);
	}

	public CusValid findByPhoneNo(String phone) {
		
		return cusValidRepository.findByPhone(phone);
	}

}
