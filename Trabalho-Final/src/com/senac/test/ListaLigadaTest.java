package com.senac.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.senac.estruturasDados.ListaLigada;

public class ListaLigadaTest {

	ListaLigada<String> lista = new ListaLigada<String>();

	@Before
	public void iniciar() {

		lista = new ListaLigada<String>();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testAdicionarFimdaListaERetornarOtamanhoDaLista() {

		// preparando ambiente

		// executando operações

		lista.adicionaNoFim("Thiago");
		lista.adicionaNoFim("Jose");
		lista.adicionaNoFim("João");

		// Analisando resultados

		assertEquals("Thiago", lista.pegaPrimeira());

		assertEquals("João", lista.pegaUltima());

		assertEquals(3, lista.tamanho());

	}

	@Test
	public void testarRemoverElementoDoFimERetornarOTamanho() {

		// Preparando ambiente
		lista.adicionaNoFim("1");
		lista.adicionaNoFim("2");
		lista.adicionaNoFim("3");
		lista.adicionaNoFim("4");
		lista.adicionaNoFim("5");
		lista.adicionaNoFim("6");
		lista.adicionaNoFim("7");

		// Executando operações

		assertEquals("7", lista.pegaUltima());
		lista.removeDoFim();

		assertEquals("6", lista.pegaUltima());
		lista.removeDoFim();

		assertEquals("5", lista.pegaUltima());
		lista.removeDoFim();

		assertEquals("4", lista.pegaUltima());
		lista.removeDoFim();

		assertEquals("3", lista.pegaUltima());
		lista.removeDoFim();

		assertEquals("2", lista.pegaUltima());
		lista.removeDoFim();

		assertEquals("1", lista.pegaUltima());
		lista.removeDoFim();

		assertEquals(true, lista.vazia());
		// Analisando resultados

		assertEquals(0, lista.tamanho());

	}

	@Test
	public void testarRemoverNoComecoDaListaERetornarOtamanho() {

		// Preparando ambiente
		lista.adicionaNoFim("1");
		lista.adicionaNoFim("2");
		lista.adicionaNoFim("3");
		lista.adicionaNoFim("4");
		lista.adicionaNoFim("5");
		lista.adicionaNoFim("6");
		lista.adicionaNoFim("7");

		// Executando operações

		assertEquals("1", lista.pegaPrimeira());
		lista.removerDocomeco();
		assertEquals(6, lista.tamanho());

		assertEquals("2", lista.pegaPrimeira());
		lista.removerDocomeco();
		assertEquals(5, lista.tamanho());

		assertEquals("3", lista.pegaPrimeira());
		lista.removerDocomeco();
		assertEquals(4, lista.tamanho());

		assertEquals("4", lista.pegaPrimeira());
		lista.removerDocomeco();
		assertEquals(3, lista.tamanho());

		assertEquals("5", lista.pegaPrimeira());
		lista.removerDocomeco();
		assertEquals(2, lista.tamanho());

		assertEquals("6", lista.pegaPrimeira());
		lista.removerDocomeco();
		assertEquals(1, lista.tamanho());

		assertEquals("7", lista.pegaPrimeira());
		lista.removerDocomeco();
		assertEquals(0, lista.tamanho());

		assertEquals(true, lista.vazia());
		// Analisando resultados

	}

	@Test
	public void testerInserirElementoPeloIndiceETestarOTamanhoDaLista() {

		// Preparando ambiente
		lista.adicionaNoFim("1");
		lista.adicionaNoFim("2");
		lista.adicionaNoFim("3");
		lista.adicionaNoFim("4");
		lista.adicionaNoFim("5");
		lista.adicionaNoFim("6");
		lista.adicionaNoFim("7");

		// executando operações e analizando resultados

		lista.adiciona(0, "A");
		assertEquals("A", lista.pegarElemento(0));

		lista.adiciona(1, "B");
		assertEquals("B", lista.pegarElemento(1));

		lista.adiciona(2, "C");
		assertEquals("C", lista.pegarElemento(2));

		lista.adiciona(3, "D");
		assertEquals("D", lista.pegarElemento(3));

	}

	@Test
	public void testarInserirNocomeço() {
		// Preparando ambinte
		lista.adicionaNoFim("1");
		lista.adicionaNoFim("2");

		// executando operações

		lista.adicionaNoComeco("A");

		// Avaliando resultados

		assertEquals("A", lista.pegaPrimeira());

	}

	@Test
	public void testarPegarElementoPeloIndice() {

		// Preparando ambiente
		lista.adicionaNoFim("1");
		lista.adicionaNoFim("2");
		lista.adicionaNoFim("3");
		lista.adicionaNoFim("4");
		lista.adicionaNoFim("5");
		lista.adicionaNoFim("6");
		lista.adicionaNoFim("7");

		// executando operações e analizando resultados

		assertEquals("1", lista.pegarElemento(0));
		assertEquals("2", lista.pegarElemento(1));
		assertEquals("3", lista.pegarElemento(2));
		assertEquals("4", lista.pegarElemento(3));
		assertEquals("5", lista.pegarElemento(4));
		assertEquals("6", lista.pegarElemento(5));
		assertEquals("7", lista.pegarElemento(6));

	}

	@Test
	public void testarSeContem() {

		// Preparando ambiente
		lista.adicionaNoFim("1");
		lista.adicionaNoFim("2");
		lista.adicionaNoFim("3");
		lista.adicionaNoFim("4");
		lista.adicionaNoFim("5");
		lista.adicionaNoFim("6");
		lista.adicionaNoFim("7");
		lista.adicionaNoFim("THIAGO");

		assertEquals(true, lista.contem("7"));
		assertEquals(true, lista.contem("1"));
		assertEquals(true, lista.contem("2"));
		assertEquals(true, lista.contem("3"));
		assertEquals(true, lista.contem("4"));
		assertEquals(true, lista.contem("5"));
		assertEquals(true, lista.contem("6"));
		assertEquals(false, lista.contem("k"));
		assertEquals(false, lista.contem("thiago"));

	}

	@Test
	public void testarRemoverPeloIndice() {

		// Preparando ambiente
		lista.adicionaNoFim("1");
		lista.adicionaNoFim("2");
		lista.adicionaNoFim("3");
		lista.adicionaNoFim("4");
		lista.adicionaNoFim("5");
		lista.adicionaNoFim("6");
		lista.adicionaNoFim("7");

		// Efetuando operações

		lista.removerIndice(0);
		assertEquals("2", lista.pegaPrimeira());

	}

	@Test
	public void testarPegarTodosObjetos() {

		// Preparando ambiente
		lista.adicionaNoFim("1");
		lista.adicionaNoFim("2");
		lista.adicionaNoFim("3");
		lista.adicionaNoFim("4");
		lista.adicionaNoFim("5");
		lista.adicionaNoFim("6");
		lista.adicionaNoFim("7");

		Object[] vetor = (Object[]) lista.clonar();

		assertEquals("1", vetor[0]);
		assertEquals("2", vetor[1]);

	}

	@Test
	public void testarCriarListaPassandoUmvetorComoParametro() {

		// Preparando ambiente
		Object[] vetor = new Object[100];

		for (int i = 0; i < vetor.length; i++) {

			vetor[i] = i + "teste";
		}

		// Efetuando operações
		ListaLigada<String> listaTeste = new ListaLigada<String>(vetor);

		// Analisando testes

		assertEquals(100, listaTeste.tamanho());
	}

	@Test
	public void testarPOP() {

	}
}
