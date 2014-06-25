package com.senac.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.senac.estruturasDados.ListaLigada;

public class CsvDataLista {

	private BufferedWriter fileWrite;
	private BufferedReader fileReader;
	private String nameFile;

	private ListaLigada<String> listaTableLine;

	public CsvDataLista(String nomeArquivo) {

		listaTableLine = new ListaLigada<String>();
		this.nameFile = nomeArquivo;
	}

	public void run() throws IOException {

		listaTableLine = lerArquivoCsv("tabela");
		SalvarArquivoCsv(listaTableLine);
		System.out.println("ok");

	}

	public static void main(String[] args) throws IOException {
		new CsvDataLista("tabela").run();
	}

	public void SalvarArquivoCsv(ListaLigada<String> listaTableLine)
			throws IOException {

		try {

			fileWrite = new BufferedWriter(new FileWriter(nameFile + "2.csv"));

			String[] linha;

			while (!listaTableLine.vazia()) {

				linha = (String[]) listaTableLine.pop();

				for (int j = 0; j < linha.length; j++) {

					fileWrite.write(linha[j]);
					fileWrite.write(";");
				}
				fileWrite.write("\n");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		fileWrite.close();
	
		
	}

	// lê uma arquivo .csv e retorna uma pilha de array de String,
	public ListaLigada<String> lerArquivoCsv(String nomeArquivo) {

		try {

			fileReader = new BufferedReader(new FileReader(this.nameFile
					+ ".csv"));
			String str;
			String[] tableLine;

			while ((str = fileReader.readLine()) != null) {

				tableLine = str.split(";");

				listaTableLine.adicionaNoFim(tableLine);

			}

			fileReader.close();

		} catch (IOException e) {

			e.printStackTrace();

		}

		return listaTableLine;

	}

}
