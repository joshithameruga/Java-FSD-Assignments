package com.hexaware.codingchallenge.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.codingchallenge.dto.PlayersDTO;
import com.hexaware.codingchallenge.entity.Players;
import com.hexaware.codingchallenge.exception.PlayerNotFoundException;
import com.hexaware.codingchallenge.repository.PlayerRepository;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class PlayersServiceImpl implements IPlayersService{
	
	@Autowired
	PlayerRepository playerRepo;

	@Override
	public PlayersDTO getPlayerById(int playerId) {
		Players player = playerRepo.findById(playerId).orElse(null);
		PlayersDTO playerDTO = new PlayersDTO();
		playerDTO.setPlayerId(player.getPlayerId());
		playerDTO.setPlayerName(player.getPlayerName());
		playerDTO.setJerseyNumber(player.getJerseyNumber());
		playerDTO.setRole(player.getRole());
		playerDTO.setTeamName(player.getTeamName());
		playerDTO.setCountry(player.getCountry());
		playerDTO.setTotalMatches(player.getTotalMatches());
		playerDTO.setDescription(player.getDescription());
		return playerDTO;
	}

	@Override
	public List<PlayersDTO> getAllPlayers() {
		List<Players> playersList = playerRepo.findAll();
		List<PlayersDTO> playersDTOList = new ArrayList<>();
		for(Players player : playersList) {
			PlayersDTO playerDTO = new PlayersDTO();
			playerDTO.setPlayerId(player.getPlayerId());
			playerDTO.setPlayerName(player.getPlayerName());
			playerDTO.setJerseyNumber(player.getJerseyNumber());
			playerDTO.setRole(player.getRole());
			playerDTO.setTeamName(player.getTeamName());
			playerDTO.setCountry(player.getCountry());
			playerDTO.setTotalMatches(player.getTotalMatches());
			playerDTO.setDescription(player.getDescription());
			playersDTOList.add(playerDTO);
		}
		return playersDTOList;
	}

	@Override
	public Players addPlayer(PlayersDTO playerDTO) {
		    Players player = new Players();
		    player.setPlayerId(playerDTO.getPlayerId());
		    player.setPlayerName(playerDTO.getPlayerName());
		    player.setJerseyNumber(playerDTO.getJerseyNumber());
		    player.setRole(playerDTO.getRole());
		    player.setTeamName(playerDTO.getTeamName());
		    player.setCountry(playerDTO.getCountry());
		    player.setTotalMatches(playerDTO.getTotalMatches());
		    player.setDescription(playerDTO.getDescription());
		   return  playerRepo.save(player);
		
	}

	@Override
	public Players updatePlayer(int playerId , PlayersDTO playerDTO)  {
		    Players retrievedPlayer = playerRepo.findById(playerId).orElse(null);
		    Players player =new Players();
		 if (retrievedPlayer != null) {
			player.setPlayerId(playerDTO.getPlayerId());
		    player.setPlayerName(playerDTO.getPlayerName());
		    player.setJerseyNumber(playerDTO.getJerseyNumber());
		    player.setRole(playerDTO.getRole());
		    player.setTeamName(playerDTO.getTeamName());
		    player.setCountry(playerDTO.getCountry());
		    player.setTotalMatches(playerDTO.getTotalMatches());
		    player.setDescription(playerDTO.getDescription());
            player =  playerRepo.save(player);
		 }
		 
		 return player;
	}

	@Override
	public String deletePlayer(int playerId) {
		playerRepo.deleteById(playerId);
		return "player with id " + playerId + " deleted";
	}

	@Override
	public Players updatePlayerByQuery(Players player) {
		
		 Players checkPlayer = playerRepo.findById(player.getPlayerId()).orElse(null);
		 if (checkPlayer != null) {
				playerRepo.updatePlayerByQuery(player.getPlayerName(),  player.getJerseyNumber(), player.getRole(),  player.getTotalMatches(),
						 player.getTeamName(), player.getCountry(),  player.getDescription(),player.getPlayerId());
			 }
		 Players updatedPlayer = playerRepo.findById(player.getPlayerId()).orElse(null);
		 
		 return updatedPlayer;
	}
	
	

	
}
