package com.senac.estruturasDados;

public class ListaLigada<T> {

	private Celula<T> primeira;

	private Celula<T> ultima;

	private int totalDeElementos;

	public ListaLigada(Object[] vetor) {

		for (int i = 0; i < vetor.length; i++) {

			adicionaNoFim(vetor[i]);

		}

	}

	public ListaLigada() {

		this.primeira = null;
		this.ultima = null;
		this.totalDeElementos = 0;
	}

	public void adicionaNoComeco(Object elemento) {

		Celula<T> nova = new Celula<T>(elemento);
		nova.setProxima(primeira.getProxima());
		this.primeira.setAnterior(nova);
		this.primeira = nova;

	}

	public void adicionaNoFim(Object elemento) {

		Celula<T> cellNova;

		if (vazia()) {
			cellNova = new Celula<T>(elemento);
			this.ultima = cellNova;
			this.primeira = cellNova;

			this.ultima.setAnterior(primeira);
			this.primeira.setProxima(ultima);

			totalDeElementos++;

		} else {

			cellNova = new Celula<T>(elemento);
			cellNova.setAnterior(ultima);
			this.ultima.setProxima(cellNova);
			this.ultima = cellNova;
			totalDeElementos++;
		}

	}

	public void adiciona(int indice, Object elemento) {

		if (!vazia() && indice < this.totalDeElementos) {

			if (indice == (this.totalDeElementos - 1)) {
				adicionaNoFim(elemento);
			} else if (indice == 0) {

				adicionaNoComeco(elemento);
			}

			else {

				Celula<T> cellAtual = pegarCelula(indice - 1);
				Celula<T> cellNova = new Celula<T>(cellAtual.getProxima(),
						elemento);
				cellAtual.setProxima(cellNova);

				this.totalDeElementos++;
			}
		} else {

			throw new NullPointerException("Posição não existe");
		}
	}

	public <T> Object pegaPrimeira() {

		return this.primeira.getElemento();
	}

	public <T> Object pegaUltima() {

		return this.ultima.getElemento();
	}

	public int tamanho() {
		return totalDeElementos;
	}

	public boolean contem(Object objeto) {

		Celula<T> cell = this.primeira;

		boolean teste = false;

		for (int i = 0; i < this.tamanho(); i++) {

			if (cell.getElemento().equals(objeto)) {

				teste = true;
				break;

			}

			cell = cell.getProxima();

		}

		return teste;
	}

	public void removerDocomeco() {

		if (!vazia()) {
			this.primeira = this.primeira.getProxima();

			this.totalDeElementos--;
		}
	}

	public void removeDoFim() {

		if (!vazia()) {
			this.ultima = this.ultima.getAnterior();

			this.totalDeElementos--;
		}
	}

	public void removerIndice(int indice) {

		if (indice < this.tamanho()) {

			Celula<T> nova = this.primeira;

			if (indice == 0) {
				removerDocomeco();
			} else if (indice == (this.totalDeElementos - 1)) {

				removeDoFim();

			} else {

				for (int i = 0; i < indice; i++) {

					nova = nova.getProxima();

				}

				nova.getAnterior().setProxima(nova.getProxima());
				this.totalDeElementos--;

			}

		} else {

			throw new NullPointerException("Posição não existe");

		}

	}

	public boolean vazia() {

		return this.totalDeElementos == 0;
	}

	public T pegarElemento(int indice) {

		if (indice < this.totalDeElementos) {
			Celula nova = this.primeira;

			for (int i = 0; i < indice; i++) {

				nova = nova.getProxima();
			}

			return (T) nova.getElemento();

		} else

			throw new NullPointerException("Posição não existe");

	}

	private Celula<T> pegarCelula(int indice) {

		if (indice < this.totalDeElementos) {
			Celula nova = this.primeira;

			for (int i = 0; i < indice; i++) {

				nova = nova.getProxima();
			}

			return nova;

		} else

			throw new NullPointerException("Posição não existe");

	}

	public Object clonar() {

		Object[] colecao = new Object[this.totalDeElementos];

		Celula cell = this.primeira;
		for (int i = 0; i < this.totalDeElementos; i++) {

			colecao[i] = cell.getElemento();
			cell = cell.getProxima();
		}

		return colecao;
	}

	public <T> Object pop() {

		if (!vazia()) {
			
			Object objeto = pegaUltima();
			removeDoFim();

			return objeto;
		} else {
			throw new IllegalArgumentException("Lista vazia");
		}
	}

}
