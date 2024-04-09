package com.senac.projetoarquivo.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity // Indica que esta classe é uma entidade JPA
@Table(name = "empresa") // Especifica o nome da tabela no banco de dados
public class Empresa {

	@Id // Indica que este campo é a chave primária da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Define a estratégia de geração de valor automático para a chave primária
	@Column(name = "empresa_id", nullable = false) // Especifica o nome da coluna no banco de dados e suas propriedades
	private long id; // Atributo para armazenar o ID da empresa

	@Column(columnDefinition = "VARCHAR", name = "empresa_nome", nullable = false) // Especifica o nome da coluna no banco de dados e suas propriedades
	private String nome; // Atributo para armazenar o nome da empresa

	@OneToMany(mappedBy="empresa") // Relacionamento um-para-muitos com a entidade Projeto, mapeado pelo atributo "empresa" em Projeto
	private Set<Projeto> projetos; // Conjunto de projetos associados a esta empresa

	// Métodos getters e setters para os atributos da empresa
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(Set<Projeto> projetos) {
		this.projetos = projetos;
	}

} // Fim da classe Empresa
