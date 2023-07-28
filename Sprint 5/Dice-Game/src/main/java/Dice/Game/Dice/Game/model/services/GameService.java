package Dice.Game.Dice.Game.model.services;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dice.Game.Dice.Game.exception.EntityNotFoundException;
import Dice.Game.Dice.Game.model.domain.Game;
import Dice.Game.Dice.Game.model.domain.Player;
import Dice.Game.Dice.Game.model.dto.GameDTO;
import Dice.Game.Dice.Game.model.repository.GameRepository;
import Dice.Game.Dice.Game.model.repository.PlayerRepository;

@Service
public class GameService implements GameServiceInterface {

	@Autowired
	private PlayerRepository playerRepository;

	@Autowired
	private GameRepository gameRepository;

	private Random random = new Random();

	@Override
	public GameDTO createGame(String playerId) {
		Player player = playerRepository.findById(playerId)
				.orElseThrow(() -> new EntityNotFoundException("Player not found"));

		Game game = new Game();
		game.setPlayer(player);
		game.setDice1(random.nextInt(6) + 1);
		game.setDice2(random.nextInt(6) + 1);
		game.setWin(game.getDice1() + game.getDice2() == 7);
		game = gameRepository.save(game);

		// Update the player's games list and save the player
		player.getGames().add(game);
		playerRepository.save(player);

		return convertToDTO(game);
	}

	@Override
	public List<GameDTO> getGamesByPlayerId(String playerId) {
		Player player = playerRepository.findById(playerId)
				.orElseThrow(() -> new EntityNotFoundException("Player not found"));

		return player.getGames().stream().map(this::convertToDTO).collect(Collectors.toList());
	}

	private GameDTO convertToDTO(Game game) {
		GameDTO gameDTO = new GameDTO();
		gameDTO.setId(game.getId());
		gameDTO.setDiceOneValue(game.getDice1());
		gameDTO.setDiceTwoValue(game.getDice2());
		gameDTO.setWin(game.isWin());
		return gameDTO;
	}
}
