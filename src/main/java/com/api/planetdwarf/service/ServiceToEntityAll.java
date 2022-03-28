package com.api.planetdwarf.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.api.planetdwarf.dto.PlanetDto;
import com.api.planetdwarf.model.Planet;
import com.api.planetdwarf.repository.PlanetRepository;

@Service
public class ServiceToEntityAll {
  
	private PlanetRepository repository;
	private ModelMapper mapper;
	

	public ServiceToEntityAll(PlanetRepository repository, ModelMapper mapper) {
		super();
		this.repository = repository;
		this.mapper = mapper;
	}

	public List<PlanetDto> ServiceToEntityAllData() {
		return ((List<Planet>)
				repository.findAll())
				.stream()
				.map(this::ConvertDtoResponse)
				.collect(Collectors.toList());
	}

	public PlanetDto ConvertDtoResponse(Planet planet) {
		mapper.getConfiguration()
		.setMatchingStrategy(MatchingStrategies.LOOSE);
		PlanetDto planetDto = mapper.map(planet, PlanetDto.class);
		return planetDto;
	}
}
