package Dice.Game.Dice.Game.model.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import Dice.Game.Dice.Game.model.domain.Player;

public interface PlayerRepository extends MongoRepository<Player, String> {

	Optional<Player> findByName(String name);
}
