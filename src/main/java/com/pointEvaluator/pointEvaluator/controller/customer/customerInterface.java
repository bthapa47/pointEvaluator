package com.pointEvaluator.pointEvaluator.controller.customer;

import com.pointEvaluator.pointEvaluator.Dto.customerDto;
import com.pointEvaluator.pointEvaluator.responseDetail.GlobalException;
import com.pointEvaluator.pointEvaluator.responseDetail.response;

public interface customerInterface {

	public response getcustomer(long id) throws GlobalException;
	public response getallcustomer() throws GlobalException;
	public response saveCustomer(customerDto customerdetail)throws GlobalException;
	public response updateCustomer(customerDto customerdetail)throws GlobalException;
	public response delete(long id)throws GlobalException;
	public response getpoint(long id) throws GlobalException;
}
