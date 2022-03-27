package com.api.planetdwarf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.planetdwarf.model.Planet;

@Repository
public interface PlanetRepository extends JpaRepository<Planet, Long> {
  
	Planet findByDesignacao(String designacao);
 	
}
