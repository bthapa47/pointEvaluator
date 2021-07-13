package com.pointEvaluator.pointEvaluator.controller.customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.pointEvaluator.pointEvaluator.Dto.customerDto;
import com.pointEvaluator.pointEvaluator.Dto.returncustomerpoint;
import com.pointEvaluator.pointEvaluator.controller.findcustomerDetail;
import com.pointEvaluator.pointEvaluator.model.Customer;
import com.pointEvaluator.pointEvaluator.model.sellsDetail;
import com.pointEvaluator.pointEvaluator.responseDetail.GlobalException;
import com.pointEvaluator.pointEvaluator.responseDetail.response;
import com.pointEvaluator.pointEvaluator.view.customerDao;


@Component
public class customerService implements customerInterface {

	
	@Autowired
	private customerDao customerdao;
	
	 @Autowired
	    private ModelMapper modelMapper;
	
	 @Autowired
	    private BCryptPasswordEncoder  bcryptPasswordEncoder ;
	 
	private findcustomerDetail finddetail=new findcustomerDetail();
	 
	@Override
	public response getcustomer(long id) throws GlobalException {	
		try {
		return new response("Customer Detail", customerdao.findById(String.valueOf(id)).isPresent());
		}catch (Exception e) {
		throw new GlobalException("Customer Dosent Exsit", HttpStatus.BAD_REQUEST);
		}
		}

	@Override
	public response getallcustomer()throws GlobalException  {
		try {
			return new response("Customer Detail", customerdao.findAll());
			}catch (Exception e) {
			throw new GlobalException("No Customer Detail Found", HttpStatus.BAD_REQUEST);
			}
	}

	@Override
	public response saveCustomer(customerDto customerdetail) throws GlobalException {
		Customer customer=modelMapper.map(customerdetail, Customer.class);
		customer.setPassword(bcryptPasswordEncoder.encode( customer.getPassword()));
		if(customerdao.findByUserName( customer.getUsername())!=null) {
			throw new GlobalException("UserName Already Exist", HttpStatus.BAD_REQUEST);
		}
		
		try {
			return new response("Customer Detail", customerdao.save(customer));
			}catch (Exception e) {
			throw new GlobalException("Customer Detail not Saved", HttpStatus.BAD_REQUEST);
			}
	}

	@Override
	public response updateCustomer(customerDto customerdetail) throws GlobalException {
		Customer customer=customerdao.findByUserName( customerdetail.getUsername());
		if(customer==null) {
			throw new GlobalException("Customer Dosent Exist!!", HttpStatus.BAD_REQUEST);
		}
		Customer customersave=modelMapper.map(customer, Customer.class);
		customersave.setPassword(bcryptPasswordEncoder.encode( customerdetail.getPassword()));
		
		try {
			return new response("Customer Detail", customerdao.save(customersave));
			}catch (Exception e) {
			throw new GlobalException("Customer Detail not Updated", HttpStatus.BAD_REQUEST);
			}
	}

	@Override
	public response delete(long id)throws GlobalException  {
		Optional<Customer> customer=customerdao.findById(String.valueOf(id));
		if(customer==null) {
			throw new GlobalException("Customer Dosent Exist!!", HttpStatus.BAD_REQUEST);
		}
		try {
			 customerdao.deleteById(String.valueOf(id));
			return new response("Customer Detail successfull",null);
			}catch (Exception e) {
			throw new GlobalException("Customer Delete Failed", HttpStatus.BAD_REQUEST);
			}
	}

	@Override
	public response getpoint(long id) throws GlobalException {
		Optional<Customer> customer=customerdao.findById(String.valueOf(id));
		if(customer==null) {
			throw new GlobalException("Customer Dosent Exist!!", HttpStatus.BAD_REQUEST);
		}
		
		
		Integer totalpoint=0;
		
		Map<Integer , Integer> calculationeachmounth=finddetail.customerDetail(customer.get());
		 for (Map.Entry<Integer , Integer> me : calculationeachmounth.entrySet()) {
			 totalpoint=totalpoint+me.getValue();
		 }
		 
		 returncustomerpoint point=new returncustomerpoint();
		 point.setCustomername(customer.get().getUsername());
		 point.setTotalpoint(totalpoint);
		 point.setMonthlypoint(calculationeachmounth);
		return new response("Customer Point Detail!!", point);
	}

}
