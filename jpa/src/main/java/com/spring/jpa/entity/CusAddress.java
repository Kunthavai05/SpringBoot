package com.spring.jpa.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "tb_cus_address_rk")
public class CusAddress {
	
	@Id                                 
	@GeneratedValue(generator = "UUID")                                                       
	@GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")              
	@Column	(name="id",updatable = false,nullable = false)
	@Type(type = "uuid-char")                          
	 private UUID id;
	
	@Column(name ="customer_id")
	 private String customer_id;
	
	@Column(name ="address_type")
	 private String address_type;
	
	@Column(name ="address_line2")
	 private String address_line2;
	
	@Column(name ="city")
	 private String city;
	
	@Column(name ="state")
	 private String state;
	
	@Column(name ="country")
	 private String country;
	
	@Column(name ="postal_code")
	 private String postal_code;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getAddress_type() {
		return address_type;
	}

	public void setAddress_type(String address_type) {
		this.address_type = address_type;
	}

	public String getAddress_line2() {
		return address_line2;
	}

	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	
	
}
