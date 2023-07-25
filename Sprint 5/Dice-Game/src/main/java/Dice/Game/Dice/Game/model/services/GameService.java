package Dice.Game.Dice.Game.model.services;

import Dice.Game.Dice.Game.model.dto.GameDTO;

public interface GameService {

	GameDTO playGame(Long playerId);
}