package com.senac.projetoarquivo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.senac.projetoarquivo.entity.Empresa;
import com.senac.projetoarquivo.repository.EmpresaRepository;

import jakarta.transaction.Transactional;

@Service // Indica que esta classe é um serviço Spring Bean
public class EmpresaService {

    private final EmpresaRepository empresaRepository; // Repositório de empresas
    
    // Construtor que injeta o repositório de empresas
    public EmpresaService(EmpresaRepository _empresaRepository) {
		this.empresaRepository = _empresaRepository;
	}

    // Método para obter todas as empresas
	@Transactional // Indica que este método é transacional
    public List<Empresa> getAllEmpresas(){
        return empresaRepository.findAll(); // Retorna todas as empresas usando o método findAll() do repositório
    }
	
	// Método para obter uma empresa pelo ID usando o método findById() do repositório
	@Transactional // Indica que este método é transacional
    public Optional<Empresa> getEmpresaById(long id){
        return empresaRepository.findById(id); 
    }
	
	// Método para obter uma empresa pelo ID usando um método personalizado no repositório
	@Transactional // Indica que este método é transacional
    public Optional<Empresa> obterEmpresaPorId(long id){
        return empresaRepository.buscarEmpresaPorId(id); 
    }
}
