package com.pointEvaluator.pointEvaluator.controller.sellsDetail;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.pointEvaluator.pointEvaluator.Dto.sellDto;

import com.pointEvaluator.pointEvaluator.model.sellsDetail;
import com.pointEvaluator.pointEvaluator.responseDetail.GlobalException;
import com.pointEvaluator.pointEvaluator.responseDetail.response;
import com.pointEvaluator.pointEvaluator.view.sellDao;

@Component
public class sellsService implements sellsIterface {

	@Autowired
	private sellDao selldao;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public response getsellsdetail(long id) throws GlobalException {
		try {
			return new response("Sells Detail", selldao.findById(String.valueOf(id)).isPresent());
		} catch (Exception e) {
			throw new GlobalException("Sells Dosent Exsit", HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public response getallsellsdetail() throws GlobalException {
		try {
			return new response("Sells Detail", selldao.findAll());
		} catch (Exception e) {
			throw new GlobalException("No Sells Detail Found", HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public response savesellsdetail(sellDto sellsddto) throws GlobalException {
		sellsDetail sells = modelMapper.map(sellsddto, sellsDetail.class);
		try {
			return new response("Sells Detail", selldao.save(sells));
		} catch (Exception e) {
			throw new GlobalException("Sells Detail not Saved", HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public response updatesellsdetail(sellDto sellsdetail) throws GlobalException {
		sellsDetail sells = modelMapper.map(sellsdetail, sellsDetail.class);
		try {
			return new response("Sells Detail", selldao.save(sells));
		} catch (Exception e) {
			throw new GlobalException("Sells Detail not Saved", HttpStatus.BAD_REQUEST);
		}
	}

	@Override
	public response delete(long id) throws GlobalException {
		try {
			selldao.deleteById(String.valueOf(id));
			return new response("Sells Detail successfull", null);
		} catch (Exception e) {
			throw new GlobalException("Sells Delete Failed", HttpStatus.BAD_REQUEST);
		}
	}

}
