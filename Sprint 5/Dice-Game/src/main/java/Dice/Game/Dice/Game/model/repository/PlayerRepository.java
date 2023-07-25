package Dice.Game.Dice.Game.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Dice.Game.Dice.Game.model.domain.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
