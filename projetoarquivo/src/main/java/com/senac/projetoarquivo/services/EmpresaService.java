package com.senac.projetoarquivo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.senac.projetoarquivo.controllers.dto.response.EmpresaDtoResponse;
import com.senac.projetoarquivo.controllers.dto.response.ProjetosDtoResponse;
import com.senac.projetoarquivo.entity.Empresa;
import com.senac.projetoarquivo.repository.EmpresaRepository;

import jakarta.transaction.Transactional;

@Service
public class EmpresaService {

    private final EmpresaRepository empresaRepository;
    
    
    public EmpresaService(EmpresaRepository _empresaRepository) {
		this.empresaRepository = _empresaRepository;
	}

	@Transactional
    public List<Empresa> getAllEmpresas(){
        return empresaRepository.findAll();
    }
	
	@Transactional
    public List<EmpresaDtoResponse> getAllEmpresasSemProjetos(){
		
		List<Empresa> listEmpresas = empresaRepository.findAll();
		
		
		if(listEmpresas.isEmpty()) {
			return null;
		}
		
		List<EmpresaDtoResponse> listaEmpresasSemProjeto = new ArrayList<EmpresaDtoResponse>();
		
		for(int i = 0; i<listEmpresas.size(); i++) {
			EmpresaDtoResponse response = new EmpresaDtoResponse();
			response.setId(listEmpresas.get(i).getId());
			response.setNome(listEmpresas.get(i).getNome());
			listaEmpresasSemProjeto.add(response);
		}
		
        return listaEmpresasSemProjeto;
    }
	
	@Transactional
    public List<ProjetosDtoResponse> getAllEmpresasComProjetos(){
		
		List<Empresa> listEmpresas = empresaRepository.findAll();
		
		
		if(listEmpresas.isEmpty()) {
			return null;
		}
		
		List<ProjetosDtoResponse> listaEmpresasComProjeto = new ArrayList<ProjetosDtoResponse>();
		
		for(int i = 0; i<listEmpresas.size(); i++) {
			ProjetosDtoResponse response = new ProjetosDtoResponse();
			response.setProjetos(listEmpresas.get(i).getProjetos());
			response.setNome(listEmpresas.get(i).getNome());
			listaEmpresasComProjeto.add(response);
		}
		
        return listaEmpresasComProjeto;
    }
	
	@Transactional
    public Optional<Empresa> getEmpresaById(long id){
        return empresaRepository.findById(id);
    }
	
	@Transactional
    public Optional<Empresa> obterEmpresaPorId(long id){
        return empresaRepository.buscarEmpresaPorId(id);
    }
}
