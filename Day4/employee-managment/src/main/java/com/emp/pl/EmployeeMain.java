package com.emp.pl;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.emp.bean.Employee;
import com.emp.service.EmployeeService;
import com.emp.service.IEmployeeService;

public class EmployeeMain {
	private static void showUpdatinOptions() {
		System.out.println("=========================");
		System.out.println("Choose Option:");
		System.out.println("1.Update Name");
		System.out.println("2.Update Email");
		System.out.println("3.Update DOB");
		System.out.println("4.exit");
	}
	private static void displayMenu() {
		System.out.println("=========================");
		System.out.println("Choose Option:");
		System.out.println("1.Add Employee");
		System.out.println("2.Find Employee");
		System.out.println("3.All Employees");
		System.out.println("4.Update Employee Name");
		System.out.println("5.Remove Employee");
		System.out.println("6.Exit");
		System.out.println("=========================");
	}
	public static void main(String[] args) {
		IEmployeeService es = new EmployeeService();
		String add = "";
		boolean conti = true;
		Scanner sc = new Scanner(System.in);
		while(conti) {
			displayMenu();
			System.out.println("Enter your option:");
			int ch = sc.nextInt();
			sc.nextLine();
			switch(ch) {
			case 1 : System.out.println("Enter emp id:");
					int empid = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Employee name:");
					String name = sc.nextLine();
					System.out.println("Enter Email address:");
					String email = sc.nextLine();
					System.out.println("Enter Date of Birth:");
					String date = sc.nextLine();
					add = es.createEmployee(new Employee(empid, name, email, date));
					break;
			case 2 : System.out.println("Enter emp id:");
					empid = sc.nextInt();
					sc.nextLine();
					Employee emp = es.findById(empid);
					System.out.println("Employee Details");
					System.out.println(emp.getEmpNo()+" "+emp.getEname()+" "+emp.getEmail()+" "+emp.getDob());
					break;
			case 3 : List<Employee> emps = es.getAllEmployee();
					for(Employee empi : emps) {
						System.out.println(empi.getEmpNo()+" "+empi.getEname()+" "+empi.getEmail()+" "+empi.getDob());
					}
					break;
			case 4 : showUpdatinOptions();
					int choice = sc.nextInt();
					System.out.println("Enter EmpId to be updated:");
					empid = sc.nextInt();
					sc.nextLine();
					Employee e = es.findById(empid);
					switch(choice) {
					case 1:
						System.out.println("Enter new name:");
						String newName = sc.nextLine();
						e.setEname(newName);
						break;
					case 2:
						System.out.println("Enter new email:");
						String newEmail = sc.nextLine();
						e.setEmail(newEmail);
						break;
					case 3:
						System.out.println("Enter new DOB:");
						String newDOB = sc.nextLine();
						e.setDob(newDOB);
						break;
					case 4:
						break;
					}
					System.out.println(es.updateEmployeeName(e));
			        break;
			case 5 : System.out.println("Enter Empid to be deleted:");
			        empid = sc.nextInt();
			        sc.nextLine();
			        add = es.removeEmployee(empid);
			        break;
			case 6 : conti = false;
					break;
			}
			
		}
	}
}
