package com.learning.assignments.interestcalculator;
import java.util.*;
public class InterestCalcultor {
	static void displayMenu() {
		System.out.println("Select the option:");
		System.out.println("\t1.Interest Calculator-SB");
		System.out.println("\t2.Interest Calculator-FD");
		System.out.println("\t3.Interest Calculator-RD");
		System.out.println("\t4.Exit");
	}
	public static void main(String[] args) {
		boolean conti = true;
		Scanner sc = new Scanner(System.in);
		
		try {
			while(conti) {
				displayMenu();
				Account acc ;
				System.out.println("Enter option:");
				int ch = sc.nextInt();
				sc.nextLine();
				switch(ch) {
				case 1 : System.out.println("Enter User Type(NRI/Normal");
						String type = sc.nextLine();
						acc = new SBAccount(type);
						System.out.println("Enter amount:");
						int amount = sc.nextInt();
						acc.amount = amount;
						System.out.println("Interest Gained: "+acc.calculateInterest());
						break;
				case 2 : System.out.println("Enter amount:");
						int amt = sc.nextInt();
						System.out.println("Enter no. of days: ");
						int noOfDays = sc.nextInt();
						System.out.println("Enter your age: ");
						int age = sc.nextInt();
						acc = new FDAccount(amt, noOfDays, age);				
						System.out.println("Interest Gained: "+acc.calculateInterest());
						break;			
				case 3 : System.out.println("Enter Amount: ");
						amt = sc.nextInt();
						System.out.println("Enter your age: ");
						age = sc.nextInt();
						System.out.println("Enter Maturity Period:");
						int mont = sc.nextInt();
						System.out.println("Enter Monthly Amount: ");
						int montAmt = sc.nextInt();
						System.out.println("Enter no of Days");
						noOfDays = sc.nextInt();
						acc = new RDAccount(age, mont, montAmt, amt, noOfDays);
						System.out.println("Interest Gained: "+acc.calculateInterest());
						break;	
				case 4: conti = false;
						break;
				}
				
			}
		}catch (InvalidAmountException e) {
			System.out.println("Enter correct amount.");
		}
	}
}
