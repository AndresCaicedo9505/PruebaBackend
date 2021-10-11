package com.btg.prueba.pqr.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.btg.prueba.pqr.model.entidades.Pqr;

public interface PqrRepositorio extends JpaRepository<Pqr, Integer> {

}
