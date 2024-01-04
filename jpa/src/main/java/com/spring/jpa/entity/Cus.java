package com.spring.jpa.entity;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="tb_cus_rk")
public class Cus{

	@Id                                 
	@GeneratedValue(generator = "UUID")                                                       
	@GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")              
	@Column	(name="id",updatable = false,nullable = false)
	@Type(type = "uuid-char")                          
	 private UUID id;
	
	 @Column(name ="name")
	 private String name;
	 
	 @Column(name ="code")
	 private String code;
	 
	 @Column(name ="email")
	 private String email;
	 
	 @Column(name ="phone")
	 private String phone;
	 
	 @Column(name ="contact_person_name")
	 private String contact_person_name;
	 
	 @Column(name ="contact_preson_phone")
	 private String contact_preson_phone;
	 
	 @Column(name ="status")
	 private String status;
	 
	 @Column(name ="create_date")
	 private Date create_date;
	 
	 @Column(name ="created_by")
	 private String created_by;
	 
	 @Column(name ="modified_date")
	 private Date modified_date;
	 
	 @Column(name ="modified_by")
	 private String modified_by;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getContact_person_name() {
		return contact_person_name;
	}

	public void setContact_person_name(String contact_person_name) {
		this.contact_person_name = contact_person_name;
	}

	public String getContact_preson_phone() {
		return contact_preson_phone;
	}

	public void setContact_preson_phone(String contact_preson_phone) {
		this.contact_preson_phone = contact_preson_phone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public Date getModified_date() {
		return modified_date;
	}

	public void setModified_date(Date modified_date) {
		this.modified_date = modified_date;
	}

	public String getModified_by() {
		return modified_by;
	}

	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	 
	
	 
	 
}
  