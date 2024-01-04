package com.jpa.onetomany.entity;

import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "tb_cus_order_rk")
public class CusOrder {
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "id", updatable = false, nullable = false)
	@Type(type = "uuid-char")
	private UUID id;

	@Column(name = "order_no")
	private String order_no;

	@Column(name = "order_date")
	private String order_date;

	@Column(name = "no_of_items")
	private String no_of_items;

	@Column(name = "order_sub_total")
	private String order_sub_total;

	@Column(name = "order_discount")
	private String order_discount;

	@Column(name = "order_total_amount")
	private String order_total_amount;

	@Column(name = "payment_type")
	private String payment_type;

	@Column(name = "delivery_date")
	private String delivery_date;

	@Column(name = "status")
	private String status;

	@Column(name = "created_date")
	private String created_date;

	@Column(name = "created_by")
	private String created_by;

	@Column(name = "modified_date")
	private String modified_date;

	@Column(name = "modified_by")
	private String modified_by;

	@ManyToOne
	@JoinColumn(name = "customer_id", nullable = false, insertable = false, updatable = false)
	private Cus cus;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "order_id", referencedColumnName = "id", nullable = false)
	private List<CusOrderItem> cusOrderItem;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public String getNo_of_items() {
		return no_of_items;
	}

	public void setNo_of_items(String no_of_items) {
		this.no_of_items = no_of_items;
	}

	public String getOrder_sub_total() {
		return order_sub_total;
	}

	public void setOrder_sub_total(String order_sub_total) {
		this.order_sub_total = order_sub_total;
	}

	public String getOrder_discount() {
		return order_discount;
	}

	public void setOrder_discount(String order_discount) {
		this.order_discount = order_discount;
	}

	public String getOrder_total_amount() {
		return order_total_amount;
	}

	public void setOrder_total_amount(String order_total_amount) {
		this.order_total_amount = order_total_amount;
	}

	public String getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}

	public String getDelivery_date() {
		return delivery_date;
	}

	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getModified_date() {
		return modified_date;
	}

	public void setModified_date(String modified_date) {
		this.modified_date = modified_date;
	}

	public String getModified_by() {
		return modified_by;
	}

	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}

	public Cus getCus() {
		return cus;
	}

	public void setCus(Cus cus) {
		this.cus = cus;
	}

	public List<CusOrderItem> getCusOrderItem() {
		return cusOrderItem;
	}

	public void setCusOrderItem(List<CusOrderItem> cusOrderItem) {
		this.cusOrderItem = cusOrderItem;
	}

}
