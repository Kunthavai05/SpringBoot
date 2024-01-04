package com.jpa.onetomany.service;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jpa.onetomany.repository.CusRepository;
@Service
public class CusService {
	
	
	@Autowired
	public CusRepository cusRepository;
	
	

/*	public void saveCus(Cus cus) {
		cusRepository.save(cus);
		
	}*/



	public void deleteorder(UUID id) {
		cusRepository.deleteById(id);
		
	}

	
}
