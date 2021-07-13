package com.pointEvaluator.pointEvaluator.controller.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pointEvaluator.pointEvaluator.Dto.customerDto;
import com.pointEvaluator.pointEvaluator.responseDetail.GlobalException;
import com.pointEvaluator.pointEvaluator.responseDetail.response;


@Controller
@RequestMapping("api/v1/customer")
public class customerController {

	@Autowired
	private customerInterface customerinterface;
	
	@GetMapping("/{id}")
	public ResponseEntity<?>getcustomerDetailbyId(@PathVariable ("id") long id) throws GlobalException{
		return new ResponseEntity<response>(customerinterface.getcustomer(id),HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<?>getcustomerDetail() throws GlobalException{
		return new ResponseEntity<response>(customerinterface.getallcustomer(),HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity<?>savecustomerDetail(@RequestBody customerDto customerdao) throws GlobalException{
		return new ResponseEntity<response>(customerinterface.saveCustomer(customerdao),HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<?>updatecustomerDetail(@RequestBody customerDto customerdao) throws GlobalException{
		return new ResponseEntity<response>(customerinterface.updateCustomer(customerdao),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?>deletecustomerDetailbyId(@PathVariable ("id") long id) throws GlobalException{
		return new ResponseEntity<response>(customerinterface.delete(id),HttpStatus.OK);
	}
	
	@GetMapping("/{id}/point")
	public ResponseEntity<?>getpoint(@PathVariable ("id") long id) throws GlobalException{
		return new ResponseEntity<response>(customerinterface.getpoint(id),HttpStatus.OK);
	}
}
