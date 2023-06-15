package cat.itacademy.barcelonactiva.OliveDiaz.Josep.s04.t02.n01.S04T02N01OliveDiazJosep.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import cat.itacademy.barcelonactiva.OliveDiaz.Josep.s04.t02.n01.S04T02N01OliveDiazJosep.model.services.FruitaService;
import exceptions.FruitaNotFoundException;
import cat.itacademy.barcelonactiva.OliveDiaz.Josep.s04.t02.n01.S04T02N01OliveDiazJosep.model.domain.Fruita;
import java.util.List;

@RestController
@RequestMapping("/fruita")
public class FruitaController {

	private final FruitaService fruitaService;

	public FruitaController(FruitaService fruitaService) {
		this.fruitaService = fruitaService;
	}

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
