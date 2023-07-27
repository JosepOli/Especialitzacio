package Dice.Game.Dice.Game.model.services;

import Dice.Game.Dice.Game.model.dto.PlayerDTO;

import java.util.List;

public interface PlayerServiceInterface {

	PlayerDTO createPlayer(PlayerDTO playerDTO);

	PlayerDTO updatePlayer(PlayerDTO playerDTO);

	void deleteGamesByPlayerId(Long playerId);

	List<PlayerDTO> getAllPlayers();

	PlayerDTO getPlayerById(Long playerId);

	List<PlayerDTO> getRankings();

	PlayerDTO getWinner();

	PlayerDTO getLoser();

}
