package com.agenciapenhor.controllers.dto.request;

public class PenhoraDtoRequest {
	
	private int id;
	private float valor;
	private AgenciaDtoRequest agencia;
	private ObjetoPenhoradoDtoRequest objetoPenhorado;
	
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
	public AgenciaDtoRequest getAgencia() {
		return agencia;
	}
	public void setAgencia(AgenciaDtoRequest agencia) {
		this.agencia = agencia;
	}
	public ObjetoPenhoradoDtoRequest getObjetoPenhorado() {
		return objetoPenhorado;
	}
	public void setObjetoPenhorado(ObjetoPenhoradoDtoRequest objetoPenhorado) {
		this.objetoPenhorado = objetoPenhorado;
	}
	
	
}
