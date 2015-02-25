package com.cafeto.mockingexcercise;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import com.cafeto.mockingexercise.IPrintingService;
import com.cafeto.mockingexercise.Invoice;
import com.cafeto.mockingexercise.InvoiceDAO;
import com.cafeto.mockingexercise.InvoiceManager;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

/**
 * Test class for the class InvoiceManager.
 * @author Oliver Idárraga.
 */
public class InvoiceManagerTest
{
    private IPrintingService printingService;
    private InvoiceDAO invoiceDAO;
    private InvoiceManager testingInstance;
    private Invoice invoice;
    
    @Before
    public void setup()
    {
        invoiceDAO = mock(InvoiceDAO.class);
        printingService = mock(IPrintingService.class);
        testingInstance = new InvoiceManager(printingService, invoiceDAO);
        invoice = new Invoice("Client", new Long("123"), "detail", 10.0, 100.0);
    }
    
    // tests for the constructor.
    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullPrintingService()
    {
        testingInstance = new InvoiceManager(null, invoiceDAO);
    }
    
    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullInvoiceDAO()
    {
        testingInstance = new InvoiceManager(printingService, null);
    }

    // tests for printInvoice
    @Test(expected = NullPointerException.class)
    public void testPrintInvoiceWithNullInvoice()
    {
        testingInstance.printInvoice(null);
    }

    @Test
    public void testInvoiceIsSentToPrintingServiceOnce()
    {
        testingInstance.printInvoice(invoice);
        verify(printingService, times(1)).queue(invoice);
    }

    @Test
    public void testRightInvoiceIsSent()
    {
        ArgumentCaptor<Invoice> captor = ArgumentCaptor.forClass(Invoice.class);
        
        testingInstance.printInvoice(invoice);
        
        verify(printingService).queue(captor.capture());
        assertEquals(invoice, captor.getValue());
    }
    
    // tests for cancelInvoice
    @Test(expected = NullPointerException.class)
    public void testCancelInvoiceWithNullId()
    {
        Long num = null;
        testingInstance.retrieveInvoice(num);
    }
    
    @Test
    public void testCancelInvoiceIsExecuted()
    {
        when(printingService.queue(invoice)).thenReturn(123);
        when(printingService.cancel(123)).thenReturn(true);
        printingService.cancel(123);
        
        verify(printingService).cancel(123);
    }
}
