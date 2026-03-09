package com.learning;

import java.util.List;

import com.dataclass.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class CriteriaExample {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("new-pu");
		EntityManager em = emf.createEntityManager();
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);
		
		Root<Employee> r = cq.from(Employee.class);
		cq.multiselect(r.get("dept"), cb.count(r)).groupBy(r.get("dept"));
		List<Object[]> li = em.createQuery(cq).getResultList();
		li.forEach(e->{
			System.out.println(e[0]+" "+e[1]);
		});
	}
}
