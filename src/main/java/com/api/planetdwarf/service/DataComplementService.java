package com.api.planetdwarf.service;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.planetdwarf.dto.DataComplementDto;
import com.api.planetdwarf.model.DataComplement;
import com.api.planetdwarf.repository.DataComplementsRepository;

@Service
public class DataComplementService {
  
	private DataComplementsRepository repository;
	private ModelMapper mapper;
	
	public DataComplementService(DataComplementsRepository repository, ModelMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
 	}
	
	public ResponseEntity<DataComplementDto> save(DataComplementDto dataComplementDto) {
		DataComplement bodyConvert = convertEnti(mapper.map(dataComplementDto, DataComplement.class));
		return ResponseEntity
				      .status(HttpStatus.OK)
				      .body(mapper.map(bodyConvert, DataComplementDto.class));
	}

	private DataComplement convertEnti(DataComplement dataComplement) {
 		return repository.save(dataComplement);
	}
	
}
