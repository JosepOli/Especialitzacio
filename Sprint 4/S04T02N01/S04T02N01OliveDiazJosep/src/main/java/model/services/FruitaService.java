package model.services;

import org.springframework.stereotype.Service;
import java.util.List;

import exceptions.FruitaNotFoundException;
import model.domain.Fruita;
import model.repository.FruitaRepository;

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
		Fruita existingFruita = fruitaRepository.findById(id)
				.orElseThrow(() -> new FruitaNotFoundException("No fruita with id: " + id));
		existingFruita.setNom(updatedFruita.getNom());
		existingFruita.setQuantitatQuilos(updatedFruita.getQuantitatQuilos());
		return fruitaRepository.save(existingFruita);
	}

	public void delete(int id) { // Eliminem fruita amb id
		if (!fruitaRepository.existsById(id)) {
			throw new FruitaNotFoundException("No fruita with id: " + id);
		}
		fruitaRepository.deleteById(id);
	}

	public Fruita getOneFruita(int id) { // Retornem una fruita amb id
		return fruitaRepository.findById(id).orElseThrow(() -> new FruitaNotFoundException("No fruita with id: " + id));
	}

	public List<Fruita> getAllFruita() { // Retornem totes les fruites
		return fruitaRepository.findAll();
	}

}