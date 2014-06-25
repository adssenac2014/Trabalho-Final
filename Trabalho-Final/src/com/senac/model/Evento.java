package com.senac.model;

public class Evento {
	private String id;
	private String data;
	private String comentario;
	
	public Evento(String id, String data, String comentario) {
		super();
		this.id = id;
		this.data = data;
		this.comentario = comentario;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
	
	
	
}
