package cat.itacademy.barcelonactiva.olivediaz.josep.s05.t01.n02.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import cat.itacademy.barcelonactiva.olivediaz.josep.s05.t01.n02.model.dto.FlorDTO;
import cat.itacademy.barcelonactiva.olivediaz.josep.s05.t01.n02.model.services.FlorService;

@RestController
@RequestMapping("/flor")
public class FlorController {

	@Autowired
	private FlorService florService;

	@PostMapping("/add")
	public ResponseEntity<FlorDTO> addFlor(@RequestBody FlorDTO florDTO) {
		FlorDTO result = florService.addFlor(florDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body(result);
	}

	@PutMapping("/update")
	public ResponseEntity<FlorDTO> updateFlor(@RequestBody FlorDTO florDTO) {
		FlorDTO result = florService.updateFlor(florDTO);
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteFlor(@PathVariable Integer id) {
		florService.deleteFlor(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

	@GetMapping("/getOne/{id}")
	public ResponseEntity<FlorDTO> getOneFlor(@PathVariable Integer id) {
		FlorDTO result = florService.getOneFlor(id);
		if (result == null)
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<FlorDTO>> getAllFlor() {
		List<FlorDTO> result = florService.getAllFlor();
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}
