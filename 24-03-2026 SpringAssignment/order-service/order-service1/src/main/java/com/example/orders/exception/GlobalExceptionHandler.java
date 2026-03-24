package com.example.orders.exception;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.orders.dto.ExceptionDTO;
import com.example.orders.dto.ValidationErrorDTO;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ResponseBody
	@ExceptionHandler({OrderNotFoundException.class})
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ExceptionDTO handleException(OrderNotFoundException e) {
		return new ExceptionDTO("Order Not Found", LocalDate.now());
	}
	
	@ResponseBody
	@ExceptionHandler({MethodArgumentNotValidException.class})
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public ValidationErrorDTO handleException1(MethodArgumentNotValidException e){
		List<String> li = e.getBindingResult().getAllErrors().stream().map(error->error.getDefaultMessage()).collect(Collectors.toList());
		return new ValidationErrorDTO(LocalDate.now(), li);
	}
}
