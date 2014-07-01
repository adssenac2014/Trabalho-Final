package com.senac.data;

import java.io.IOException;

import com.senac.estruturasDados.ListaLigada;
import com.senac.model.Evento;
import com.senac.model.Projeto;

public class EventoDataLista {

	private CsvDataLista csvData;

	private String nomeArquivo;

	private ListaLigada<String[]> registrosEventoString;

	public EventoDataLista() {

		this.nomeArquivo = "eventos";

		this.csvData = new CsvDataLista(this.nomeArquivo);
	}

	public void salvarCvs(ListaLigada<Evento> eventoLista) throws IOException {

		csvData.SalvarArquivoCsv(converterProjetoParaString(eventoLista));

	}

	private ListaLigada<String[]> converterProjetoParaString(
			ListaLigada<Evento> eventoLista) {

		registrosEventoString = new ListaLigada<String[]>();
		String[] linha = {"id","data","comentario"};
		while (!eventoLista.vazia()) {
			
			Evento evento = eventoLista.pop();
			linha[0] = evento.getId();
			linha[1] = evento.getData();
			linha[2] = evento.getComentario();
		
			registrosEventoString.adicionaNoFim(linha);
		}

		return registrosEventoString;
	}

	public ListaLigada<Projeto> lerCsv() {

		ListaLigada<String[]> registrosProjetoString = csvData
				.lerArquivoCsv(nomeArquivo);
		ListaLigada<Projeto> listaProjeto = new ListaLigada<Projeto>();
		String[] linha = { "id", "titulo", "descricao" };

		while (!registrosProjetoString.vazia()) {

			linha = registrosProjetoString.pop();

			if (linha.length == 3) {
				// linha[0] = id, linha[1] = titulo, linha[2] = descricao
				Projeto projeto = new Projeto(linha[0], linha[1], linha[2]);
				listaProjeto.adicionaNoFim(projeto);
			}
		}

		return listaProjeto;
	}

}
