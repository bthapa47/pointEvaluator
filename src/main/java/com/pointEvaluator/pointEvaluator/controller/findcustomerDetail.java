package com.pointEvaluator.pointEvaluator.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.pointEvaluator.pointEvaluator.model.Customer;
import com.pointEvaluator.pointEvaluator.model.sellsDetail;

public class findcustomerDetail {

	
	public Map<Integer , Integer> customerDetail(Customer customer) {
		
		HashMap<Integer , Integer> calculationeachmounth=new HashMap<Integer , Integer>();
		 Map<Integer , List<sellsDetail>> detailbymonth=	listbydate(customer.getSellsDetail());
		
		
		  for (Map.Entry<Integer, List<sellsDetail>> me : detailbymonth.entrySet()) {
	        	Integer foreachmonth=0;
			  for(sellsDetail selldetailbymonth:me.getValue()) {
	        		double totalspent=selldetailbymonth.getQuantity()*selldetailbymonth.getAmount();
	        	Integer totalpoint=0;
	        		if(totalspent>100) {
	        			totalpoint=(int) (totalpoint+50+(2*totalspent-100));
	        	}
	        	else {
	        		if(totalspent>50) {
	        		totalpoint=(int) (totalpoint+(totalspent-50));
	        		}
	        	}
	        	
	        		foreachmonth=foreachmonth+totalpoint;
	        	}
			  calculationeachmounth.put(me.getKey(), foreachmonth);
	        }
		 
		 
		return calculationeachmounth;
	}
	
	private HashMap<Integer , List<sellsDetail>> listbydate(List<sellsDetail> selldetail){
		HashMap<Integer , List<sellsDetail>> responsedetail=new HashMap<Integer , List<sellsDetail>>();
		
		for(int i=1;i>=12;i++) {
			List<sellsDetail> selldetaileachmonth=new ArrayList<sellsDetail>();
		for(sellsDetail sell:selldetail) {
			 if(sell.getSellDate().getMonth()+1==i) {
				 selldetaileachmonth.add(sell);
			 }			 
		}
		responsedetail.put(i, selldetaileachmonth);
		}
		return responsedetail;
	}
	
	
	
}
