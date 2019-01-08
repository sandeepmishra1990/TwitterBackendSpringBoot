package com.sandeep.practice.model.response;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import com.sandeep.practice.annotation.Loggable;

@Service
public class ErrorResponse {
	
	private String message;
	private String errorCode;
	private String stackTrace;
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getStackTrace() {
		return stackTrace;
	}
	

	public void setStackTrace(String stackTrace) {
		this.stackTrace = stackTrace;
	}
	
	

}
