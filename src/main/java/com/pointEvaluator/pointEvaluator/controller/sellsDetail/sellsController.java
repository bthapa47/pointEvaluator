package com.pointEvaluator.pointEvaluator.controller.sellsDetail;

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


import com.pointEvaluator.pointEvaluator.Dto.sellDto;
import com.pointEvaluator.pointEvaluator.responseDetail.GlobalException;
import com.pointEvaluator.pointEvaluator.responseDetail.response;



@Controller
@RequestMapping("api/v1/seller")
public class sellsController {

	@Autowired
	private sellsIterface sellinterface;
	
	
	@GetMapping("/{id}")
	public ResponseEntity<?>getsellsDetailbyId(@PathVariable ("id") long id) throws GlobalException{
		return new ResponseEntity<response>(sellinterface.getsellsdetail(id),HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<?>getsellsDetail() throws GlobalException{
		return new ResponseEntity<response>(sellinterface.getallsellsdetail(),HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity<?>savesellsDetail(@RequestBody sellDto sellDto) throws GlobalException{
		return new ResponseEntity<response>(sellinterface.savesellsdetail(sellDto),HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<?>updatesellsDetail(@RequestBody sellDto sellDto) throws GlobalException{
		return new ResponseEntity<response>(sellinterface.updatesellsdetail(sellDto),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?>deletesellsDetailbyId(@PathVariable ("id") long id) throws GlobalException{
		return new ResponseEntity<response>(sellinterface.delete(id),HttpStatus.OK);
	}
	
	
}
