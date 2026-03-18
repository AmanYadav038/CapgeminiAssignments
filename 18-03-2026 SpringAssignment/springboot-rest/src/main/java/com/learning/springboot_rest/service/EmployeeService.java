package com.learning.springboot_rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.springboot_rest.enity.Employee;
import com.learning.springboot_rest.repository.IEmployeeRepo;

@Service
public class EmployeeService implements IEmployeeService{

	@Autowired
	private IEmployeeRepo erepo;
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return erepo.findAll();
	}
	
	

	@Override
	public String createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		erepo.saveAndFlush(emp);
		return "Inserted";
	}

	@Override
	public Employee getEmployee(int empId) {
		return erepo.findById(empId).orElse(null);
	}

	@Override
	public String removeEmployee(int empId) {
		erepo.deleteById(empId);
		return "Employee Deleted";
	}

	@Override
	public String updateEmployee(Employee emp) {
		erepo.saveAndFlush(emp);
		return "Employee Updated";
	}



	@Override
	public List<Employee> getEmployeeName(String name) {
		return erepo.findByEname(name);
	}
}
