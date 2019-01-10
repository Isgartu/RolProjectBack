package com.isgartu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isgartu.exception.ResourceNotFoundException;
import com.isgartu.model.Player;
import com.isgartu.repository.PlayerRepository;

@RestController
@RequestMapping("players")
public class PlayerController {

	@Autowired
	private PlayerRepository playerRepository;
	
	@GetMapping({"", "/"})
	public List<Player> getAllPlayers() {
		return playerRepository.findAll();
	}
	
	@GetMapping("/{gamername}")
	public List<Player> getPlayerByGamername(
			@PathVariable String gamerName) {	
		if(gamerName != null) {
			return playerRepository.findByGamername(gamerName);
		} else {
			throw new ResourceNotFoundException("Invalid Search or invalid SearchParam");
		}
	}
	
	@GetMapping("/{charactername}")
	public List<Player> getPlayerByCharactername(
			@PathVariable String characterName) {
		if(characterName != null) {
			return playerRepository.findByCharactername(characterName);
		} else {
			throw new ResourceNotFoundException("Invalid Search or invalid SearchParam");
		}
	}
}
