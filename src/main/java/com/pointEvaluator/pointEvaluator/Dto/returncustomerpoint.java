package com.pointEvaluator.pointEvaluator.Dto;

import java.util.Map;

public class returncustomerpoint {

	
	private String customername;
	private Integer totalpoint;
	private Map<Integer, Integer> monthlypoint;
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public Integer getTotalpoint() {
		return totalpoint;
	}
	public void setTotalpoint(Integer totalpoint) {
		this.totalpoint = totalpoint;
	}
	public Map<Integer, Integer> getMonthlypoint() {
		return monthlypoint;
	}
	public void setMonthlypoint(Map<Integer, Integer> monthlypoint) {
		this.monthlypoint = monthlypoint;
	}
	
	
}
