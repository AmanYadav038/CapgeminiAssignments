package com.assignment.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class SBUClass {
	private String sbuId;
	private String sbuName;
	private String sbuHead;
	@Autowired
	private List<Employee> empList;
	
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	public String getSbuId() {
		return sbuId;
	}
	public void setSbuId(String sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	
	public void getSBUEmpDetails() {
		System.out.println("SBU Details");
		System.out.println("-----------------------------------");
		System.out.printf("SBUCode = %s, SBUHead = %s, SBUName = %s \n Employee Details :\n -----------------\n",sbuId, sbuHead, sbuName);
		empList.forEach((emp)->{
			System.out.printf("[Employee [empAge= %d, empId= %d, empName= %s, empSal= %.1f],",emp.getAge(), emp.getEmpId(), emp.getEname(), emp.getSal());
		});
	}
}
