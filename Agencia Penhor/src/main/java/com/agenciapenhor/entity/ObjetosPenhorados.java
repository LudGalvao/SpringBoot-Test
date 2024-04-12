package com.agenciapenhor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "objetos_penhorados")
public class ObjetosPenhorados {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "nome_objeto", nullable = false)
	private String nome_objeto;
	
	@Column(name = "descricao", nullable = false)
	private String descricao;
	
	@Column(name = "valor_penhora", nullable = false)
	private float valor_penhora;
	
	@ManyToOne
    @JoinColumn(name = "agencia_id", nullable = false)
    private Agencias agencias;


}
