package com.cafeto.mockingexcercise;

import com.cafeto.mockingexercise.IPrintingService;
import com.cafeto.mockingexercise.Invoice;
import com.cafeto.mockingexercise.InvoiceDAO;
import com.cafeto.mockingexercise.InvoiceManager;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by oidarraga on 24/02/2015.
 */
public class InvoiceManagerTest {
    
    InvoiceDAO invoiceDAO;
    IPrintingService printingService;
    InvoiceManager manager;
    Invoice invoice;
    
    @Before
    public void init() {
        invoiceDAO = mock(InvoiceDAO.class);
        printingService = mock(IPrintingService.class);
        manager = new InvoiceManager(printingService, invoiceDAO);
        invoice = new Invoice("Client", new Long("123"), "detail", 10.0, 100.0);
    }

    /**
     * This test verifies if the invoice is sent to the server only once. *
     */
    @Test
    public void testInvoiceIsSentToPrintingServiceOnce(){
        manager.printInvoice(invoice);
        verify(printingService, times(1)).queue(invoice);
    }

    /**
     * This test verifies that the invoice sent to the server is the one configured in the test class. *
     */
    @Test
    public void rightInvoiceIsSent() {
        ArgumentCaptor<Invoice> captor = ArgumentCaptor.forClass(Invoice.class);
        
        manager.printInvoice(invoice);
        
        verify(printingService).queue(captor.capture());
        assertEquals(invoice, captor.getValue());
    }
}
