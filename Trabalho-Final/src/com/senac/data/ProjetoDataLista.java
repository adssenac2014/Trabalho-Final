package com.senac.data;

import java.io.IOException;

import com.senac.estruturasDados.ListaLigada;
import com.senac.model.Projeto;

public class ProjetoDataLista {

	private CsvDataLista csvData;

	private String nomeArquivo;

	private ListaLigada<String[]> registrosProjetoString;

	

	public ProjetoDataLista() {

		this.nomeArquivo = "projetos";

		this.csvData = new CsvDataLista(this.nomeArquivo);
	}

	public void salvarCvs(ListaLigada<Projeto> projetoLista) throws IOException {

		csvData.SalvarArquivoCsv(converterProjetoParaString(projetoLista));

	}

	private ListaLigada<String[]> converterProjetoParaString(
			ListaLigada<Projeto> projetoLista) {

		registrosProjetoString = new ListaLigada<String[]>();
		String[] linha = {"id","titulo","descricao"};
		while (!projetoLista.vazia()) {
			
			Projeto projeto = projetoLista.pop();
			linha[0] = projeto.getId();
			linha[1] = projeto.getTitulo();
			linha[2] = projeto.getDescricao();
		
			registrosProjetoString.adicionaNoFim(linha);
		}

		return registrosProjetoString;
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
