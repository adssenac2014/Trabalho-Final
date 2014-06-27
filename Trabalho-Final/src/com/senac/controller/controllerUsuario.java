package com.senac.controller;

import com.senac.estruturasDados.ListaLigada;
import com.senac.model.Usuario;
import com.senac.model.Issue;
import com.senac.view.ConsoleView;

public class controllerUsuario {
	
	ConsoleView view ;
	ListaLigada<String> projetoListaLigada;
	
	public void menuUsuario() {
	
	projetoListaLigada = new ListaLigada<String>();
	
	ConsoleView view = new ConsoleView();
	
	String[] menu = {"1-Criar Usuario","2-Alterar Usuario","3-Excluir Usuario"};
	
	view.showMenu(menu);
	
	int op = view.readInt("Escolha a opção");
	
	switch (op) {
	case 1:
	
	String dataOP = view.readLine("Digite a data do projeto");	
	String comentarioOP = view.readLine("Digite o comentario do projeto");	

	
	Usuario projeto = new Usuario("ID", dataOP, comentarioOP);

	try {
		
		projetoListaLigada.adicionaNoComeco(projeto);
		System.out.print("Usuario inserido com sucesso");
		
	} catch (Exception e) {
		System.out.print("Erro ao inserir Usuario");
	}

	break;
	case 2:
		
		String idOP = view.readLine("Digite o Id do projeto para alterar");
		
		try {
			//METODO ALTERAR
		} catch (Exception e) {
			System.out.print("Erro");
		}
		
		
	break;
	case 3:

		String idExluirOP = view.readLine("Digite o Id do Usuario para excluir");
		
		try {
			//METODO EXCLUIR
		} catch (Exception e) {
			System.out.print("Erro");
		}		
		
	break;
	default:
	System.out.println("Esta nao é uma opcao valida!");
	}
	
	}

}

