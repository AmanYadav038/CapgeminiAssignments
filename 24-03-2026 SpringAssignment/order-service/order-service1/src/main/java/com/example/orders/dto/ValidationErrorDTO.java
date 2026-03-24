package com.example.orders.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class ValidationErrorDTO {
	private LocalDate timestamp;
	private List<String> errors;
	public LocalDate getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}
	public List<String> getErrors() {
		return errors;
	}
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	public ValidationErrorDTO(LocalDate timestamp, List<String> errors) {
		super();
		this.timestamp = timestamp;
		this.errors = errors;
	}
	
}
