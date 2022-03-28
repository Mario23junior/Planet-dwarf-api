package com.api.planetdwarf.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.planetdwarf.dto.PlanetDto;
import com.api.planetdwarf.service.PlanetService;

@RestController
@RequestMapping("/api/planet/map/")
public class PlanetController {
   
	private PlanetService service;
	
	public PlanetController(PlanetService service) {
		this.service = service;
 	}
	
	@PostMapping
	public ResponseEntity<PlanetDto> savePlanet(@RequestBody PlanetDto planetDto) {
		return service.save(planetDto);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<PlanetDto> listId(@PathVariable Long id) {
		return service.listId(id);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<PlanetDto> update(@PathVariable Long id,
			@RequestBody PlanetDto planetDto) {
		return service.updateId(id, planetDto);
		
	}
	 
}









