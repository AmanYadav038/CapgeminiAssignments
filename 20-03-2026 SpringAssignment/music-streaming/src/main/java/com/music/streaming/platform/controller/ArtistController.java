package com.music.streaming.platform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.music.streaming.platform.common.exception.ResourceNotFoundException;
import com.music.streaming.platform.dto.ArtistRequest;
import com.music.streaming.platform.model.Artist;
import com.music.streaming.platform.service.ArtistService;

@RestController
@RequestMapping("/music/platform/v1/artists")
public class ArtistController {
	private final ArtistService asi;
	
	public ArtistController(ArtistService asi) {
		this.asi = asi;
	}
	
	@GetMapping
	public ResponseEntity<List<Artist>> getAllArtist(){
		List<Artist> artists = asi.getAllArtists();
		return new ResponseEntity<List<Artist>>(artists, HttpStatusCode.valueOf(200));
	}
	
	@PostMapping
	public ResponseEntity<Artist> createArtist(@RequestBody ArtistRequest artist) {
		Artist artist2 = asi.createArtist(artist);
		return new ResponseEntity<Artist>(artist2, HttpStatusCode.valueOf(200));		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Artist> getArtistId(@PathVariable long id) {
		Artist artist = asi.getArtistById(id);
		return new ResponseEntity<Artist>(artist, HttpStatusCode.valueOf(200));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Artist> updateArtist(@PathVariable long id, @RequestBody ArtistRequest ar) {
		Artist artist = asi.updateArtist(id, ar);
		return new ResponseEntity<Artist>(artist, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Artist> deleteArtists(@PathVariable long id){
		Artist artist = asi.getArtistById(id);
		if(artist != null){
	        asi.deleteArtist(id);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT); 
	    }

	    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
