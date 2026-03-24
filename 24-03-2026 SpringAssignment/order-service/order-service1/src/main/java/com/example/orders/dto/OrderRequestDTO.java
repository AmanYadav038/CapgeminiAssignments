package com.example.orders.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class OrderRequestDTO {
	@NotBlank
	@NotNull
	@Size(min = 3)
	private String customerName;
	@NotBlank
	@NotNull
	@Valid
	private String email;
	@NotBlank
	@NotNull
	private String productName;
	@NotNull
	@Min(value = 1, message = "must be greater than zero")
	private Integer quantity;
	@NotNull
	@Min(value = 1, message = "must be greater than zero")
	private Double pricePerUnit;
	public OrderRequestDTO(String customerName, String email, String productName, Integer quantity,
			Double pricePerUnit) {
		super();
		this.customerName = customerName;
		this.email = email;
		this.productName = productName;
		this.quantity = quantity;
		this.pricePerUnit = pricePerUnit;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(Double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	
	public OrderRequestDTO() {
		// TODO Auto-generated constructor stub
	}
}
