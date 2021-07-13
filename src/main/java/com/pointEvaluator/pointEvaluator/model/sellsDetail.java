package com.pointEvaluator.pointEvaluator.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.pointEvaluator.pointEvaluator.enms.paymentType;
import com.sun.istack.NotNull;

import lombok.Data;

@Entity(name ="sellsDetail")
@Data
public class sellsDetail {

	@Id
	@GeneratedValue
	private long id;
	@Column
	@NotNull
	private String productId;
	@Column
	@NotNull
	private Integer quantity;
	@Column
	@NotNull
	private double amount;
	@Column
	@NotNull
	private Date sellDate;
	@Column
	@NotNull
	private String address;
	@Column 	
	@NotNull
	private Date dropDate;
	@Column
	@NotNull
	private paymentType paymentMethod;
	
	
	
	
	
	public sellsDetail(long id, String productId, Integer quantity, double amount, Date sellDate, String address,
			Date dropDate, paymentType paymentMethod) {
		super();
		this.id = id;
		this.productId = productId;
		this.quantity = quantity;
		this.amount = amount;
		this.sellDate = sellDate;
		this.address = address;
		this.dropDate = dropDate;
		this.paymentMethod = paymentMethod;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Date getSellDate() {
		return sellDate;
	}
	public void setSellDate(Date sellDate) {
		this.sellDate = sellDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDropDate() {
		return dropDate;
	}
	public void setDropDate(Date dropDate) {
		this.dropDate = dropDate;
	}
	public paymentType getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(paymentType paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
	
	
}
