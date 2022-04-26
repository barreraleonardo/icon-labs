package com.alkemy.icons.icons.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "continente")
@Getter
@Setter
public class ContinenteEntity {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String image;
	
	private String denomainacion;

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDenomainacion() {
		return denomainacion;
	}

	public void setDenomainacion(String denomainacion) {
		this.denomainacion = denomainacion;
	}
}
