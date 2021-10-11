package com.btg.prueba.pqr.model.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
@Table(name = "pqr")
public class Pqr {
	
	@Id 
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "tipo_pqr")
	private String tipoPqr;
	private String correo;
	private String documento;
	@Column(name = "nombre_completo")
	private String nombreCompleto;
	private Date fecha;
	private String repuesta;
	@Column(name = "id_pqr")
	private Integer idPqr;
	private String peticion;
}
