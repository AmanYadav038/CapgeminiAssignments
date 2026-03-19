package com.assignment.spring_rest_assignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.spring_rest_assignment.entity.Trainee;

public interface ITraineeRepo extends JpaRepository<Trainee, Integer> {
	public List<Trainee> findByTraineeName(String traineeName);
	public List<Trainee> findByTraineeDomain(String traineeDomain);
	public List<Trainee> findByTraineeLocation(String traineeLocation);
}
