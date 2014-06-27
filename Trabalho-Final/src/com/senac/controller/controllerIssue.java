package com.senac.controller;

import com.senac.estruturasDados.ListaLigada;
import com.senac.model.Issue;
import com.senac.view.ConsoleView;

public class controllerIssue {
	
	ConsoleView view ;
	ListaLigada<String> projeto;
	
	public void menuIssue() {
	
	projeto = new ListaLigada<String>();
	
	ConsoleView view = new ConsoleView();
	
	String[] menu = {"1-Criar Issue","2-Alterar Issue","3-Excluir Issue"};
	
	view.showMenu(menu);
	
	int op = view.readInt("Escolha a opção");
	
	switch (op) {
	case 1:
	
	String tituloOP = view.readLine("Digite o Titulo da Issue");	
	String estadoOP = view.readLine("Digite o Estado da Issue");	
	String criticidadeOP = view.readLine("Digite qual a Criticidade da Issue");
	String tipoOP = view.readLine("Digite o tipo da Issue");
	String statusOP = view.readLine("Digite o Status da Issue");
	
	Issue issue = new Issue("ID", tituloOP, estadoOP, criticidadeOP, tipoOP, statusOP);

	try {
		
		projeto.adicionaNoComeco(issue);
		System.out.print("Issue inserida com sucesso");
		
	} catch (Exception e) {
		System.out.print("Erro ao inserir Issue");
	}


	
	break;
	case 2:
		
		String idOP = view.readLine("Digite o Id da Issue para alterar");
		
		try {
			//METODO ALTERAR
		} catch (Exception e) {
			System.out.print("Erro");
		}
		
		
	break;
	case 3:

		String idExluirOP = view.readLine("Digite o Id da Issue para excluir");
		
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
