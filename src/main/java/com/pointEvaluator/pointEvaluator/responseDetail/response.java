package com.pointEvaluator.pointEvaluator.responseDetail;

public class response {

	private final  String message;
	private final Object detail;
	public response(String message, Object detail) {
		super();
		this.message = message;
		this.detail = detail;
	}
	public String getMessage() {
		return message;
	}
	public Object getDetail() {
		return detail;
	}
	
	
	
}
