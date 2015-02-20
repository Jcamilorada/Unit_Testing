package com.cafeto.mockingtest;

import org.junit.Test;

import com.cafeto.mockingexample.CodificadorArchivoReporte;
import com.cafeto.mockingexample.GeneradorReporte;
import com.cafeto.mockingexample.Reporte;

import static org.mockito.Mockito.*;

public class GeneradorReporteTest {
	
	private Reporte reporte;
	
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
		
		//execute
		generador.guardarJson(reporte);
		
		// some verifications
		verify(codificador, atLeastOnce()).generarReporteJson(reporte);
		verify(codificador, atLeastOnce()).generarReporteXML(reporte);
		verify(codificador, never()).generarReporteExcel(reporte);
	}
	
	@Test
	public void guardarReporteXMLTest() {
		GeneradorReporte generador;
		CodificadorArchivoReporte codificador;
		
		// mock the object
		codificador = mock(CodificadorArchivoReporte.class);
		// create new object with its mocked dependencies
		generador = new GeneradorReporte(codificador);
		
		//execute
		generador.guardarXML(reporte);
		
		// some verifications
		verify(codificador, never()).generarReporteJson(reporte);
		verify(codificador, atLeastOnce()).generarReporteXML(reporte);
		verify(codificador, never()).generarReporteExcel(reporte);
	}
	
	@Test
	public void guardarReporteExcel() {
		GeneradorReporte generador;
		CodificadorArchivoReporte codificador;
		
		// mock the object
		codificador = mock(CodificadorArchivoReporte.class);
		// create new object with its mocked dependencies
		generador = new GeneradorReporte(codificador);
		
		//execute
		generador.guardarExcel(reporte);
		
		// some verifications
		verify(codificador, never()).generarReporteJson(reporte);
		verify(codificador, never()).generarReporteXML(reporte);
		verify(codificador, atLeastOnce()).generarReporteExcel(reporte);
	}

}
