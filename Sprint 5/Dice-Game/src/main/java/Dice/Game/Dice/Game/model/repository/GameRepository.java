package Dice.Game.Dice.Game.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import Dice.Game.Dice.Game.model.domain.Game;

public interface GameRepository extends MongoRepository<Game, String> {
}
