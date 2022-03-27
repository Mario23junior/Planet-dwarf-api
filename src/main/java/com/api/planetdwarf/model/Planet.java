package com.api.planetdwarf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Planet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String designacao;
	private String diametro;
	private String massa;
	private String raioEquatorial;
	private Double volume;

	@ManyToOne
	@JoinColumn(name = "id_dataComplements", referencedColumnName = "id")
	DataComplement dataComplements;

	public Planet() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
