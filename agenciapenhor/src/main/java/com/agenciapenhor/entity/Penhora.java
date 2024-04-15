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
@Table(name = "Penhora")
public class Penhora {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "valor", nullable = false)
	private float valor;
	
	@ManyToOne
	@JoinColumn(name = "agencia_id")
	private Agencia agencia;
	
	@ManyToOne
	@JoinColumn(name = "objeto_penhorado_id")
	private ObjetoPenhorado objetoPenhorado;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public ObjetoPenhorado getObjetoPenhorado() {
		return objetoPenhorado;
	}

	public void setObjetoPenhorado(ObjetoPenhorado objetoPenhorado) {
		this.objetoPenhorado = objetoPenhorado;
	}
	
}
