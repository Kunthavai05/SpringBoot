package com.jpa.onetomany.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jpa.onetomany.entity.Valid;
import com.jpa.onetomany.repository.ValidRepository;


@Service
public class ValidService {
	
	@Autowired
	public ValidRepository ValidRepository;

	public Valid findByName(String name) {
		return ValidRepository.findByName(name);
	}

	public Valid findByCode(String code) {
		return ValidRepository.findByCode(code);
	}

	public Valid findBYEmail(String email) {
		return ValidRepository.findByEmail(email);
	}

	public Valid findByPhone(String phone) {
		return ValidRepository.findByPhone(phone);
	}

	public Valid findstatus(String status) {
		return ValidRepository.findByStatus(status);
	}
	public Valid findByContactPersonname(String contact_person_name) {	
		return  ValidRepository.findByContactPersonName(contact_person_name);
	}

	public Valid findByContactPresonphone(String contact_preson_phone) {
		return ValidRepository.findByContactPresonPhone(contact_preson_phone);
	}

	public Valid findBystatus(String status) {
		return  ValidRepository.findByStatus(status);
	}

	public Valid findByCreateDate(String create_date) {
		return ValidRepository.findByCreateDate(create_date);
	}

	public Valid findByCreatedBy(String created_by) {	
		return ValidRepository.findByCreatedBy(created_by);
	}

	public Valid findByModifiedDate(String modified_date) {
		return ValidRepository.findByModifiedDate(modified_date);
	}

	public Valid findBYModifiedBy(String modified_by) {	
		return ValidRepository.findByModifiedBy(modified_by);
	}

	public void savevalid(Valid validation) {
		ValidRepository.save(validation);
		
	}
	
}
