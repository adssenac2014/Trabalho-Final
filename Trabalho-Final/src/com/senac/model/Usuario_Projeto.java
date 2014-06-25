package com.senac.model;

public class Usuario_Projeto {
	
	private String id;
	private Usuario usuario;
	private Projeto projeto;
	
	public Usuario_Projeto(String id, Usuario usuario, Projeto projeto) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.projeto = projeto;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	
}
