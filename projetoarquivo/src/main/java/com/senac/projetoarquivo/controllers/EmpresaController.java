package com.senac.projetoarquivo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.projetoarquivo.controllers.dto.response.EmpresaDtoResponse;
import com.senac.projetoarquivo.controllers.dto.response.ProjetosDtoResponse;
import com.senac.projetoarquivo.entity.Empresa;
import com.senac.projetoarquivo.services.EmpresaService;

@RestController
@RequestMapping("api/empresa")
public class EmpresaController {
	
    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }
	
    @GetMapping
    public ResponseEntity<List<Empresa>> getAllEmpresas(){
        List<Empresa> empresas = empresaService.getAllEmpresas();
        if(empresas.isEmpty())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(empresas);
    }
    
    @GetMapping(value = "getEmpresaById/{empresaId}")    
    public ResponseEntity<Optional<Empresa>> getEmpresa(@PathVariable Long empresaId){
        Optional<Empresa> empresa = empresaService.getEmpresaById(empresaId);
        if(empresa.isEmpty())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(empresa);
    }

    @GetMapping(value = "obterEmpresaPorId/{empresaId}")    
    public ResponseEntity<Optional<Empresa>> getEmpresaporId(@PathVariable Long empresaId){
        Optional<Empresa> empresa = empresaService.obterEmpresaPorId(empresaId);
        if(empresa.isEmpty())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(empresa);
    }
    
    @GetMapping(value = "getEmpresaSemProjetos")
    public ResponseEntity<List<EmpresaDtoResponse>> getAllEmpresasSemProjetos(){
        List<EmpresaDtoResponse> empresas = empresaService.getAllEmpresasSemProjetos();
        if(empresas.isEmpty())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(empresas);
    }
    
    @GetMapping(value = "getEmpresaComProjetos")
    public ResponseEntity<List<ProjetosDtoResponse>> getAllEmpresasComProjetos(){
        List<ProjetosDtoResponse> empresas = empresaService.getAllEmpresasComProjetos();
        if(empresas.isEmpty())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(empresas);
    }
    
	
}
	