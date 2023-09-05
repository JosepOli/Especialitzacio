package Dice.Game.model.services;

import java.util.List;

import Dice.Game.model.dto.GameDTO;

public interface GameServiceInterface {

	GameDTO createGame(String playerId);

	List<GameDTO> getGamesByPlayerId(String playerId);
}
