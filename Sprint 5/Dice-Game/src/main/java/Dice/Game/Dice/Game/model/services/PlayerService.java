package Dice.Game.Dice.Game.model.services;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dice.Game.Dice.Game.exception.DuplicatePlayerNameException;
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
		if (playerRepository.findByName(playerDTO.getName()).isPresent()) {
			throw new DuplicatePlayerNameException("Player with name " + playerDTO.getName() + " already exists.");
		}
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

	@Override
	public void deleteGamesByPlayerId(Long playerId) {
		Player player = playerRepository.findById(playerId)
				.orElseThrow(() -> new EntityNotFoundException("Player not found"));

		gameRepository.deleteAll(player.getGames());
	}

	@Override
	public List<PlayerDTO> getAllPlayers() {
		return playerRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
	}

	@Override
	public PlayerDTO getPlayerById(Long playerId) {
		Player player = playerRepository.findById(playerId)
				.orElseThrow(() -> new EntityNotFoundException("Player not found"));

		return convertToDTO(player);
	}

	private PlayerDTO convertToDTO(Player player) {
		PlayerDTO playerDTO = new PlayerDTO();
		playerDTO.setId(player.getId());
		playerDTO.setName(player.getName());
		playerDTO.setRegistrationDate(Date.from(player.getRegistrationDate().toInstant(ZoneOffset.UTC)));
		playerDTO.setGames(player.getGames().stream().map(this::convertGameToDTO).collect(Collectors.toList()));
		long gamesWon = player.getGames().stream().filter(Game::isWin).count();
		double successRate = (player.getGames().size() == 0) ? 0.0 : (double) gamesWon / player.getGames().size();
		playerDTO.setSuccessRate(successRate);

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

	@Override
	public List<PlayerDTO> getRankings() {
		return playerRepository.findAll().stream().map(this::convertToDTO)
				.sorted(Comparator.comparingDouble(PlayerDTO::getSuccessRate).reversed()).collect(Collectors.toList());
	}

	@Override
	public PlayerDTO getWinner() {
		return getRankings().get(0);
	}

	@Override
	public PlayerDTO getLoser() {
		List<PlayerDTO> rankings = getRankings();
		return rankings.get(rankings.size() - 1);
	}

}
