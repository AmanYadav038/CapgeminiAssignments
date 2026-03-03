package com.emp.dao;

import java.util.List;

import com.emp.bean.Employee;

public interface IEmployeeDao {	
	public String saveEmployee(Employee e);
	public Employee findEmployee(int empid);
	public List<Employee> getAll();
	public String updateEmpName(Employee e);
	public String deleteEmployee(int empid);
}
