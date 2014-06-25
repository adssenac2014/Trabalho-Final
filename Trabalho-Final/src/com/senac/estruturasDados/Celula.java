package com.senac.estruturasDados;

public class Celula<T> {

	private Celula<T> proxima;
	private Celula<T> anterior;

	private Object elemento;

	public Celula(Celula<T> proxima, Object elemento) {

		this.anterior = null;
		this.proxima = proxima;
		this.elemento = elemento;
	}

	public Celula(Object elemento) {
		this.elemento = elemento;
		this.anterior = null;
		this.proxima = null;
	}

	public void setProxima(Celula<T> proxima) {
		this.proxima = proxima;
	}

	public Celula<T> getProxima() {
		return proxima;
	}

	public <T> Object getElemento() {
		return elemento;
	}

	public Celula<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula<T> anterior) {
		this.anterior = anterior;
	}
}
