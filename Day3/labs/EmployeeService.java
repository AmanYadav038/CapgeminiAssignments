package com.learning.assignments.labs;

import java.util.stream.Collectors;
import java.time.*;
import java.util.*;
import java.util.Map.Entry;

public class EmployeeService {
	
	//q1
	public double totalSal() {
		double totalSum = EmployeeRepository.getEmployees().stream().map(e->e.getSalary()).collect(Collectors.summingDouble(e->e));
		return totalSum;
	}
	
	//q2
	public void getCount(){
		Map<String, Long> count = EmployeeRepository.getEmployees().stream().filter(e->e.getDepartment()!=null).map(e->e.getDepartment()).collect(Collectors.groupingBy(e -> e.getDepartmentName(), Collectors.counting()));
		System.out.println(count);
	}
	
	//q3
	public void getSeniorEmp() {
		List<Employee> e = EmployeeRepository.getEmployees().stream().sorted((e1, e2)->e1.getHireDate().compareTo(e2.getHireDate())).collect(Collectors.toList());
		System.out.println(e.get(0).getFirstName());
	}
	
	//q4
	public void getDuration() {
		Map<String, Period> dur = EmployeeRepository.getEmployees().stream().collect(Collectors.toMap(e->e.getFirstName()+" "+e.getLastName(), e->Period.between(e.getHireDate(), LocalDate.now())));
		for(String name : dur.keySet()) {
			String duration = dur.get(name).getYears() + " Years "+dur.get(name).getMonths()+ " Months " + dur.get(name).getDays()+ " Days ";
			System.out.println(name + "-> "+ duration);
		}
	}
	
	//q5
	public void getNullDepartment() {
		EmployeeRepository.getEmployees().stream().filter(e->e.getDepartment()==null).map(e->e.getFirstName()).forEach(e->System.out.println(e));
	}
	
	//q6
	public void getNullEmpDepartment() {
		List<String> set1 = EmployeeRepository.getDepartments().stream().map(e->e.getDepartmentName()).collect(Collectors.toList());
		List<String> set2 = EmployeeRepository.getEmployees().stream().filter(e->e.getDepartment()!=null).map(e->e.getDepartment().getDepartmentName()).collect(Collectors.toList());
		
		set1.removeAll(set2);
		System.out.println(set1);
	}
	
	//q7
	public void getHighestEmpDepartment() {
		Map<String, Long> deptCount = EmployeeRepository.getEmployees().stream().filter(e->e.getDepartment() != null).map(e->e.getDepartment().getDepartmentName()).collect(Collectors.groupingBy(e->e, Collectors.counting()));
		List<Entry<String, Long>> count = deptCount.entrySet().stream().sorted((e1, e2)->e1.getValue().compareTo(e2.getValue())).collect(Collectors.toList());
		System.out.println(count.get(0).getKey());
	}
}
