package cat.itacademy.barcelonactiva.OliveDiaz.Josep.s04.t02.n01.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import cat.itacademy.barcelonactiva.OliveDiaz.Josep.s04.t02.n01.exceptions.FruitaNotFoundException;
import cat.itacademy.barcelonactiva.OliveDiaz.Josep.s04.t02.n01.model.domain.Fruita;
import cat.itacademy.barcelonactiva.OliveDiaz.Josep.s04.t02.n01.model.services.FruitaService;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
