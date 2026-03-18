package com.learning.springboot_rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.springboot_rest.enity.Employee;

@Repository
public interface IEmployeeRepo extends JpaRepository<Employee	, Integer>{
	public List<Employee> findByEname(String ename);
}
