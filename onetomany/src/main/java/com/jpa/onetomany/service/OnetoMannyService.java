package com.jpa.onetomany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.onetomany.entity.ParentEntity;
import com.jpa.onetomany.repository.CusRepository;
import com.jpa.onetomany.repository.ParentRepository;

@Service
public class OnetoMannyService {
	
		@Autowired
		public ParentRepository repository;
		
		@Autowired
		public CusRepository cusRepository;

		public void saveCustomer(ParentEntity parentEntity) {
			repository.save(parentEntity);
			
		}

//		public void saveCuss(Cus cus) {
//			cusRepository.save(cus);
//			
//		}

	}


