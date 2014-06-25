package com.senac.model;

public class Usuario {

	private String idUsuario;
	private String nome;
	private String senha;

	public Usuario(String idUsuario, String nome, String senha) {
		super();
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.senha = senha;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean verificarSenha(String senha) {

		return senha.equals(this.senha);
	}

	public String getSenha(){
		
		return this.senha;
	}
	public boolean alterarSenha(String senhaVelha, String senhaNova) {

		if (verificarSenha(senhaVelha)) {

			this.senha = senhaNova;

			return true;
		} else {

			System.err.println("Senha não alterada");
			return false;
		}

	}

}
