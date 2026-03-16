package com.learning.springboot.spring_jpa_assignment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	private int empNo;
	private String ename;
	private double salary;
	public Employee(int empNo, String ename, double salary) {
		super();
		this.empNo = empNo;
		this.ename = ename;
		this.salary = salary;
	}
	public Employee() {
		
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		System.out.println("Employee Info:");
			System.out.println("Employee ID		:"+empNo);
			System.out.println("Emplpoyee NAME	:"+ename);
			System.out.println("Employee SALARY	:"+salary);
		return "";

	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
