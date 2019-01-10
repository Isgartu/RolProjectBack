package com.isgartu.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isgartu.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Long>{

	Optional<Player> findById(Long id);
	
	List<Player> findByGamername(String gamername);
	List<Player> findByCharactername(String charactername);
}
