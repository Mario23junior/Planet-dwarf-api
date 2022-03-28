package com.api.planetdwarf.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.planetdwarf.dto.PlanetDto;
import com.api.planetdwarf.service.ServiceToEntityAll;

@RestController
@RequestMapping("/api/all/map/planets/")
public class ControllerAllResponse {
  
	private ServiceToEntityAll service;
 	
	public ControllerAllResponse(ServiceToEntityAll service) {
		this.service = service;
 	}
	
	@GetMapping
	public List<PlanetDto> listAll() {
		return service.ServiceToEntityAllData();
	}
}