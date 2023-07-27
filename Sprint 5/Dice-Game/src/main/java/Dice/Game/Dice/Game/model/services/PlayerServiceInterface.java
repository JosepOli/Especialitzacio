package Dice.Game.Dice.Game.model.services;

import Dice.Game.Dice.Game.model.dto.PlayerDTO;

import java.util.List;

public interface PlayerServiceInterface {

	PlayerDTO createPlayer(PlayerDTO playerDTO);

	PlayerDTO updatePlayer(PlayerDTO playerDTO);

	void deleteGamesByPlayerId(Integer playerId);

	List<PlayerDTO> getAllPlayers();

	PlayerDTO getPlayerById(Integer playerId);
}
