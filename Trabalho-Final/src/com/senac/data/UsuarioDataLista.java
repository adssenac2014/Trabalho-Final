package com.senac.data;

import java.io.IOException;

import com.senac.estruturasDados.ListaLigada;
import com.senac.model.Usuario;

public class UsuarioDataLista {

	private CsvDataLista csvData;

	private String nomeArquivo;

	public UsuarioDataLista() {

		this.nomeArquivo = "usuarios";

		this.csvData = new CsvDataLista(this.nomeArquivo);
	}

	public void salvarCsv(ListaLigada<Usuario> listaUsuario) throws IOException {

		csvData.SalvarArquivoCsv(converterUsuarioParaString(listaUsuario));

	}

	public ListaLigada<Usuario> lerCsv() {

		ListaLigada<String[]> listaTable = csvData.lerArquivoCsv(nomeArquivo);
		ListaLigada<Usuario> listaUsuario = new ListaLigada<Usuario>();
		Usuario usuario;

		while (!listaTable.vazia()) {

			String[] linha = listaTable.pegaUltima();
			listaTable.removeDoFim();

			if (linha.length == 3) {

				String idUsuario = linha[0];
				String nome = linha[1];
				String senha = linha[2];

				usuario = new Usuario(idUsuario, nome, senha);

				listaUsuario.adicionaNoComeco(usuario);

			} else {

				System.err.println("Erro");
			}
		}

		return listaUsuario;
	}

	private ListaLigada<String[]> converterUsuarioParaString(
			ListaLigada<Usuario> listaUsuario) {

		ListaLigada<String[]> listatableString = new ListaLigada<String[]>();
		
		String[] linha = {"id","Nome","Senha"};
		String[] aux = new String[3];
		Usuario usuario = null;
		
		while(!listaUsuario.vazia()){

		usuario = listaUsuario.pop();

			
			
			linha[0] = usuario.getIdUsuario();
			linha[1] = usuario.getNome();
			linha[2] = usuario.getSenha();

			System.out.println(linha[0]);
				
			aux = linha;
			
			listatableString.adicionaNoFim(aux);
		}
		
		
		
	
		return listatableString;

	}
}
