package com.senac.projetoarquivo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.projetoarquivo.controllers.dto.response.EmpresaDtoResponse;
import com.senac.projetoarquivo.entity.Empresa;
import com.senac.projetoarquivo.services.EmpresaService;

@RestController // Indica que esta classe é um controller REST
@RequestMapping("api/empresa") // Define o caminho base para este controller
public class EmpresaController {
    
    private final EmpresaService empresaService; // Instância de EmpresaService para manipulação de empresas

    // Construtor que injeta uma instância de EmpresaService
    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }
    
    // Método para obter todas as empresas
    @GetMapping
    public ResponseEntity<List<Empresa>> getAllEmpresas(){
        List<Empresa> empresas = empresaService.getAllEmpresas(); // Obtém todas as empresas através do serviço
        if(empresas.isEmpty())
            return ResponseEntity.notFound().build(); // Retorna 404 se a lista estiver vazia
        return ResponseEntity.ok(empresas); // Retorna a lista de empresas com status 200
    }
    
    // Método para obter uma empresa pelo ID
    @GetMapping(value = "getEmpresaById/{empresaId}")    
    public ResponseEntity<Optional<Empresa>> getEmpresa(@PathVariable Long empresaId){
        Optional<Empresa> empresa = empresaService.getEmpresaById(empresaId); // Obtém a empresa pelo ID
        if(empresa.isEmpty())
            return ResponseEntity.notFound().build(); // Retorna 404 se a empresa não for encontrada
        return ResponseEntity.ok(empresa); // Retorna a empresa com status 200
    }

    // Método semelhante para obter uma empresa pelo ID
    @GetMapping(value = "obterEmpresaPorId/{empresaId}")    
    public ResponseEntity<Optional<Empresa>> getEmpresaporId(@PathVariable Long empresaId){
        Optional<Empresa> empresa = empresaService.obterEmpresaPorId(empresaId); // Obtém a empresa pelo ID
        if(empresa.isEmpty())
            return ResponseEntity.notFound().build(); // Retorna 404 se a empresa não for encontrada
        return ResponseEntity.ok(empresa); // Retorna a empresa com status 200
    }   
}
