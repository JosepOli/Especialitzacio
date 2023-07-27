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

}
