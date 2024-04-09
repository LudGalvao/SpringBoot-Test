package com.senac.projectarquivo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lista_compartilhada_arquivo")
public class ListaCompartilhadaArquivo{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lista_compartilhada_arquivo_id", nullable = false)
	private long lista_compartilhada_arquivo_id;
	
	@Column(columnDefinition = "VARCHAR", name = "permissionamento_id", nullable = false) 
	private String permissionamento_id;
	
	@Column(name = "lista_compartilhada_id", nullable = false)
	private long lista_compartilhada_id;

	public long getLista_compartilhada_arquivo_id() {
		return lista_compartilhada_arquivo_id;
	}

	public void setLista_compartilhada_arquivo_id(long lista_compartilhada_arquivo_id) {
		this.lista_compartilhada_arquivo_id = lista_compartilhada_arquivo_id;
	}

	public String getPermissionamento_id() {
		return permissionamento_id;
	}

	public void setPermissionamento_id(String permissionamento_id) {
		this.permissionamento_id = permissionamento_id;
	}

	public long getLista_compartilhada_id() {
		return lista_compartilhada_id;
	}

	public void setLista_compartilhada_id(long lista_compartilhada_id) {
		this.lista_compartilhada_id = lista_compartilhada_id;
	}
	
	
}
