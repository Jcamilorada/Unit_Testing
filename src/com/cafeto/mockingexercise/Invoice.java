package com.cafeto.mockingexercise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by oidarraga on 24/02/2015.
 */
@AllArgsConstructor @NoArgsConstructor
public class Invoice {
    /**
     * Client name*
     * @param new client name value.*
     * @return the client name.*
     */
    @Getter @Setter String client;
    /**
     * Invoice number *
     * @param new value for invoice number. *
     * @return the current number of the invoice. *
     */
    @Getter @Setter Long invoiceNumber;
    /**
     * Client Additional details included in the invoice *
     * @param new value for the details.*
     * @return the current value for the details.*
     */
    @Getter @Setter String invoiceDetail;
    /**
     * Client The value of the taxes charged in the invoice *
     * @param new value for the total charged taxes.*
     * @return The value of the current taxes.*
     */
    @Getter @Setter Double tax;
    /**
     * Client The total due *
     * @param new value for invoice total due.*
     * @return the current total due of the invoice.*
     */
    @Getter @Setter Double total;
}
