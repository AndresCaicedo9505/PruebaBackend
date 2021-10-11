package com.btg.prueba.pqr.business.impl;

import java.util.Date;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.btg.prueba.pqr.business.IPqrBusiness;
import com.btg.prueba.pqr.model.entidades.Pqr;
import com.btg.prueba.pqr.repositorio.PqrRepositorio;

@Component
@Transactional
public class PqrBusinessImpl implements IPqrBusiness {

	@Autowired
	PqrRepositorio pqrRepositorio;
	
	@Override
	public Integer insertPqr(Pqr pqr) throws Exception {
		if(pqr.getTipoPqr().equalsIgnoreCase("Reclamo")) {
			if(pqrRepositorio.findById(pqr.getIdPqr()).isEmpty()) {
				throw new Exception("PQR NOT FOUND");
			};
		}
		pqr.setFecha(new Date());
		
		return pqrRepositorio.save(pqr).getId();
	}

	@Override
	public Pqr consultarPqr(Integer request) throws Exception {
		Optional<Pqr> prqResp = pqrRepositorio.findById(request);
		if(prqResp.isEmpty()) {
			throw new Exception("PQR NOT FOUND");
		};
		return prqResp.get();
	}

}
