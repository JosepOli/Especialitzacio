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
}
