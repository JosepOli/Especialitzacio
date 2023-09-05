package Dice.Game.model.services;

import java.util.List;

import Dice.Game.model.dto.PlayerDTO;

public interface PlayerServiceInterface {

	PlayerDTO createPlayer(PlayerDTO playerDTO);

	PlayerDTO updatePlayer(PlayerDTO playerDTO);

	void deleteGamesByPlayerId(String playerId);

	List<PlayerDTO> getAllPlayers();

	PlayerDTO getPlayerById(String playerId);

	List<PlayerDTO> getRankings();

	PlayerDTO getWinner();

	PlayerDTO getLoser();

}
