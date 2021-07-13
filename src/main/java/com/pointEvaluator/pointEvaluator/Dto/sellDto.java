package com.pointEvaluator.pointEvaluator.Dto;

import java.util.Date;



import com.pointEvaluator.pointEvaluator.enms.paymentType;
import com.sun.istack.NotNull;

public class sellDto {
	@NotNull
	private String productId;

	@NotNull
	private String quantity;
	
	@NotNull
	private Date sellDate;
	
	@NotNull
	private String address;
	@NotNull
	private double amount;
	@NotNull
	private Date dropDate;
	
	@NotNull
	private paymentType paymentMethod;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
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

	public sellDto(String productId, String quantity, Date sellDate, String address, double amount, Date dropDate,
			paymentType paymentMethod) {
		super();
		this.productId = productId;
		this.quantity = quantity;
		this.sellDate = sellDate;
		this.address = address;
		this.amount = amount;
		this.dropDate = dropDate;
		this.paymentMethod = paymentMethod;
	}
	
	
}
