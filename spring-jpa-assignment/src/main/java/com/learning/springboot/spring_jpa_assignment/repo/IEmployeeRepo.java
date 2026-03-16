package com.learning.springboot.spring_jpa_assignment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.springboot.spring_jpa_assignment.entity.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer>{

}
