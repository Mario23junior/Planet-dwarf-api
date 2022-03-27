package com.api.planetdwarf.service;

import org.springframework.stereotype.Service;

import com.api.planetdwarf.repository.PlanetRepository;

@Service
public class PlanetService {

	private PlanetRepository repository;
	
	public PlanetService(PlanetRepository repository) {
		this.repository = repository;
 	}
	
}
