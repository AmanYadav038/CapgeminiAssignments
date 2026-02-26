package com.learning.assignments.labs;

public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeService es = new EmployeeService();
		
		//q1
		System.out.println(es.totalSal());
		
		//q2
		es.getCount();
		
		//q3
		es.getSeniorEmp();
		
		//q4
		es.getDuration();
		
		//q5 
		es.getNullDepartment(); 
		
		//q6
		es.getNullEmpDepartment();
		
		//q7
		es.getHighestEmpDepartment();
	}
}
