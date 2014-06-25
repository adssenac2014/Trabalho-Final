package com.senac.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import com.senac.estruturasDados.Celula;

public class CelulaTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testCriarCelula() {

		// preparando ambiente
		Celula<String> celula1 = new Celula<String>("1");
		Celula<String> celula2 = new Celula<String>("2");
		Celula<String> celula3 = new Celula<String>("3");
		

		// Executando operações

		celula1.setAnterior(null);
		celula1.setProxima(celula2);

		celula2.setAnterior(celula1);
		celula2.setProxima(celula3);

		celula3.setAnterior(celula2);
		celula3.setProxima(null);

		// avaliando resultados

		// celula 1
		assertEquals(null, celula1.getAnterior());
		assertEquals(celula2, celula1.getProxima());

		// celula 2
		assertEquals(celula1, celula2.getAnterior());
		assertEquals(celula3, celula2.getProxima());

		// celula 3
		assertEquals(celula2, celula3.getAnterior());
		assertEquals(null, celula3.getProxima());

		// imprimir
		
		assertEquals("1", celula1.getElemento());
		assertEquals("2", celula2.getElemento());
		assertEquals("3", celula3.getElemento());
	}

}
