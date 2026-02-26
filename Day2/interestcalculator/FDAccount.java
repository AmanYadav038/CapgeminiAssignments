package com.learning.assignments.interestcalculator;

public class FDAccount extends Account {

	int noOfDays;
	int ageOfACHolder;
	public FDAccount(int amt, int noOfDays, int ageOfACHolder) throws InvalidAmountException {
		if(amt<0) {
			throw new InvalidAmountException("Invalid Amount");
		}
		amount = amt;
		this.noOfDays = noOfDays;
		this.ageOfACHolder = ageOfACHolder;
	}
	@Override
	double calculateInterest() {
		if(amount<10000000) {
			if(noOfDays>=7 && noOfDays<=14) {
				if(ageOfACHolder>60) {
					return amount*0.05;
				}else {
					return amount*0.045;
				}
			}
			if(noOfDays>=15 && noOfDays<=29) {
				if(ageOfACHolder>60) {
					return amount*0.0525;
				}else {
					return amount*0.0425;
				}
			}
			if(noOfDays>=30 && noOfDays<=45) {
				if(ageOfACHolder>60) {
					return amount*0.06;
				}else {
					return amount*0.055;
				}
			}
			if(noOfDays>=46 && noOfDays<=60) {
				if(ageOfACHolder>60) {
					return amount*0.075;
				}else {
					return amount*0.07;
				}
			}
			if(noOfDays>=61 && noOfDays<=184) {
				if(ageOfACHolder>60) {
					return amount*0.08;
				}else {
					return amount*0.075;
				}
			}
			if(noOfDays>=185) {
				if(ageOfACHolder>60) {
					return amount*0.08;
				}else {
					return amount*0.085;
				}
			}
		}else {
			if(noOfDays>=7 && noOfDays<=14) {
				return amount*0.065;
			}
			if(noOfDays>=15 && noOfDays<=29) {
				return amount*0.0675;
			}
			if(noOfDays>=30 && noOfDays<=45) {
				return amount*0.0675;
			}
			if(noOfDays>=46 && noOfDays<=60) {
				return amount*0.08;
			}
			if(noOfDays>=61 && noOfDays<=184) {
				return amount*0.085;
			}
			if(noOfDays>=185) {
				return amount*0.1;
			}
		}
		return 0;
	}
}
