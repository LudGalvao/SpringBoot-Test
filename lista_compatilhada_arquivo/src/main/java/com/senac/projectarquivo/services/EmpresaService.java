package com.senac.projectarquivo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.senac.projectarquivo.entity.ListaCompatilhadaArquivo;
import com.senac.projectarquivo.repository.EmpresaRepository;

import jakarta.transaction.Transactional;

@Service
public class EmpresaService {
	private final EmpresaRepository empresaRepository;

	
	public EmpresaService(EmpresaRepository _empresaRepository) {
		this.empresaRepository = _empresaRepository;
	}
	
	@Transactional
	public List<ListaCompatilhadaArquivo> getAllData(){
		return empresaRepository.findAll();
	}
}
