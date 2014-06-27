package com.senac.controller;

import com.senac.estruturasDados.ListaLigada;
import com.senac.model.Projeto;
import com.senac.model.Issue;
import com.senac.view.ConsoleView;

public class controllerProjeto {
	
	ConsoleView view ;
	ListaLigada<String> projetoListaLigada;
	
	public void menuProjeto() {
	
	projetoListaLigada = new ListaLigada<String>();
	
	ConsoleView view = new ConsoleView();
	
	String[] menu = {"1-Criar Projeto","2-Alterar Projeto","3-Excluir Projeto"};
	
	view.showMenu(menu);
	
	int op = view.readInt("Escolha a opção");
	
	switch (op) {
	case 1:
	
	String dataOP = view.readLine("Digite a data do projeto");	
	String comentarioOP = view.readLine("Digite o comentario do projeto");	

	
	Projeto projeto = new Projeto("ID", dataOP, comentarioOP);

	try {
		
		projetoListaLigada.adicionaNoComeco(projeto);
		System.out.print("Projeto inserido com sucesso");
		
	} catch (Exception e) {
		System.out.print("Erro ao inserir Projeto");
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

		String idExluirOP = view.readLine("Digite o Id do Projeto para excluir");
		
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

