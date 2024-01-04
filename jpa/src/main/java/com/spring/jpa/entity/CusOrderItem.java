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
@Table(name = "tb_cus_order_item_rk")
		
public class CusOrderItem {
	@Id                                 
	@GeneratedValue(generator = "UUID")                                                       
	@GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")              
	@Column	(name="id",updatable = false,nullable = false)
	@Type(type = "uuid-char")                          
	 private UUID id;
	
	 @Column(name ="order_id")
	 private String order_id;
	 
	 @Column(name ="item_name")
	 private String item_name;

	 @Column(name ="item_sku")
	 private String item_sku;

	 @Column(name ="item_rate")
	 private String item_rate;

	 @Column(name ="ordered_qty")
	 private String ordered_qty;

	 @Column(name ="order_total")
	 private String order_total;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public String getItem_sku() {
		return item_sku;
	}

	public void setItem_sku(String item_sku) {
		this.item_sku = item_sku;
	}

	public String getItem_rate() {
		return item_rate;
	}

	public void setItem_rate(String item_rate) {
		this.item_rate = item_rate;
	}

	public String getOrdered_qty() {
		return ordered_qty;
	}

	public void setOrdered_qty(String ordered_qty) {
		this.ordered_qty = ordered_qty;
	}

	public String getOrder_total() {
		return order_total;
	}

	public void setOrder_total(String order_total) {
		this.order_total = order_total;
	}


}
