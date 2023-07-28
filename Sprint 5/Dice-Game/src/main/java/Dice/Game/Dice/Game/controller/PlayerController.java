package Dice.Game.Dice.Game.controller;

import Dice.Game.Dice.Game.model.dto.PlayerDTO;
import Dice.Game.Dice.Game.model.services.PlayerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

	@Autowired
	private PlayerServiceInterface playerService;

	@PostMapping
	public ResponseEntity<PlayerDTO> createPlayer(@RequestBody PlayerDTO playerDTO) {
		PlayerDTO createdPlayer = playerService.createPlayer(playerDTO);
		return new ResponseEntity<>(createdPlayer, HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<PlayerDTO> updatePlayer(@RequestBody PlayerDTO playerDTO) {
		PlayerDTO updatedPlayer = playerService.updatePlayer(playerDTO);
		return new ResponseEntity<>(updatedPlayer, HttpStatus.OK);
	}

	@DeleteMapping("/{id}/games")
	public ResponseEntity<?> deleteGamesByPlayerId(@PathVariable String id) {
		playerService.deleteGamesByPlayerId(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@GetMapping
	public ResponseEntity<List<PlayerDTO>> getAllPlayers() {
		List<PlayerDTO> players = playerService.getAllPlayers();
		return new ResponseEntity<>(players, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<PlayerDTO> getPlayerById(@PathVariable String id) {
		PlayerDTO player = playerService.getPlayerById(id);
		return new ResponseEntity<>(player, HttpStatus.OK);
	}

	@GetMapping("/ranking")
	public ResponseEntity<List<PlayerDTO>> getRankings() {
		List<PlayerDTO> rankings = playerService.getRankings();
		return new ResponseEntity<>(rankings, HttpStatus.OK);
	}

	@GetMapping("/ranking/winner")
	public ResponseEntity<PlayerDTO> getWinner() {
		PlayerDTO winner = playerService.getWinner();
		return new ResponseEntity<>(winner, HttpStatus.OK);
	}

	@GetMapping("/ranking/loser")
	public ResponseEntity<PlayerDTO> getLoser() {
		PlayerDTO loser = playerService.getLoser();
		return new ResponseEntity<>(loser, HttpStatus.OK);
	}

}
