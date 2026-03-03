package com.emp.service;

import java.util.List;

import com.emp.bean.Employee;
import com.emp.dao.EmployeeDao;
import com.emp.dao.IEmployeeDao;


//Important Note
//this service layer is for validation purpose that's why it used between DAO and Presentation layer
public class EmployeeService implements IEmployeeService{
	IEmployeeDao dao = new EmployeeDao();
	
	@Override
	public String createEmployee(Employee e) {
		if(e.getEmpNo()==0 || e.getEname()==null || e.getEmail()==null) {
			return "Invalid Employee Data";
		}
		return dao.saveEmployee(e);
	}

	@Override
	public Employee findById(int eid) {
		if(eid<=0) {
			System.out.println("Invalid ID");
			return null;
		}
		return dao.findEmployee(eid);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return dao.getAll();
	}

	@Override
	public String updateEmployeeName(Employee e) {
		if(e.getEmpNo()<=0) {
			return "Invalid ID";
		}
		if(e.getEname()=="") {
			return "Not a valid Name";
		}
		return dao.updateEmpName(e);
	}

	@Override
	public String removeEmployee(int empid) {
		if(empid<=0) {
			System.out.println("Invalid ID");
			return null;
		}
		return dao.deleteEmployee(empid);
	}

}
