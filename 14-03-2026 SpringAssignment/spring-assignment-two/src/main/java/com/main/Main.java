package com.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.Employee;
import com.beans.SBU;
import com.config.JavaConfig;

public class Main {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		//Employee emp = (Employee)ctx.getBean("emp");
		//emp.getEmployeeDetailsAndSBUDetails();
		SBU sbu = (SBU)ctx.getBean("sbu");
		sbu.printSBUDetails();
	}
}
