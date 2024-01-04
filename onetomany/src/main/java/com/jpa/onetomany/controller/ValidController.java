package com.jpa.onetomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jpa.onetomany.entity.Valid;
import com.jpa.onetomany.service.ValidService;


@RestController
@RequestMapping("/Valid")
public class ValidController {
	
	@Autowired
	public ValidService ValidService;
	

	@PostMapping(value="/value")
	public String CreateValid(@RequestBody Valid valid)throws RuntimeException{
		Valid validName = ValidService.findByName(valid.getName());
		if(null!=validName) {
			throw new RuntimeException("duplicate name validated");
		}
		Valid validCode = ValidService.findByCode(valid.getCode());
	    if(null!=validCode) {
			throw new RuntimeException("duplicate code validated");	
		}
	    
	    Valid validEmail = ValidService.findBYEmail(valid.getEmail());
	    if(null!=validEmail) {
			throw new RuntimeException("duplicate email validated");	
		}
	    
	    Valid validPhone = ValidService.findByPhone(valid.getPhone());
	    if(null!=validPhone) {
			throw new RuntimeException("duplicate phone validated");	
		}
	    
	    Valid validcontact_person_name = ValidService.findByContactPersonname(valid.getContactPersonName());
	    if(null!=validcontact_person_name) {
			throw new RuntimeException("duplicate contact_person_name validated");	
		}
	    
	    Valid validcontact_preson_phone = ValidService.findByContactPresonphone(valid.getContactPresonPhone());
	    if(null!=validcontact_preson_phone) {
			throw new RuntimeException("duplicate contact_preson_phone validated");	
		}
	    
	    Valid validstatus = ValidService.findBystatus(valid.getStatus());
	    if(null!=validstatus) {
			throw new RuntimeException("duplicate status validated");	
		}
	    
	    Valid validcreate_date = ValidService.findByCreateDate(valid.getCreateDate());
	    if(null!=validcreate_date) {
			throw new RuntimeException("duplicate create_date validated");	
		}
	    
	    Valid validcreated_by = ValidService.findByCreatedBy(valid.getCreatedBy());
	    if(null!=validcreated_by) {
			throw new RuntimeException("duplicate created_by validated");	
		}
	    
	    Valid validmodified_date = ValidService.findByModifiedDate(valid.getModifiedDate());
	    if(null!=validmodified_date) {
			throw new RuntimeException("duplicate modified_date validated");	
		}
	    
	    Valid validmodified_by = ValidService.findBYModifiedBy(valid.getModifiedBy());
	    if(null!=validmodified_by) {
			throw new RuntimeException("duplicate modified_by validated");	
		}
	   
	  
		ValidService.savevalid(valid);

	    return "Valid";
	}

}
