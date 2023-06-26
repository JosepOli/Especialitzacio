package cat.itacademy.barcelonactiva.oliveDiaz.Josep.s04.t02.n02.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.oliveDiaz.Josep.s04.t02.n02.exceptions.FruitaNotFoundException;
import cat.itacademy.barcelonactiva.oliveDiaz.Josep.s04.t02.n02.model.domain.Fruita;
import cat.itacademy.barcelonactiva.oliveDiaz.Josep.s04.t02.n02.model.services.FruitaService;

@RestController
@RequestMapping("/fruita")
public class FruitaController {

	@Autowired
	private FruitaService fruitaService;

	@PostMapping("/add")
	public Fruita addFruita(@RequestBody Fruita fruita) {
		return fruitaService.addFruita(fruita);
	}

	@PutMapping("/update/{id}")
	public Fruita updateFruita(@RequestBody Fruita fruita, @PathVariable int id) {
		return fruitaService.update(fruita, id);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteFruita(@PathVariable int id) {
		fruitaService.delete(id);
	}

	@GetMapping("/getOne/{id}")
	public Fruita getOneFruita(@PathVariable int id) {
		return fruitaService.getOneFruita(id);
	}

	@GetMapping("/getAll")
	public List<Fruita> getAllFruita() {
		return fruitaService.getAllFruita();
	}

	@ExceptionHandler(FruitaNotFoundException.class)
	public ResponseEntity<String> handleFruitaNotFound(FruitaNotFoundException ex) {
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}
}
