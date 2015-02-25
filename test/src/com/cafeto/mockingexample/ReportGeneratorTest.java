package com.cafeto.mockingexample;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

/**
 * Unit tests for {@code ReportGenerator}.
 * 
 * @author Oliver
 */
public class ReportGeneratorTest {
	
    /*
    Siempre testear el constructor.
    Testear cada parametro cuando sea nulo individualmente
    nomenclatura de metodos: test+metodo+casoDePrueba
    testear que se lancen las excepciones
    un test por cada excepcion
    
     */
    
	private Report report;
    private ReportGenerator unitInTesting; //testInstance
    IReportFileEncoder encoder; //mockReportFileEncoder

    @Before
	public void init()
    {
		report = new Report("Title", "report content");
	}
    
    public void testConstructorWithNullEncoder()
    {
        
    }

    @Test
    public void testSaveJsonWithNullReport()
    {
        
    }
    
	@Test
	public void testSaveJson()
    {
		
		encoder = mock(IReportFileEncoder.class);

		unitInTesting = new ReportGenerator(encoder);
		
		unitInTesting.saveJson(report);

		verify(encoder, atLeastOnce()).generateReportJson(report);
		verify(encoder, never()).generateReportXML(report);
		verify(encoder, never()).generateReportExcel(report);
	}
    
	@Test
	public void testTheReportIsSavedInXmlFormat() {

        encoder = mock(IReportFileEncoder.class);
        unitInTesting = new ReportGenerator(encoder);

		unitInTesting.saveXML(report);

		verify(encoder, never()).generateReportJson(report);
		verify(encoder, atLeastOnce()).generateReportXML(report);
		verify(encoder, never()).generateReportExcel(report);
	}

	@Test
	public void testTheReportIsSavedInExcelFormat() {
        ReportFileEncoder encoder1 = new ReportFileEncoder();
        ReportFileEncoder spied;

        spied = spy(encoder1);
        unitInTesting = new ReportGenerator(spied);

		unitInTesting.saveExcel(report);

		verify(spied, times(0)).generateReportJson(report);
		verify(spied, never()).generateReportXML(report);
		verify(spied).generateReportExcel(report);
	}

	@Test
	public void testTheRightFileIsSaved() {
		encoder = mock(ReportFileEncoder.class);

		ArgumentCaptor<Report> captor = ArgumentCaptor.forClass(Report.class);

		unitInTesting = new ReportGenerator(encoder);

		unitInTesting.saveExcel(report);

        verify(encoder).generateReportExcel(captor.capture());
        assertEquals("Title", captor.getValue().getTitle());
    }

}
