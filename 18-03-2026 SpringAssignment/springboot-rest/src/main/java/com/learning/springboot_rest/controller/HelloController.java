package com.learning.springboot_rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springboot_rest.enity.Employee;
import com.learning.springboot_rest.service.IEmployeeService;

@RestController
@RequestMapping("employees")
public class HelloController {
	
	@Autowired
	private IEmployeeService es;
	
	@GetMapping("abc/{n}")
	public String sayHello(@PathVariable("n") String name) {
		return "Hello"+name;
	}
	
//	@GetMapping("employees")
//	public Employee getEmployee() {
//		return new Employee(101, "Abhay", 56000);
//	}
	@PostMapping
	public String createEmployee(@RequestBody Employee emp) {
		return es.createEmployee(emp);
	}
	
	@GetMapping("{eid}")
	public Employee getEmployees(@PathVariable int eid){
		return es.getEmployee(eid);
	}
	@GetMapping("")
	public List<Employee> getAllEmployees(){
		return es.getAllEmployees();
	}
	
	@GetMapping("ename/{ename}")
	public List<Employee> getEmployeeByName(@PathVariable String ename){
		return es.getEmployeeName(ename);
	}
	
	@DeleteMapping("{eid}")
	public String deleteEmp(@PathVariable int eid) {
		return es.removeEmployee(eid);
	}
	
	@PutMapping
	public String updateEmp(@RequestBody Employee emp) {
		return es.updateEmployee(emp);
	}
}
