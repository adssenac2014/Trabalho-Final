package com.senac.model;

public class Projeto_Issue {
	
	private String id;
	private Projeto projeto;
	private Issue issue;
	
	public Projeto_Issue(String id, Projeto projeto, Issue issue) {
		super();
		this.id = id;
		this.projeto = projeto;
		this.issue = issue;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public Issue getIssue() {
		return issue;
	}

	public void setIssue(Issue issue) {
		this.issue = issue;
	}
	
	
}
