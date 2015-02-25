package com.cafeto.mockingexercise;

import lombok.Getter;
import lombok.Setter;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * This class provides utilities for creation retrieving an print request for an invoice.
 * @author Oliver Idárraga.
 */
public class InvoiceManager
{
    private IPrintingService printingService;
    private InvoiceDAO invoiceDAO;
    @Getter
    @Setter
    private int lastInvoiceId;

    /**
     * Class constructor. Required dependencies.
     * @param printingService The printing service to be used for printing the invoices.
     * @param invoiceDAO database access object for managing database operations for Invoices.
     */
    public InvoiceManager(IPrintingService printingService, InvoiceDAO invoiceDAO)
    {
        checkNotNull(printingService);
        checkNotNull(invoiceDAO);
        this.printingService = printingService;
        this.invoiceDAO = invoiceDAO;
    }

    /**
     * Creates a new invoice object fully configured.
     *
     * @param client Client name to use in the invoice.
     * @param detail The detailed text to use in the invoice.
     * @param number Identifier of the invoice.
     * @param tax Value of the taxes applied to this invoice.
     * @param total Total value of the invoice.
     *
     * @return
     */
    public Invoice createInvoice(String client, String detail, Long number, Double tax, Double total)
    {
        Invoice invoice;
        invoice = new Invoice(client, number, detail, tax, total);
        invoiceDAO.save(invoice);
        return invoice;
    }

    /**
     * Saves the received invoice to the database.
     * @param invoice The invoice object to save to the database.
     */
    public void saveInvoice(Invoice invoice)
    {
        checkNotNull(invoice);
        invoiceDAO.save(invoice);
    }

    /**
     * Sends the received invoice to the printing server. * 
     * @param invoice The invoice to be printed.
     */
    public void printInvoice(Invoice invoice)
    {
        checkNotNull(invoice);
        lastInvoiceId = printingService.queue(invoice);
    }

    /**
     * Retrieves from the database de invoice with the given number.
     * @param invoiceNumber the id of the invoice to retrieve.
     * @return the Invoice object identified by the given id.
     */
    public Invoice retrieveInvoice(long invoiceNumber)
    {
        checkNotNull(invoiceNumber);
        Invoice invoice = invoiceDAO.getInvoiceByNumber(invoiceNumber);
        return invoice;
    }

    /**
     * Sends a request for cancel a queue print order.
     * @param id the id for the printing request to be canceled.
     */
    public void cancelInvoicePrint(int id)
    {
        checkNotNull(id);
        printingService.cancel(id);
    }
}
