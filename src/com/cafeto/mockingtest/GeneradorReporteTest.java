package com.cafeto.mockingtest;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import com.cafeto.mockingexample.CodificadorArchivoReporte;
import com.cafeto.mockingexample.CodificadorArchivoReporteImpl;
import com.cafeto.mockingexample.GeneradorReporte;
import com.cafeto.mockingexample.Reporte;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneradorReporteTest {
	
	private Reporte reporte;
	
	@Before
	public void init() {
		reporte = new Reporte("Titulo", "contenido del reporte");
	}
	
	@Test
	public void guardarReporteJsonTest() {
		GeneradorReporte generador;
		CodificadorArchivoReporte codificador;
		
		// mock the object
		codificador = mock(CodificadorArchivoReporte.class);
		// create new object with its mocked dependencies
		generador = new GeneradorReporte(codificador);
		
		//invoke method
		generador.guardarJson(reporte);
		
		// verify the json encoder has been invoked but not any other
		verify(codificador, atLeastOnce()).generarReporteJson(reporte);
		verify(codificador, never()).generarReporteXML(reporte);
		verify(codificador, never()).generarReporteExcel(reporte);
	}
	
	@Test
	public void guardarReporteXMLTest() {
		GeneradorReporte generador;
		CodificadorArchivoReporte codificador;
		
		// mock the object. It can be an interface
		codificador = mock(CodificadorArchivoReporte.class);
		// create new object with its mocked dependencies
		generador = new GeneradorReporte(codificador);
		
		//invoke method
		generador.guardarXML(reporte);
		
		// verify the XML encoder has been invoked but not any other
		verify(codificador, never()).generarReporteJson(reporte);
		verify(codificador, atLeastOnce()).generarReporteXML(reporte);
		verify(codificador, never()).generarReporteExcel(reporte);
	}
	
	@Test
	public void guardarReporteExcel() {
		GeneradorReporte generador;
		CodificadorArchivoReporteImpl codificador;
		
		// mock the object. It can be a concrete class too
		codificador = mock(CodificadorArchivoReporteImpl.class);
		// create new object with its mocked dependencies
		generador = new GeneradorReporte(codificador);
		
		//invoke method
		generador.guardarExcel(reporte);
		
		// you can specify exactly how many times a method should be invoked
		// exactly 0 or never is the same
		verify(codificador, times(0)).generarReporteJson(reporte);
		verify(codificador, never()).generarReporteXML(reporte);
		// exactly once can be omitted
		verify(codificador).generarReporteExcel(reporte);
	}
	
	@Test
	public void argumentCaptorsTest() {
		
		// sometimes we want to make some assertions on the objects passed to the mock
		GeneradorReporte generador;
		CodificadorArchivoReporte codificador;
		
		// mock the object
		codificador = mock(CodificadorArchivoReporte.class);
		
		// create and apply the argument captor
		ArgumentCaptor<Reporte> captor = ArgumentCaptor.forClass(Reporte.class);
		
		// create new object with its mocked dependencies
		generador = new GeneradorReporte(codificador);
		
		//invoke method
		generador.guardarExcel(reporte);
		
		// assert the values must correspond to the actual given values
		verify(codificador).generarReporteExcel(captor.capture());
		assertEquals("Titulo", captor.getValue().getTitulo());
//		assertNotEquals("Titulo", captor.getValue().getTitulo());
	}

}
