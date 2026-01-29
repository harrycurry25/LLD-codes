package com.conceptcoding.solid.openclosed.solution;

import com.conceptcoding.solid.singleresponsibilty.solution.Invoice;


public class DatabaseInvoiceDao implements InvoiceDao{

    Invoice invoice;


    public DatabaseInvoiceDao(Invoice invoice)
    {
        // set the invoice
        this.invoice = invoice;
    }


    @Override
    public void save() {
        // Save into the file the invoice
        System.out.println("Saving to file...");
    }


}
