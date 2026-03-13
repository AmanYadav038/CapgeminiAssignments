package com.assignment.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int empId;
	private String ename;
	private double sal;
	//private String bu;
	@Autowired
	private SBUClass bu;
	private int age;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public SBUClass getBu() {
		return bu;
	}
	public void setBu(SBUClass bu) {
		this.bu = bu;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
//	public void getEmployeeDetails() {     =====>For Question 1
//		System.out.println("Employee Details");
//		System.out.println("-------------------------");
//		System.out.println("Employee ID: "+empId);
//		System.out.println("Employee Name: "+ ename);
//		System.out.println("Employee Salary: "+ sal);
//		System.out.println("Employee BU : "+ bu);
//		System.out.println("Employee Age : "+ age);
	
	
	public void getEmployeeDetails() {		//=====>For Question 2
		System.out.println("Employee Details");
		System.out.println("-------------------------");
		System.out.printf("Employee [empAge = %d, empId= %d , empName= %s, empSalary= %.2f , \n sbu details = SBU [ sbuCode= %s ,  sbuHead= %s, sbuName= %s]]", age, empId, ename, sal, bu.getSbuId(), bu.getSbuHead(), bu.getSbuName());
	}
}
