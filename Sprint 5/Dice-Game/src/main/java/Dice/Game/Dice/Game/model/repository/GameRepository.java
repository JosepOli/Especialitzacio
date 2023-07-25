package Dice.Game.Dice.Game.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Dice.Game.Dice.Game.model.domain.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}
