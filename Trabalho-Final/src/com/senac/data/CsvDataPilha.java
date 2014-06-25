package com.senac.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.senac.estruturasDados.Pilha;

public class CsvDataPilha {

	private BufferedWriter fileWrite;
	private BufferedReader fileReader;
	private String nameFile;
	private Pilha<String[]> pilhaTableLine;

	public CsvDataPilha(String nomeArquivo) {

		pilhaTableLine = new Pilha<String[]>();
		this.nameFile = nomeArquivo;
	}

	public void run() throws IOException {

		pilhaTableLine = lerArquivoCsv(nameFile);
		SalvarArquivoCsv(pilhaTableLine);

	}

	public static void main(String[] args) throws IOException {
		new CsvDataPilha("tabela").run();
	}

	
	// Usado para salvar uma pilha de array de string em um arquivo .csv
	public void SalvarArquivoCsv(Pilha<String[]> lista) throws IOException {

		try {

			fileWrite = new BufferedWriter(new FileWriter("tabela2.csv"));

			String[] linha;

			while (!pilhaTableLine.isEmpyt()) {

				linha = (String[]) pilhaTableLine.pop();

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
		lerArquivoCsv("");
	}

	
	// lê uma arquivo .csv e retorna uma pilha de array de String, 
	public Pilha<String[]> lerArquivoCsv(String nomeArquivo) {

		try {

			fileReader = new BufferedReader(new FileReader(this.nameFile
					+ ".csv"));
			String str;
			String[] tableLine;

			while ((str = fileReader.readLine()) != null) {

				tableLine = str.split(";");

				pilhaTableLine.push(tableLine);

			}

			fileReader.close();

		} catch (IOException e) {

			e.printStackTrace();

		}
		
		Pilha<String[]> pilhaAuxiliar=new Pilha<String[]>();
		
		while(!pilhaTableLine.isEmpyt())
		{
			pilhaAuxiliar.push((String[])pilhaTableLine.pop());		
			
			
		}
		pilhaTableLine=pilhaAuxiliar;
		
		return pilhaTableLine;

	}

}
