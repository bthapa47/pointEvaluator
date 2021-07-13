package com.pointEvaluator.pointEvaluator.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import com.sun.istack.NotNull;

import lombok.Data;
@Entity(name ="Customer")
@Data
public class Customer {
	@Id
	@GeneratedValue
	private long id;
	@Column
	@NotNull
	private String fname;
	@Column
	@NotNull
	private String mname;
	@Column
	@NotNull
	private String lname;
	@Column
	@NotNull
	private String email;
	@Column
	@NotNull
	private Date registerDate;
	@Column 	
	@NotNull
	private String mobilenumber;
	@Column
	@NotNull
	private String username;
	@Column
	@NotNull
	private String password;
	  @OneToMany
	  @JoinTable(name = "Customer_sellsDetail", joinColumns = @JoinColumn(name = "Customer_ID", referencedColumnName = "id"),
	  inverseJoinColumns = @JoinColumn(name = "sellsDetail_ID", referencedColumnName = "id"))
	    private List<sellsDetail> sellsDetail;
	
	  
	

	public Customer(long id, String fname, String mname, String lname, String email, Date registerDate,
			String mobilenumber, String username, String password,
			List<com.pointEvaluator.pointEvaluator.model.sellsDetail> sellsDetail) {
		super();
		this.id = id;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
		this.email = email;
		this.registerDate = registerDate;
		this.mobilenumber = mobilenumber;
		this.username = username;
		this.password = password;
		this.sellsDetail = sellsDetail;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getMname() {
		return mname;
	}


	public void setMname(String mname) {
		this.mname = mname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getRegisterDate() {
		return registerDate;
	}


	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}


	public String getMobilenumber() {
		return mobilenumber;
	}


	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public List<sellsDetail>  getSellsDetail() {
		return sellsDetail;
	}


	public void setSellsDetail(List<sellsDetail> sellsDetail ) {
		this.sellsDetail = sellsDetail;
	}
	
	
	
	
	
	
	
}
