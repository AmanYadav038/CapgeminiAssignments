package com.learning.assignments.interestcalculator;

public class SBAccount extends Account{
	private String userType;
	public SBAccount(String userType) {
		this.userType = userType;
	}
	@Override
	double calculateInterest() {
		
		return (userType.equals("NRI"))? amount*0.06: amount*0.04;
	}
	
}
