package com.senac.projetoarquivo.controllers.dto.response;

// Classe que representa um DTO (Data Transfer Object) para respostas relacionadas à Empresa
public class EmpresaDtoResponse {
	
	private String nome; // Atributo para armazenar o nome da empresa na resposta
	
	// Método getter para obter o nome da empresa na resposta
	public String getNome() {
		return nome;
	}

	// Método setter para definir o nome da empresa na resposta
	public void setNome(String nome) {
		this.nome = nome;
	}
}
