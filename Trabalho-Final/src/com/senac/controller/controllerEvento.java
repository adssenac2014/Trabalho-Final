package com.senac.controller;

import com.senac.estruturasDados.ListaLigada;
import com.senac.model.Evento;
import com.senac.model.Issue;
import com.senac.view.ConsoleView;

public class controllerEvento {

	ConsoleView view;
	ListaLigada<String> projeto;

	public void menuEvento() {

		projeto = new ListaLigada<String>();

		ConsoleView view = new ConsoleView();

		String[] menu = { "1-Criar Evento", "2-Alterar Evento",
				"3-Excluir Evento" };

		view.showMenu(menu);

		int op = view.readInt("Escolha a opção");

		switch (op) {
		case 1:

			String dataOP = view.readLine("Digite a data do evento");
			String comentarioOP = view
					.readLine("Digite o comentario do evento");

			Evento evento = new Evento("ID", dataOP, comentarioOP);

			try {

				projeto.adicionaNoComeco(evento);
				System.out.print("Evento inserido com sucesso");

			} catch (Exception e) {
				System.out.print("Erro ao inserir Evento");
			}

			break;
		case 2:

			String idOP = view.readLine("Digite o Id do evento para alterar");

			try {
				// METODO ALTERAR
			} catch (Exception e) {
				System.out.print("Erro");
			}

			break;
		case 3:

			String idExluirOP = view
					.readLine("Digite o Id do Evento para excluir");

			try {
				// METODO EXCLUIR
			} catch (Exception e) {
				System.out.print("Erro");
			}

			break;
		default:
			System.out.println("Esta nao é uma opcao valida!");
		}

	}

}
