package com.hexaware.codingchallenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.codingchallenge.dto.PlayersDTO;
import com.hexaware.codingchallenge.entity.Players;


@Repository
public interface PlayerRepository extends JpaRepository<Players, Integer>{
    
	@Modifying
	@Query("update Players p set p.playerName = ?1, p.jerseyNumber = ?2, p.role = ?3, p.totalMatches = ?4, p.teamName = ?5, p.country = ?6, p.description = ?7 WHERE p.playerId = ?8")
	public void updatePlayerByQuery(String playerName, int jerseyNumber, String role, int totalMatches, String teamName, String country, String description,int playerId);

    
}
 