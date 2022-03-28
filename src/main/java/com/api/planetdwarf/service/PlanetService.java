package com.api.planetdwarf.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.planetdwarf.dto.PlanetDto;
import com.api.planetdwarf.exception.ReturnErroExceptionMessage;
import com.api.planetdwarf.model.Planet;
import com.api.planetdwarf.repository.PlanetRepository;

@Service
public class PlanetService {

	private PlanetRepository repository;
	private ModelMapper mapper;
	
	public PlanetService(PlanetRepository repository, ModelMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
 	}
	
	public ResponseEntity<PlanetDto> save(PlanetDto planetDto) {
		ValidValueDuplicate(planetDto);
 		Planet modelSave = bodysave(mapper.map(planetDto, Planet.class));
		return ResponseEntity
				   .status(HttpStatus.OK)
				   .body(mapper.map(modelSave, PlanetDto.class));
	}
	
	public Planet bodysave(Planet planetDto) {
 		return repository.save(planetDto); 
	}
	
	public void ValidValueDuplicate(PlanetDto planetDto) {
		Planet dtoPlane = mapper.map(planetDto, Planet.class);
		Planet planetFind = repository.findByDesignacao(planetDto.getDesignacao());
		if(planetFind != null && planetFind.getId() != dtoPlane.getId()) {
			throw new ReturnErroExceptionMessage("Designação "+ planetFind.getDesignacao() 
			+" Já esta cadastrada");
		}
	}
	
	public ResponseEntity<PlanetDto> listId(Long id) {
		Optional<Planet> idPla = repository.findById(id);
		if(idPla.isPresent()) {
			return ResponseEntity.ok(mapper.map(idPla.get(), PlanetDto.class));
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}

}





















