package com.senac.projetoarquivo.controllers.dto.request;

// Classe que representa um DTO (Data Transfer Object) para solicitações relacionadas à Empresa
public class EmpresaDtoRequest {
	
	private String nome; // Atributo para armazenar o nome da empresa
	private String cnpj; // Atributo para armazenar o CNPJ da empresa
	
	// Método getter para obter o nome da empresa
	public String getNome() {
		return nome;
	}
	
	// Método setter para definir o nome da empresa
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// Método getter para obter o CNPJ da empresa
	public String getCnpj() {
		return cnpj;
	}
	
	// Método setter para definir o CNPJ da empresa
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}	
}
