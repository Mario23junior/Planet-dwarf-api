package com.api.planetdwarf.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.planetdwarf.dto.DataComplementDto;
import com.api.planetdwarf.service.DataComplementService;

@RestController
@RequestMapping("/api/dataComplement/map/")
public class DataComplementController {
  
	private DataComplementService service;
 	
	public DataComplementController(DataComplementService service) {
 		this.service = service;
 	}
	
	@PostMapping
	public ResponseEntity<DataComplementDto> save(@RequestBody DataComplementDto dataComplementDto){
		return service.saveAllDataComple(dataComplementDto);
 	}
	
	@GetMapping("{id}")
	public ResponseEntity<DataComplementDto> listId(@PathVariable Long id) {
		return service.listId(id);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<DataComplementDto> update(@RequestBody DataComplementDto dataComplementDto, 
			@PathVariable Long id) {
		return service.updateData(id, dataComplementDto);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<DataComplementDto> delete(@PathVariable Long id) {
		return service.delete(id);
	}
}








