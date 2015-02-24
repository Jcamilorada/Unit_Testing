package com.cafeto.mockingexercise;

/**
 * Created by oidarraga on 24/02/2015.
 */
public class InvoiceManager {
    
    private IPrintingService printingService;
    private InvoiceDAO invoiceDAO;

    /**
     * *
     * @param printingService
     * @param invoiceDAO
     */
    public InvoiceManager(IPrintingService printingService, InvoiceDAO invoiceDAO) {
        this.printingService = printingService;
        this.invoiceDAO = invoiceDAO;
    }
    
    public Invoice createInvoice(String client, String detail, Long number, Double tax, Double total) {
        Invoice invoice;
        invoice = new Invoice(client, number, detail, tax, total);
        invoiceDAO.save(invoice);
        return invoice;
    }
    
    public void saveInvoice(Invoice invoice) {
        invoiceDAO.save(invoice);
    }
    
    public void printInvoice(Invoice invoice) {
        printingService.queue(invoice);
    }
    
    public Invoice retrieveInvoice(long invoiceNumber) {
        Invoice invoice = invoiceDAO.getInvoiceByNumber(invoiceNumber);
        return invoice;
    }
}
