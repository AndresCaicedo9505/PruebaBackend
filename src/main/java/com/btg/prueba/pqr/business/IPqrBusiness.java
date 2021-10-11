package com.btg.prueba.pqr.business;

import com.btg.prueba.pqr.model.entidades.Pqr;

public interface IPqrBusiness {

	public Integer insertPqr(Pqr pqr) throws Exception;

	public Pqr consultarPqr(Integer request) throws Exception;
}
