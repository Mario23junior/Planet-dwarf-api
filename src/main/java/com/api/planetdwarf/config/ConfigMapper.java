package com.api.planetdwarf.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigMapper {
  
	@Bean
	public ModelMapper mapper() {
		return new ModelMapper();
		
 	}
}
