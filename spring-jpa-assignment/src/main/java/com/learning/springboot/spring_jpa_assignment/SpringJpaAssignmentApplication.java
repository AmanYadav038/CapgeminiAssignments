package com.learning.springboot.spring_jpa_assignment;

import com.learning.springboot.spring_jpa_assignment.entity.Employee;
import com.learning.springboot.spring_jpa_assignment.repo.IEmployeeRepo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJpaAssignmentApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringJpaAssignmentApplication.class, args);
		IEmployeeRepo repo = ctx.getBean(IEmployeeRepo.class);
//		repo.save(new Employee(102, "Jimmy", 106000));
//		repo.save(new Employee(103, "Scott", 189000));
//		repo.save(new Employee(104, "Yash", 18000));
//		repo.save(new Employee(105, "Jhonny", 13500));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter EmpNo of the employee: ");
		Employee employee = repo.findById(sc.nextInt()).orElse(null);
		System.out.println(employee);
	}

}
