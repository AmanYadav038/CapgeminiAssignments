package com.music.streaming.platform.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.music.streaming.platform.dto.TrackRequest;
import com.music.streaming.platform.model.Track;
import com.music.streaming.platform.service.TrackService;

@RestController
@RequestMapping("/music/platform/v1/tracks")
public class TrackController {
	private final TrackService ts;
	public TrackController(TrackService ts) {
		this.ts = ts;
	}
	
	@PostMapping
	public ResponseEntity<Track> createTrack(@RequestBody TrackRequest tsi){
		return new ResponseEntity<Track>(ts.createTrack(tsi), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Track>> getAllTracks(){
		List<Track> lt = ts.getAllTracks();
		return new ResponseEntity<List<Track>>(lt, HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Track> getTrackId(@PathVariable long id){
		return new ResponseEntity<Track>(ts.getTrackById(id), HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Track> updateTrack(@PathVariable long id, @RequestBody TrackRequest trs){
		return new ResponseEntity<Track>(ts.updateTrack(id, trs), HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Track> deleteTrack(@PathVariable long id){
		ts.deleteTrack(id);
		return new ResponseEntity<Track>(HttpStatus.NO_CONTENT);
	}
}
