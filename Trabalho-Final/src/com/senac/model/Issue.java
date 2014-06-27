package com.senac.model;

public class Issue {
	private String id;
	private String estado;
	private String titulo;
	private String criticidade;
	private String tipo;
	private String status;
	
	public Issue(String id, String estado, String titulo, String criticidade, String tipo, String status) {
		super();
		this.id = id;
		this.estado = estado;
		this.titulo = titulo;
		this.criticidade = criticidade;
		this.tipo = tipo;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCriticidade() {
		return criticidade;
	}

	public void setCriticidade(String criticidade) {
		this.criticidade = criticidade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
