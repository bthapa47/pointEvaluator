package com.pointEvaluator.pointEvaluator.view;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pointEvaluator.pointEvaluator.model.sellsDetail;

@Repository
public interface sellDao extends JpaRepository<sellsDetail, String> {

}
