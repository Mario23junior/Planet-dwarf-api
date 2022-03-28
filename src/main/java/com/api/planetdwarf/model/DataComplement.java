package com.api.planetdwarf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DataComplement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private Double velocidade;
	private Double excentricidade;
	private String inclinacao;
	private Double temperatura;
	private Integer satelitesNaturais;

	public DataComplement() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(Double velocidade) {
		this.velocidade = velocidade;
	}

	public Double getExcentricidade() {
		return excentricidade;
	}

	public void setExcentricidade(Double excentricidade) {
		this.excentricidade = excentricidade;
	}

	public String getInclinacao() {
		return inclinacao;
	}

	public void setInclinacao(String inclinacao) {
		this.inclinacao = inclinacao;
	}

	public Double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}

	public Integer getSatelitesNaturais() {
		return satelitesNaturais;
	}

	public void setSatelitesNaturais(Integer satelitesNaturais) {
		this.satelitesNaturais = satelitesNaturais;
	}

	

}
