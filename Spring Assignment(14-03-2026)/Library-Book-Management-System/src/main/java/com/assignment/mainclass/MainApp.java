package com.assignment.mainclass;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.assignment.dataclass.Librarian;

public class MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		Librarian lb = ctx.getBean("librarian", Librarian.class);
		
		lb.issueBook();
	}
}
