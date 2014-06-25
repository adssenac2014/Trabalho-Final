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

		ListaLigada<String> listaTable = csvData.lerArquivoCsv(nomeArquivo);
		ListaLigada<Usuario> listaUsuario = new ListaLigada<Usuario>();
		Usuario usuario;

		while (!listaTable.vazia()) {

			String[] linha = (String[]) listaTable.pegaUltima();
			listaTable.removeDoFim();

			if (linha.length == 3) {

				String idUsuario = linha[0];
				String nome = linha[1];
				String senha = linha[2];

				usuario = new Usuario(idUsuario, nome, senha);

				listaUsuario.adicionaNoFim(usuario);

			} else {

				System.err.println("Erro");
			}
		}

		return listaUsuario;
	}

	private ListaLigada<String> converterUsuarioParaString(
			ListaLigada<Usuario> listaUsuario) {

		ListaLigada<String> listatableString = new ListaLigada<String>();
		String[] linha = new String[3];
		Usuario usuario;

		for (int i = 0; i < listaUsuario.tamanho(); i++) {

			usuario = listaUsuario.pegarElemento(i);

			linha[0] = usuario.getIdUsuario();
			linha[1] = usuario.getNome();
			linha[2] = usuario.getSenha();

			listatableString.adicionaNoFim(linha);
		}
		return listatableString;

	}
}
