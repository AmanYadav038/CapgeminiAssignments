package com.assignment.spring_rest_assignment.dto;

import com.assignment.spring_rest_assignment.entity.Trainee;

public class EnityMapper {
	public static TraineeDTO convertEntityToObject(Trainee t) {
		return new TraineeDTO(t.getTraineeId(), t.getTraineeName(), t.getTraineeDomain(), t.getTraineeLocation());
	}
	
	public static Trainee convertObjectToEntity(TraineeDTO trainee) {
		return new Trainee(trainee.getTraineeName(), trainee.getTraineeDomain(), trainee.getTraineeLocation());
	}
}
