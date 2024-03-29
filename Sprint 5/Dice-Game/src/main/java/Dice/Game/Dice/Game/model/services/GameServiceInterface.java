package Dice.Game.Dice.Game.model.services;

import Dice.Game.Dice.Game.model.dto.GameDTO;

import java.util.List;

public interface GameServiceInterface {

	GameDTO createGame(Long playerId);

	List<GameDTO> getGamesByPlayerId(Long playerId);
}
