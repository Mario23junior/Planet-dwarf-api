package com.api.planetdwarf.service;

import java.util.Optional;

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
	
	public ResponseEntity<DataComplementDto> saveAllDataComple (DataComplementDto dataComplementDto) {
		DataComplement bodyConvert = convertEnti(mapper.map(dataComplementDto, DataComplement.class));
		return ResponseEntity
				      .status(HttpStatus.OK)
				      .body(mapper.map(bodyConvert, DataComplementDto.class));
	}

	private DataComplement convertEnti(DataComplement dataComplement) {
 		return repository.save(dataComplement);
	}
	
	
	public ResponseEntity<DataComplementDto> listId(Long id) {
		Optional<DataComplement> listId = repository.findById(id);
		if(listId.isPresent()) {
			return ResponseEntity.ok(mapper.map(listId.get(), DataComplementDto.class));
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	

	public ResponseEntity<DataComplementDto> updateData(Long id, DataComplementDto dataComplementDto) {
  		Optional<DataComplement> capturarData = repository.findById(id);
		if(capturarData.isPresent()) {
			DataComplement sondaInfo = capturarData.get();
 			sondaInfo.setVelocidade(dataComplementDto.getVelocidade());
 			sondaInfo.setExcentricidade(dataComplementDto.getExcentricidade());
 			sondaInfo.setInclinacao(dataComplementDto.getInclinacao());
 			sondaInfo.setTemperatura(dataComplementDto.getTemperatura());
 			sondaInfo.setSatelitesNaturais(dataComplementDto.getSatelitesNaturais());
			repository.save(sondaInfo);
			return ResponseEntity.ok(mapper.map(sondaInfo, DataComplementDto.class));
 		} else {
 			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
 		}
	}
	
	public ResponseEntity<DataComplementDto> delete(Long id) {
		Optional<DataComplement> findId = repository.findById(id);
		if(findId.isPresent()) {
			repository.delete(findId.get());
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
}























