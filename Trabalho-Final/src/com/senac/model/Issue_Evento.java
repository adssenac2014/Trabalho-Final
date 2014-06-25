package com.senac.model;

public class Issue_Evento {
	
	private String id;
	private Issue issue;
	private Evento evento;
	private Usuario usuario;
	
	public Issue_Evento(String id, Issue issue, Evento evento, Usuario usuario) {
		super();
		this.id = id;
		this.issue = issue;
		this.evento = evento;
		this.usuario = usuario;	
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Issue getIssue() {
		return issue;
	}

	public void setIssue(Issue issue) {
		this.issue = issue;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
