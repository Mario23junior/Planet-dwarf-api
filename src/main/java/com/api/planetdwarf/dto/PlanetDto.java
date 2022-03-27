package com.api.planetdwarf.dto;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.api.planetdwarf.model.DataComplement;

public class PlanetDto {
  
	private String designacao;
	private String diametro;
	private String massa;
	private String raioEquatorial;
	private Double volume;

	@ManyToOne
	@JoinColumn(name = "id_dataComplements", referencedColumnName = "id")
	DataComplement dataComplements;

	public PlanetDto() {
		// TODO Auto-generated constructor stub
	}

	public String getDesignacao() {
		return designacao;
	}

	public void setDesignacao(String designacao) {
		this.designacao = designacao;
	}

	public String getDiametro() {
		return diametro;
	}

	public void setDiametro(String diametro) {
		this.diametro = diametro;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getRaioEquatorial() {
		return raioEquatorial;
	}

	public void setRaioEquatorial(String raioEquatorial) {
		this.raioEquatorial = raioEquatorial;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public DataComplement getDataComplements() {
		return dataComplements;
	}

	public void setDataComplements(DataComplement dataComplements) {
		this.dataComplements = dataComplements;
	}
}
