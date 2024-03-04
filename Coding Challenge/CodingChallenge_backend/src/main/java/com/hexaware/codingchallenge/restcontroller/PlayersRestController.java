
package com.hexaware.codingchallenge.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.codingchallenge.dto.PlayersDTO;
import com.hexaware.codingchallenge.entity.Players;
import com.hexaware.codingchallenge.exception.PlayerNotFoundException;
import com.hexaware.codingchallenge.service.PlayersServiceImpl;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/players")
public class PlayersRestController {

	@Autowired
	PlayersServiceImpl service;
	
	@GetMapping("/retrievePlayerById/{playerId}")
	public PlayersDTO getPlayerById(@PathVariable int playerId) {
		return service.getPlayerById(playerId);
	}
	
	@GetMapping("/retrieveAllPlayers")
	public List<PlayersDTO> getAllPlayers(){
		return service.getAllPlayers();
	}
	@PostMapping("/insertPlayer")
	public Players addPlayer(PlayersDTO playerDTO) {
		return service.addPlayer(playerDTO);
	}
	
	@PutMapping("/updatePlayer/{playerId}")
	public Players updatePlayer(@PathVariable int playerId ,@RequestBody PlayersDTO playerDTO) throws PlayerNotFoundException {
		Players player = service.updatePlayer(playerId ,playerDTO);
		
		return player;
	}
	
	@DeleteMapping("/deletePlayer/{playerId}")
	public String deletePlayer(@PathVariable int playerId) {
		return service.deletePlayer(playerId);
	}
	
	@PutMapping("/updatePlayerByQuery")
	public Players updatePlayerByQuery(@RequestBody Players player) {
		
		return service.updatePlayerByQuery(player);
	}
}
