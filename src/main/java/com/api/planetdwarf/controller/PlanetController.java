package com.api.planetdwarf.controller;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.planetdwarf.service.PlanetService;

@RestController
@RequestMapping("/api/planet/map/")
public class PlanetController {
   
	private PlanetService service;
	private ModelMapper mapper;
	
	public PlanetController(PlanetService service) {
		this.service = service;
 	}
	 
}
