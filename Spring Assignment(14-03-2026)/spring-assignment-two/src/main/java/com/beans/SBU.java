package com.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class SBU {
	private String sbuId;
	private String sbuName;
	private String sbuHead;
	@Autowired
	List<Employee> empList;
	
	public SBU(String sbuId, String sbuName, String sbuHead) {
		super();
		this.sbuId = sbuId;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
	}
	
	public SBU() {
		
	}
	
	public void printSBUDetails() {
		System.out.printf("SBU details = SBU [sbuCode = %s, sbuHead = %s, sbuName = %s]", sbuId, sbuHead, sbuName);
		empList.forEach(System.out::println);
	}
}
