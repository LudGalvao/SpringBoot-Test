package com.agenciapenhor.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.agenciapenhor.entity.ObjetosPenhorados;
import com.agenciapenhor.repository.AgenciaPenhorRepository;

import jakarta.transaction.Transactional;

@Service
public class AgenciaPenhorService {

	private final AgenciaPenhorRepository agenciapenhorRepository;
	
	public AgenciaPenhorService(AgenciaPenhorRepository _agenciapenhorRepository) {
		this.agenciapenhorRepository = _agenciapenhorRepository;
	}
	
	@Transactional
	public List<ObjetosPenhorados> getAllObjetosPenhorados(){
		return agenciapenhorRepository.findAll();
	}
}
