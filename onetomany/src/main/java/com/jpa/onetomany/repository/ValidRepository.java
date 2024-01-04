package com.jpa.onetomany.repository;

import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.jpa.onetomany.entity.Valid;


@Repository
public interface ValidRepository extends CrudRepository<Valid, UUID> {

	public Valid findByName(String name);

	public Valid findByCode(String code);

	public Valid findByEmail(String email);

	public Valid findByPhone(String phone);

	public Valid findByStatus(String status);

	public Valid findByCreateDate(String createDate);

	public Valid findByCreatedBy(String createdBy);

	public Valid findByContactPersonName(String contact_person_name);

	public Valid findByContactPresonPhone(String contact_preson_phone);

	public Valid findByModifiedDate(String modified_date);

	public Valid findByModifiedBy(String modified_by);

	
	
	
	

}
