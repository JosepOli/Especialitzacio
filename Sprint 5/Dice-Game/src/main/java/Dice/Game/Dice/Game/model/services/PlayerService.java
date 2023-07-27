package Dice.Game.Dice.Game.model.services;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dice.Game.Dice.Game.model.domain.Game;
import Dice.Game.Dice.Game.model.domain.Player;
import Dice.Game.Dice.Game.model.dto.GameDTO;
import Dice.Game.Dice.Game.model.dto.PlayerDTO;
import Dice.Game.Dice.Game.model.repository.GameRepository;
import Dice.Game.Dice.Game.model.repository.PlayerRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class PlayerService implements PlayerServiceInterface {

	@Autowired
	private PlayerRepository playerRepository;

	@Autowired
	private GameRepository gameRepository;

	@Override
	public PlayerDTO createPlayer(PlayerDTO playerDTO) {
		Player player = new Player();
		player.setName(playerDTO.getName());
		player.setRegistrationDate(LocalDateTime.now());
		player = playerRepository.save(player);

		return convertToDTO(player);
	}

	@Override
	public PlayerDTO updatePlayer(PlayerDTO playerDTO) {
		Player player = playerRepository.findById(playerDTO.getId())
				.orElseThrow(() -> new EntityNotFoundException("Player not found"));

		player.setName(playerDTO.getName());
		player = playerRepository.save(player);

		return convertToDTO(player);
	}


	private PlayerDTO convertToDTO(Player player) {
		PlayerDTO playerDTO = new PlayerDTO();
		playerDTO.setId(player.getId());
		playerDTO.setName(player.getName());
		playerDTO.setRegistrationDate(Date.from(player.getRegistrationDate().toInstant(ZoneOffset.UTC)));
		playerDTO.setGames(player.getGames().stream().map(this::convertGameToDTO).collect(Collectors.toList()));
		return playerDTO;
	}

	private GameDTO convertGameToDTO(Game game) {
		GameDTO gameDTO = new GameDTO();
		gameDTO.setId(game.getId());
		gameDTO.setDiceOneValue(game.getDice1());
		gameDTO.setDiceTwoValue(game.getDice2());
		gameDTO.setWin(game.isWin());
		return gameDTO;
	}
}
