package com.example.orders.dto;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ExceptionDTO {
	private String message;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate now;
	private HttpStatus status;
	private List<String> errors;
	
	public ExceptionDTO() {
		
	}
	
	public ExceptionDTO(String message, LocalDate now) {
		super();
		this.message = message;
		this.now = LocalDate.now();
		status = HttpStatus.NOT_FOUND;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDate getNow() {
		return now;
	}

	public void setNow(LocalDate now) {
		this.now = now;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	
	
}
