package com.learning.springboot.spring_assign_three;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.learning.springboot.spring_assign_three.bean.Employee;
import com.learning.springboot.spring_assign_three.bean.SBU;

@SpringBootApplication
public class SpringAssignThreeApplication {

	public static void main(String[] args) {
		ApplicationContext ctx  = SpringApplication.run(SpringAssignThreeApplication.class, args);
//		Employee emp = ctx.getBean("emp",Employee.class);
//		emp.getEmployeeDetailsAndSBUDetails();
		SBU sbu = ctx.getBean(SBU.class);
		sbu.printSBUDetails();
	}
	
//	@Bean("emp")
//	public Employee getEmpBean1() {
//		return new Employee(12345, "Harriet", 450000, new SBU(), 30);
//	}
	@Bean()
	public Employee getEmpBean2() {
		return new Employee(12346, "Tim Cook", 6702900);
	}
	
	@Bean()
	public Employee getEmpBean3() {
		return new Employee(12346, "Tim Cook", 6702900);
	}
	
	@Bean("sbu")
	public SBU getSBUBean() {
		return new SBU("PES-BU", "Product Engineering Service", "Kiran Rao");
	}

}
