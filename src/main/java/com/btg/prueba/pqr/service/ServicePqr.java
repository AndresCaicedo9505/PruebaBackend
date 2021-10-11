package com.btg.prueba.pqr.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btg.prueba.pqr.business.IPqrBusiness;
import com.btg.prueba.pqr.model.RequestPqr;
import com.btg.prueba.pqr.model.Response;
import com.btg.prueba.pqr.model.entidades.Pqr;

@Service
public class ServicePqr {

	@Autowired
	IPqrBusiness pqrBusiness;
	
	public Response insertPqr(RequestPqr requestPqr) throws Exception {
		return new Response(requestPqr.getId(),pqrBusiness.insertPqr(requestPqr.getPqr()),null,false);
	}
	
	public Response consultarPqr(Integer requestP,Integer request) throws Exception {
		Pqr pqr = pqrBusiness.consultarPqr(request);
		Date hoy = new Date();
		int milisecondsByDay = 86400000;
		boolean rep = (int)((hoy.getTime() - pqr.getFecha().getTime())/ milisecondsByDay)>5; 
		return new Response(String.valueOf(requestP),pqr,null,rep);
	}
}
