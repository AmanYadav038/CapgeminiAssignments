package com.assignment.spring_rest_assignment.controller;

import java.util.List;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.spring_rest_assignment.dto.TraineeDTO;
import com.assignment.spring_rest_assignment.service.TraineeService;

@RestController
@RequestMapping("trainee")
public class TraineeController {

	@Autowired
	private TraineeService tService;
	@GetMapping()
	public List<TraineeDTO> getAllTrainees(){
		return tService.getAllTrainees();
	}
	
	@GetMapping("{tid}")
	public TraineeDTO getTraineeDetails(@PathVariable int tid) {
		return tService.getTrainee(tid);
	}
	
	@GetMapping("name/{tname}")
	public List<TraineeDTO> getTraineeByName(@PathVariable String tname){
		return tService.getTraineeByName(tname);
	}
	
	@GetMapping("location/{loc}")
	public List<TraineeDTO> getTraineeByLoc(@PathVariable String loc){
		return tService.getTraineeByLocation(loc);
	}
	
	@GetMapping("domain/{domain}")
	public List<TraineeDTO> getTraineeByDomain(@PathVariable String domain){
		return tService.getTraineeByDomain(domain);
	}
	@PostMapping
	public TraineeDTO insertTrainee(@RequestBody TraineeDTO tdto) {
		return tService.createTrainee(tdto);
	}
	
	@PutMapping
	public String updateRecord(@RequestBody TraineeDTO tdto) {
		return tService.updateTrainee(tdto);
	}
	
	@DeleteMapping("{tid}")
	public String deletedRecord(@PathVariable int tid) {
		return tService.removeTrainee(tid);
	}
	
}
