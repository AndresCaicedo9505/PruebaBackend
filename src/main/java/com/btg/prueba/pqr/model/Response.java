package com.btg.prueba.pqr.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Response {

	private String id;
	private Object objetoResponse;
	private String mensajeError;
	private boolean bandera;
	
}
