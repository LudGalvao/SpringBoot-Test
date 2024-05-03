package com.senac.projetoarquivo.controllers.dto.response;

import java.util.Set;

import com.senac.projetoarquivo.entity.Projeto;

public class ProjetosDtoResponse {
	private Set<Projeto> projetos;
	private String nome;
	public Set<Projeto> getProjetos() {
		return projetos;
	}
	public void setProjetos(Set<Projeto> projetos) {
		this.projetos = projetos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
