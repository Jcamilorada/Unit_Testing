package com.cafeto.mockingtest;

import org.junit.Test;
import org.mockito.ArgumentCaptor;

import com.cafeto.mockingexample.IReportFileEncoder;
import com.cafeto.mockingexample.ReportGenerator;
import com.cafeto.mockingexample.Report;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ReportGeneratorTest {
	
	private Report reporte;

	public void init() {
		reporte = new Report("Titulo", "contenido del reporte");
	}

    /**
     * This test is made for testing the correct method is being called at least once an the other methods are never
     * called. Verifications are made using linguistic named methods.
     */
	@Test
	public void guardarReporteJsonTest() {
		ReportGenerator generador;
		IReportFileEncoder codificador;
		
		codificador = mock(IReportFileEncoder.class);

		generador = new ReportGenerator(codificador);
		
		generador.guardarJson(reporte);

		verify(codificador, atLeastOnce()).generarReporteJson(reporte);
		verify(codificador, never()).generarReporteXML(reporte);
		verify(codificador, never()).generarReporteExcel(reporte);
	}

    /**
     * This test is made for testing the correct method is being called at least once an the other methods are never
     * called. Verifications are made using linguistic named methods.
     */
	@Test
	public void guardarReporteXMLTest() {
        ReportGenerator generador;
        IReportFileEncoder codificador;

        codificador = mock(IReportFileEncoder.class);
        generador = new ReportGenerator(codificador);

		generador.guardarXML(reporte);

		verify(codificador, never()).generarReporteJson(reporte);
		verify(codificador, atLeastOnce()).generarReporteXML(reporte);
		verify(codificador, never()).generarReporteExcel(reporte);
	}

    /**
     * This test is made for testing the correct method is being called an exact number of times
     * Verifications are made using exact number of times and using different ways to do the same verification.
     */
	@Test
	public void guardarReporteExcel() {
        ReportGenerator generador;
        IReportFileEncoder codificador;

        codificador = mock(IReportFileEncoder.class);
        generador = new ReportGenerator(codificador);

		generador.guardarExcel(reporte);

		verify(codificador, times(0)).generarReporteJson(reporte);
		verify(codificador, never()).generarReporteXML(reporte);
		verify(codificador).generarReporteExcel(reporte);
	}

    /**
     * This test is made for verifying the methods are being called using the appropriate arguments.
     * and then making some assertions on the objects passed to the method we're testing.
     */
	@Test
	public void argumentCaptorsTest() {
        ReportGenerator generador;
        IReportFileEncoder codificador;

		codificador = mock(IReportFileEncoder.class);

		ArgumentCaptor<Report> captor = ArgumentCaptor.forClass(Report.class);

		generador = new ReportGenerator(codificador);

		generador.guardarExcel(reporte);

		verify(codificador).generarReporteExcel(captor.capture());
		assertEquals("Titulo", captor.getValue().getTitulo());
//		assertNotEquals("Titulo", captor.getValue().getTitulo());
	}

}
