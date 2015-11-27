package com.jk.store.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ORDER_TABLE")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="CUSTOMER_ID")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name="ADDRESS_ID")
	private Address address;
	
	@Column(name="DELEVERY_DATE")
	@Temporal(TemporalType.DATE)
	private Date deleveryDate;
	
	@Column(name="DELEVERY_PARTNER")
	private String deleveryPartner;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="ORDER_ID")
	private List<OrderItem> orderItems = new ArrayList<>();
	
	@Column(name="PAYMENT_MODE")
	private String paymentMode;
	
	@Column(name="TOTAL_AMOUNT")
	private Double totalAmount;
	
	@Column(name="STATUS")
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getDeleveryDate() {
		return deleveryDate;
	}

	public void setDeleveryDate(Date deleveryDate) {
		this.deleveryDate = deleveryDate;
	}

	public String getDeleveryPartner() {
		return deleveryPartner;
	}

	public void setDeleveryPartner(String deleveryPartner) {
		this.deleveryPartner = deleveryPartner;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
