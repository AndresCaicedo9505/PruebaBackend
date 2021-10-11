package com.btg.prueba.pqr.controlador;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.btg.prueba.pqr.model.RequestPqr;
import com.btg.prueba.pqr.model.Response;
import com.btg.prueba.pqr.service.ServicePqr;

@RestController
public class PqrControlador {

	@Autowired
	ServicePqr servicePqr;
	
	@PostMapping("/newPqr")
	public ResponseEntity<Response> registrarPqr(@RequestBody RequestPqr request){
		try {
			return new ResponseEntity<Response>(servicePqr.insertPqr(request),HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<Response>(new Response(request.getId(),null,e.getMessage(),false),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/Pqr/{idp}/{id}")
	public ResponseEntity<Response> consultarPqr(@PathVariable Integer idp, @PathVariable Integer id){
		try {
			return new ResponseEntity<Response>(servicePqr.consultarPqr(idp, id),HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<Response>(new Response(String.valueOf(idp),null,e.getMessage(),false),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
	
}
