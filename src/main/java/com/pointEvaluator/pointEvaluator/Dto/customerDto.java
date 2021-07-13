package com.pointEvaluator.pointEvaluator.Dto;

import java.util.Date;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
public class customerDto {
	
	@NotNull
	private String fname;
	
	@NotNull
	private String mname;
	
	@NotNull
	private String lname;
	
	@NotNull
	private String email;
	
	@NotNull
	private Date registerDate;
	
	@NotNull
	private String mobilenumber;
	
	@NotNull
	private String username;
	
	@NotNull
	private String password;

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
	
	
	
}
