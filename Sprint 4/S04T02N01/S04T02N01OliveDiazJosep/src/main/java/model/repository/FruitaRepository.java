package model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.domain.Fruita;

public interface FruitaRepository extends JpaRepository<Fruita, Integer> {

}
