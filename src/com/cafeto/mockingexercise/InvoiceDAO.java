package com.cafeto.mockingexercise;

import java.util.ArrayList;
import java.util.List;

/**
 * Data Access Object for the Invoice entity.
 * @author Oliver Idárraga
 */
public class InvoiceDAO
{
    /**
     * Return the invoice identified by the given number* 
     * @param invoiceNumber number that identifies the invoice.
     * @return the invoice object.
     */
    public Invoice getInvoiceByNumber(Long invoiceNumber)
    {
        return new Invoice();
    }

    /**
     * Return all the invoices.
     * @return List containing all the invoices.
     */
    public List<Invoice> getAll()
    {
        return new ArrayList<Invoice>();
    }

    /**
     * Saves the given invoice.
     * @param invoice the invoice to be saved.
     */
    public void save(Invoice invoice)
    {
        return;
    }

    /**
     * Deletes the invoice.
     * @param invoice the invoice to be deleted.
     */
    public void delete(Invoice invoice)
    {
        return;
    }
}
