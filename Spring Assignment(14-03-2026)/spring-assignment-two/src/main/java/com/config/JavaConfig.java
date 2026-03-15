package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beans.Employee;
import com.beans.SBU;

@Configuration
public class JavaConfig {
	
	@Bean
	public Employee getEmpBean1() {
		return new Employee(101, "Amit", 45000);
	}
	
	@Bean
	public Employee getEmpBean2() {
		return new Employee(101, "Amit", 45000);
	}
	@Bean
	public Employee getEmpBean3() {
		return new Employee(101, "Amit", 45000);
	}
	@Bean
	public Employee getEmpBean4() {
		return new Employee(101, "Amit", 45000);
	}
	
	
	@Bean("sbu")
	public SBU getSBUBean() {
		return new SBU("PES-BU", "Product Engineering Services", "Kiran Rao");
	}
}
