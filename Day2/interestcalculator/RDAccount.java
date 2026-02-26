package com.learning.assignments.interestcalculator;

public class RDAccount extends FDAccount{
	int noOfMonths;
	double monthlyAmount;
	
	public RDAccount(int ageOfACHld, int noOfMonths, double monthlyAmount, int amount, int noOfDays) throws InvalidAmountException{
		if(amount<0 || monthlyAmount<0) {
			throw new InvalidAmountException("Invalid Amount Entered");
		}
		super(amount, noOfDays, ageOfACHld);
		ageOfACHolder = ageOfACHld;
		this.noOfMonths = noOfMonths;
		this.monthlyAmount= monthlyAmount;
	}
	@Override
	double calculateInterest() {
		if(ageOfACHolder>60) {
			if(noOfMonths<6) {
				return monthlyAmount*0.075;
			}
			if(noOfMonths<9) {
				return monthlyAmount*0.0775;
			}
			if(noOfMonths<12) {
				return monthlyAmount*0.08;
			}
			if(noOfMonths<15) {
				return monthlyAmount*0.0825;
			}
			if(noOfMonths<18) {
				return monthlyAmount*0.085;
			}
			if(noOfMonths<21) {
				return monthlyAmount*0.0875;
			}
		}else {
			if(noOfMonths<6) {
				return monthlyAmount*0.08;
			}
			if(noOfMonths<9) {
				return monthlyAmount*0.0825;
			}
			if(noOfMonths<12) {
				return monthlyAmount*0.085;
			}
			if(noOfMonths<15) {
				return monthlyAmount*0.0875;
			}
			if(noOfMonths<18) {
				return monthlyAmount*0.09;
			}
			if(noOfMonths<21) {
				return monthlyAmount*0.0925;
			}
		}
		
		return 0;
	}
	
}
