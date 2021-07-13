package com.pointEvaluator.pointEvaluator.controller.sellsDetail;


import com.pointEvaluator.pointEvaluator.Dto.sellDto;
import com.pointEvaluator.pointEvaluator.responseDetail.GlobalException;
import com.pointEvaluator.pointEvaluator.responseDetail.response;

public interface sellsIterface {
	public response getsellsdetail(long id) throws GlobalException;
	public response getallsellsdetail() throws GlobalException;
	public response savesellsdetail(sellDto customerdetail)throws GlobalException;
	public response updatesellsdetail(sellDto customerdetail)throws GlobalException;
	public response delete(long id)throws GlobalException;
}
