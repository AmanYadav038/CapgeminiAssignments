package com.emp.service;

import java.util.List;

import com.emp.bean.Employee;

public interface IEmployeeService {
	public String createEmployee(Employee e);
	public Employee findById(int eid);
	public List<Employee> getAllEmployee();
	public String updateEmployeeName(Employee e);
	public String removeEmployee(int empid);
}
