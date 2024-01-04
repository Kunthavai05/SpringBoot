package com.spring.jpa.entity;
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

@Entity
@Table(name ="tb_user_kun" )
public class User {
	
	@Id                                                                                      
	@GeneratedValue(generator = "UUID")                                                       
	@GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")              
	@Column	(name="id",updatable = false,nullable = false)
	@Type(type = "uuid-char")                          
	 private UUID id;
	
	 @Column(name ="user_name")
	 private String user_name;
	 
	 @Column(name ="email_id")
	 private String email_id;
	 
	 @Column(name ="create_date")
	 private String create_date;
	 
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
}
