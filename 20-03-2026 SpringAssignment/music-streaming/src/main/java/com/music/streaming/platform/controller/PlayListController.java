package com.music.streaming.platform.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.music.streaming.platform.dto.PlayListRequest;
import com.music.streaming.platform.model.PlayList;
import com.music.streaming.platform.service.PlayListService;

@RestController
@RequestMapping("/music/platform/v1/playlists")
public class PlayListController {
	private final PlayListService pls;
	public PlayListController(PlayListService pls) {
		this.pls = pls;
	}
	
	@PostMapping
	public ResponseEntity<PlayList> createPlayList(@RequestBody PlayListRequest plr) {
		return new ResponseEntity<PlayList>(pls.createPlayList(plr), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PlayList> getPlayList(@PathVariable long id){
		return new ResponseEntity<PlayList>(pls.getPlayListById(id), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<PlayList> deletePlaylist(@PathVariable long id){
		PlayList pl = pls.getPlayListById(id);
		if(pl!=null) {
			pls.deletePlayList(id);
			return new ResponseEntity<PlayList>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<PlayList>(HttpStatus.NO_CONTENT);
	}
}
