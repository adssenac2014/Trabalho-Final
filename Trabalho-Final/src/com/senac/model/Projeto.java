package com.senac.model;

import com.senac.estruturasDados.ListaLigada;

public class Projeto {
	
	private String id;
	private String titulo;
	private String descricao;
	private ListaLigada<Usuario> usuarioLista;
	public Projeto(String id, String titulo, String descricao) {
		
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.usuarioLista = new ListaLigada<Usuario>();
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public ListaLigada<Usuario> getListaUsuario(){
		
	return this.usuarioLista;
	
	}
	
}
