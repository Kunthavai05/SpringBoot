package com.jpa.onetomany.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_cus_valid_rk")
public class Valid {
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "id", updatable = false, nullable = false)
	@Type(type = "uuid-char")
	private UUID id;

	@Column(name = "name")
	private String name;

	@Column(name = "code")
	private String code;
	
	@Column(name = "email")
	private String email;

	@Column(name = "phone")
	private String phone;

	@Column(name = "contact_person_name")
	private String contactPersonName;

	@Column(name = "contact_preson_phone")
	private String contactPresonPhone;

	@Column(name = "status")
	private String status;

	@Column(name = "create_date")
	private String createDate;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "modified_date")
	private String modifiedDate;

	@Column(name = "modified_by")
	private String modifiedBy;


}
