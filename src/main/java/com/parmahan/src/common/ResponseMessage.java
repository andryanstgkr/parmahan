package com.parmahan.src.common;

import org.json.JSONObject;

public class ResponseMessage  {
	private String message;
	private String status;
	private Object object;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public ResponseMessage(String status, String message, Object o) {
		this.message = message;
		this.status = status;
		this.object = o;
	}
	
	public static ResponseMessage constructResponseMessage(String status, String message, Object o) {
		ResponseMessage responseMessage = new ResponseMessage(status, message, o);
		JSONObject json = new JSONObject();
		json.put("message", message);
		json.put("status", status);
		json.put("object", o);
		
		return responseMessage;
	}
	
}
