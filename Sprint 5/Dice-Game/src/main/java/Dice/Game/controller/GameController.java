package Dice.Game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import Dice.Game.model.dto.GameDTO;
import Dice.Game.model.services.GameServiceInterface;

import java.util.List;

@RestController
@RequestMapping("/players/{id}/games")
public class GameController {

	@Autowired
	private GameServiceInterface gameService;

	@PostMapping
	public ResponseEntity<GameDTO> createGame(@PathVariable String id) {
		GameDTO game = gameService.createGame(id);
		return new ResponseEntity<>(game, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<GameDTO>> getGamesByPlayerId(@PathVariable String id) {
		List<GameDTO> games = gameService.getGamesByPlayerId(id);
		return new ResponseEntity<>(games, HttpStatus.OK);
	}
}
