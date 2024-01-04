package com.jpa.onetomany.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.onetomany.entity.CusValid;

@Repository
public interface CusValidRepository extends CrudRepository<CusValid, UUID>{
	
	public CusValid findByEmail(String email);
	public CusValid findByPhone(String phone);
	
	

}
