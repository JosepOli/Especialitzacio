package cat.itacademy.barcelonactiva.OliveDiaz.Josep.s04.t02.n01.S04T02N01OliveDiazJosep.model.services;

import org.springframework.stereotype.Service;
import java.util.List;
import cat.itacademy.barcelonactiva.OliveDiaz.Josep.s04.t02.n01.S04T02N01OliveDiazJosep.model.repository.*;
import cat.itacademy.barcelonactiva.OliveDiaz.Josep.s04.t02.n01.S04T02N01OliveDiazJosep.model.domain.*;

@Service
public class FruitaService {
	private final FruitaRepository fruitaRepository;

	public FruitaService(FruitaRepository fruitaRepository) {
		this.fruitaRepository = fruitaRepository;
	}

	public Fruita addFruita(Fruita fruita) { // Afegim una fruita
		return fruitaRepository.save(fruita);
	}

	public Fruita update(Fruita updatedFruita, int id) { // Actualitzem fruita
		Fruita existingFruita = fruitaRepository.getReferenceById(id);
		existingFruita.setNom(updatedFruita.getNom());
		existingFruita.setQuantitatQuilos(updatedFruita.getQuantitatQuilos());
		return fruitaRepository.save(existingFruita);
	}

	public void delete(int id) { // Eliminem fruita amb id
		fruitaRepository.deleteById(id);
	}

	public List<Fruita> getAllFruita() { // Retornem totes les fruites
		return fruitaRepository.findAll();
	}

}