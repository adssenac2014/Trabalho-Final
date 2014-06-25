package com.senac.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Test;

import com.senac.data.UsuarioDataLista;
import com.senac.estruturasDados.ListaLigada;
import com.senac.model.Usuario;

public class UsuarioDataListaTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() throws IOException {

		
		UsuarioDataLista usuarioDataLista = new UsuarioDataLista();

		ListaLigada<Usuario> usuarioLista = usuarioDataLista.lerCsv();

		usuarioDataLista.salvarCsv(usuarioLista);

	}

}
