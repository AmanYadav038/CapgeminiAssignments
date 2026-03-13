package com.assignment.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.assignment.bean.SBUClass;
 
public class MainClass {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
//		Employee emp = ctx.getBean("emp", Employee.class);
//		emp.getEmployeeDetails();  ===>for question 1
//		emp.getEmployeeDetails();	===>for question 2
		SBUClass sbu = ctx.getBean("bu", SBUClass.class);	
		sbu.getSBUEmpDetails();   	//===>for question 3
		ctx.close();
	}
}
