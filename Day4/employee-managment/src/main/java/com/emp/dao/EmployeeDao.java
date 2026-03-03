package com.emp.dao;

import java.sql.Connection;
import java.util.List;

import jakarta.persistence.*;
import com.emp.bean.Employee;

public class EmployeeDao implements IEmployeeDao{
	private static EntityManager em;
	static {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		em = emf.createEntityManager();
	}
	@Override
	public String saveEmployee(Employee e) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		return "Employee not created";
	}

	@Override
	public Employee findEmployee(int empid) {
		Employee e = em.find(Employee.class, empid);
		return e;
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> li = em.createQuery("from Employee").getResultList();
		return li;
	}

	@Override
	public String updateEmpName(Employee e) {
		em.getTransaction().begin();
		Employee emp = em.find(Employee.class, e.getEmpNo());
		emp.setEname(e.getEname());
		emp.setEmail(e.getEmail());
		emp.setDob(e.getDob());
		em.persist(e);
		em.getTransaction().commit();
		return "Updated record";
	}

	@Override
	public String deleteEmployee(int empid) {
		em.getTransaction().begin();
		Employee e = em.find(Employee.class, empid);
		em.remove(e);
		em.getTransaction().commit();
		return "Record Deleted";
	}

}
