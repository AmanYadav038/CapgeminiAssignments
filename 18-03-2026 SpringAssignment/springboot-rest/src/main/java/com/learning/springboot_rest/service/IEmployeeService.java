package com.learning.springboot_rest.service;

import java.util.List;

import com.learning.springboot_rest.enity.Employee;

public interface IEmployeeService {
	public List<Employee> getAllEmployees();
	public List<Employee> getEmployeeName(String name);
	public String createEmployee(Employee emp);
	
	public Employee getEmployee(int empId);
	
	public String removeEmployee(int empId);
	
	public String updateEmployee(Employee emp);
}
