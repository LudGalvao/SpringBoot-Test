package com.senac.projetoarquivo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity // Indica que esta classe é uma entidade JPA
@Table(name = "projeto") // Especifica o nome da tabela no banco de dados
public class Projeto {
	
	@Id // Indica que este campo é a chave primária da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Define a estratégia de geração de valor automático para a chave primária
	@Column(name = "projeto_id", nullable = false) // Especifica o nome da coluna no banco de dados e suas propriedades
	private long id; // Atributo para armazenar o ID do projeto

	@Column(columnDefinition = "VARCHAR", name = "projeto_descricao", nullable = false) // Especifica o nome da coluna no banco de dados e suas propriedades
	private String descricao; // Atributo para armazenar a descrição do projeto

	@JsonIgnore // Indica que esta propriedade deve ser ignorada durante a serialização/desserialização JSON
	@ManyToOne // Define o relacionamento muitos-para-um com a entidade Empresa
	@JoinColumn(name="empresa_id", nullable=false) // Especifica a coluna na tabela de Projeto que é a chave estrangeira para a tabela de Empresa
	private Empresa empresa; // Atributo que representa a empresa associada a este projeto

	// Métodos getters e setters para os atributos do projeto
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
}
