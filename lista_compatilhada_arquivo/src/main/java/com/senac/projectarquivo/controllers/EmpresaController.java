package com.senac.projectarquivo.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.projectarquivo.entity.ListaCompatilhadaArquivo;
import com.senac.projectarquivo.services.EmpresaService;

@RestController
@RequestMapping("api/empresa")
public class EmpresaController {

	private final EmpresaService empresaService;

	public EmpresaController(EmpresaService empresaService) {
		this.empresaService = empresaService;
	}
	
//	@GetMapping
//	public ResponseEntity<Empresa> obtemEmpresas(){
//		Empresa empresa = new Empresa();
//		empresa.setId(0);
//		empresa.setNome("Senac");
//		
//		return new ResponseEntity<>(empresa, HttpStatus.OK);
//	}
	
	@GetMapping
	public ResponseEntity<List<ListaCompatilhadaArquivo>> getAllData(){
		List<ListaCompatilhadaArquivo> empresas = empresaService.getAllData();
		if(empresas.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(empresas);
	}
}
