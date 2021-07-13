package com.pointEvaluator.pointEvaluator.view;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pointEvaluator.pointEvaluator.model.Customer;

@Repository
public interface customerDao  extends JpaRepository<Customer, String> {

	@Query("select * from customer where username=?1")
	Customer findByUserName(String username);

}
