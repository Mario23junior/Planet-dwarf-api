package com.api.planetdwarf.dto;

public class DataComplementDto {
 
	private Double velocidade;
	private Double Excentricidade;
	private String Inclinacao;
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
		return Excentricidade;
	}

	public void setExcentricidade(Double excentricidade) {
		Excentricidade = excentricidade;
	}

	public String getInclinacao() {
		return Inclinacao;
	}

	public void setInclinacao(String inclinacao) {
		Inclinacao = inclinacao;
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
