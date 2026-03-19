package com.assignment.spring_rest_assignment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.spring_rest_assignment.dto.EnityMapper;
import com.assignment.spring_rest_assignment.dto.TraineeDTO;
import com.assignment.spring_rest_assignment.entity.Trainee;
import com.assignment.spring_rest_assignment.repository.ITraineeRepo;

@Service
public class TraineeService implements ITraineeService{
	@Autowired
	private ITraineeRepo tRepo;

	@Override
	public List<TraineeDTO> getAllTrainees() {
		// TODO Auto-generated method stub
		List<Trainee> ts = tRepo.findAll();
		List<TraineeDTO> trainees = new ArrayList<>();
		ts.forEach((trainee)->{
			trainees.add(EnityMapper.convertEntityToObject(trainee));
		});
		return trainees;
	}

	@Override
	public List<TraineeDTO> getTraineeByName(String tName) {
		List<Trainee> trainees = tRepo.findByTraineeName(tName);
		List<TraineeDTO> traineeDTOs = new ArrayList<TraineeDTO>();
		trainees.forEach((trainer)->{
			traineeDTOs.add(EnityMapper.convertEntityToObject(trainer));
		});
		
		return traineeDTOs;
	}

	@Override
	public TraineeDTO getTrainee(int tId) {
		Trainee t = tRepo.findById(tId).orElse(null);
		if(t!=null) {
			return EnityMapper.convertEntityToObject(t); 
		}else {
			return null;
		}
	}

	@Override
	public String removeTrainee(int tId) {
		Trainee t = tRepo.findById(tId).orElse(null);
		if(t!=null) {
			tRepo.delete(t);
			return "Employee Deleted";
		}else {
			return null;
		}
	}

	@Override
	public String updateTrainee(TraineeDTO trainee) {
		Trainee t = tRepo.findById(trainee.getTraineeId()).orElse(null);
		if(t!=null) {
			tRepo.saveAndFlush(t);
			return "Trainee Details Updated";
		}else {
			return null;
		}
	}

	@Override
	public TraineeDTO createTrainee(TraineeDTO trainee) {
		Trainee t = EnityMapper.convertObjectToEntity(trainee);
		trainee = EnityMapper.convertEntityToObject(tRepo.saveAndFlush(t));
		return trainee;
	}

	@Override
	public List<TraineeDTO> getTraineeByLocation(String loc) {
		List<Trainee> trainees = tRepo.findByTraineeLocation(loc);
		List<TraineeDTO> traineeDTOs = new ArrayList<TraineeDTO>();
		trainees.forEach((trainer)->{
			traineeDTOs.add(EnityMapper.convertEntityToObject(trainer));
		});
		return traineeDTOs;
	}

	@Override
	public List<TraineeDTO> getTraineeByDomain(String domain) {
		List<Trainee> trainees = tRepo.findByTraineeDomain(domain);
		List<TraineeDTO> traineeDTOs = new ArrayList<TraineeDTO>();
		trainees.forEach((trainer)->{
			traineeDTOs.add(EnityMapper.convertEntityToObject(trainer));
		});
		return traineeDTOs;
	}
	
	
}
