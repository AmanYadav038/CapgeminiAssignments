package com.learning.springboot.spring_assign_three.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int empId;
	private String ename;
	private double sal;
//	private String bu;
//	@Autowired
//	private SBU bu;
//	private int age;
	
	
//	public Employee(int empId, String ename, double sal, SBU bu, int age) {
//		super();
//		this.empId = empId;
//		this.ename = ename;
//		this.sal = sal;
//		this.bu = bu;
//		this.age = age;
//	}
	public Employee(int empId, String ename, double sal) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", sal=" + sal + "]";
	}

	public Employee() {
		
	}
	
	public void getEmployeeDetails() {     //=====>For Question 1
		System.out.println("Employee Details");
		System.out.println("-------------------------");
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee Name: "+ ename);
		System.out.println("Employee Salary: "+ sal);
//		System.out.println("Employee BU : "+ bu);
//		System.out.println("Employee Age : "+ age);
	}
//	
//	public void getEmployeeDetailsAndSBUDetails() {     //=====>For Question 1
//		System.out.println("Employee Details");
//		System.out.println("-------------------------");
//		System.out.println("Employee ID: "+empId);
//		System.out.println("Employee Name: "+ ename);
//		System.out.println("Employee Salary: "+ sal);
//		System.out.println("Employee Age : "+ age);
//		bu.printSBUDetails();
//	}
}
