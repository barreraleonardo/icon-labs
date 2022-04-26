package com.alkemy.icons.icons.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class IconEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String image;
	
	private String denominacion;
	
	@Column(name = "fecha_creacion")
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate fechaCreacion;
	
	private Long altura;
	
	private String historia;
	
	@ManyToMany(mappedBy = "icons", cascade = CascadeType.ALL)
	private List<PaisEntity> paises = new ArrayList<>();

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public Long getAltura() {
		return altura;
	}

	public void setAltura(Long altura) {
		this.altura = altura;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}
}
