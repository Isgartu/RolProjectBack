package com.isgartu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.isgartu.dto.Dto;
import com.isgartu.dto.PlayerDetailsDto;
import com.isgartu.dto.PlayerGlobalDto;
import com.isgartu.exception.ResourceNotFoundException;
import com.isgartu.model.Player;
import com.isgartu.repository.PlayerRepository;


@RestController
@RequestMapping("pathfinder/v1/players")
public class PlayerController {

	@Autowired
	private PlayerRepository playerRepository;
	
	@GetMapping
    @Dto(PlayerGlobalDto.class)
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @GetMapping("/{playerId}")
    @Dto(PlayerDetailsDto.class)
    public Player getPlayerDetails(@PathVariable Long playerId) {
    	if(playerId != null) {
    		return playerRepository.getOne(playerId);
    	} else {
    		throw new ResourceNotFoundException("Invalid playerId");
    	}
    }
    
    @GetMapping("/search")
    @Dto(PlayerDetailsDto.class)
    public List<Player> getPlayerSearch(
    		@RequestParam(value="gamername", required=false) String gamerName,
    		@RequestParam(value="charactername", required=false) String characterName) {
    	
    	if (!StringUtils.isEmpty(gamerName)){
    		return playerRepository.findByGamername(gamerName);
    	} else if (!StringUtils.isEmpty(characterName)){
    		return playerRepository.findByCharactername(characterName);
    	} else {
    		throw new ResourceNotFoundException("Invalid Search or invalid SearchParam");
    	}
    }
    
}
