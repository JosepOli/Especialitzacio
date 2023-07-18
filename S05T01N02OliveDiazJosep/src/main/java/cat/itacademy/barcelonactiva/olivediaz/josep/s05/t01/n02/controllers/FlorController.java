package cat.itacademy.barcelonactiva.olivediaz.josep.s05.t01.n02.controllers;

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
		return new ResponseEntity<>(result, HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<FlorDTO> updateFlor(@RequestBody FlorDTO florDTO) {
		FlorDTO result = florService.updateFlor(florDTO);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteFlor(@PathVariable Integer id) {
		florService.deleteFlor(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@GetMapping("/getOne/{id}")
	public ResponseEntity<FlorDTO> getOneFlor(@PathVariable Integer id) {
		FlorDTO result = florService.getOneFlor(id);
		if (result == null)
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}
