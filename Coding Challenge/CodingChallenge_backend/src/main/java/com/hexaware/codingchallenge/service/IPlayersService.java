package com.hexaware.codingchallenge.service;

import java.util.List;

import com.hexaware.codingchallenge.dto.PlayersDTO;
import com.hexaware.codingchallenge.entity.Players;
import com.hexaware.codingchallenge.exception.PlayerNotFoundException;

public interface IPlayersService {

	
	public PlayersDTO getPlayerById(int playerId);
	
	public List<PlayersDTO>  getAllPlayers();
	
	public Players addPlayer(PlayersDTO playerDTO);
	
	public Players updatePlayer(int PlayerId ,PlayersDTO playerDTO) throws PlayerNotFoundException;
	
	public String deletePlayer(int playerId);
	
	public Players updatePlayerByQuery(Players player);
}
