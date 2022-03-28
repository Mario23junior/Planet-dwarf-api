package com.api.planetdwarf.dto;

public class DataComplementDto {

	private Double velocidade;
	private Double excentricidade;
	private String inclinacao;
	private Double temperatura;
	private Integer satelitesNaturais;

	public DataComplementDto() {
		// TODO Auto-generated constructor stub
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
