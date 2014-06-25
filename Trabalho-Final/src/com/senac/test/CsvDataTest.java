package com.senac.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.senac.data.CsvDataPilha;

public class CsvDataTest {

	private CsvDataPilha csv;
	
	
	@Before
	public void iniciar(){
		
		csv = new CsvDataPilha("tabelaTeste");
		
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testSalvarArquivoCsv() {
		
		
		
	}

	@Test
	public void testLerArquivoCsv() {
		
	}

}
