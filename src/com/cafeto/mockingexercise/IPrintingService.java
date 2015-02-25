package com.cafeto.mockingexercise;

/**
 * This interface shows the required methods that should be implemented to serve de invoice printing service.
 * @author Oliver Idárraga
 */
public interface IPrintingService
{
    /**
     * Includes a new invoice in the printing queue.* 
     * @param invoice the invoice to be queue.
     * @return the id of the new invoice in the queue.
     */
    public int queue(Invoice invoice);

    /**
     * Removes the invoice identified by the id if it in the queue*
     * @param id id of the invoice.
     */
    public boolean cancel(int id);
}
