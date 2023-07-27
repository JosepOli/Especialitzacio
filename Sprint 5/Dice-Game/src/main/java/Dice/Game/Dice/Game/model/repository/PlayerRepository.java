package Dice.Game.Dice.Game.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import Dice.Game.Dice.Game.model.domain.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

	Optional<Player> findByName(String name);
}
