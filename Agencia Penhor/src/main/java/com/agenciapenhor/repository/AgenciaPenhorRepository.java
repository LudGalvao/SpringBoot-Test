package com.agenciapenhor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agenciapenhor.entity.ObjetosPenhorados;

@Repository
public interface AgenciaPenhorRepository extends JpaRepository<ObjetosPenhorados, String> {
	// @Query("")
	
}
