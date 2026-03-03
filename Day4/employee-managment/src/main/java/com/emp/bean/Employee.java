package com.emp.bean;

import jakarta.persistence.*;

@Entity
public class Employee {
	@Id
	private int empNo;
	private String ename;
	private String email;
	private String dob;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Employee(int empNo, String ename, String email, String dob) {
		super();
		this.empNo = empNo;
		this.ename = ename;
		this.email = email;
		this.dob = dob;
	}
	public Employee() {
		
	}
	
}
