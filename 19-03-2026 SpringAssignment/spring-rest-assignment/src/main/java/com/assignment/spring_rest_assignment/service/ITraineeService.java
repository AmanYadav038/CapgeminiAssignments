package com.assignment.spring_rest_assignment.service;

import java.util.List;

import com.assignment.spring_rest_assignment.dto.TraineeDTO;

public interface ITraineeService {
	public List<TraineeDTO> getAllTrainees();
	public List<TraineeDTO> getTraineeByName(String tName);
	public TraineeDTO getTrainee(int tId);
	public String removeTrainee(int tId);
	public String updateTrainee(TraineeDTO trainee);
	public TraineeDTO createTrainee(TraineeDTO trainee);
	public List<TraineeDTO> getTraineeByLocation(String loc);
	public List<TraineeDTO> getTraineeByDomain(String domain);
}
