package com.kp.solid.ocp.correct;

import com.kp.solid.srp.correct.Invoice;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DatabaseInvoiceDao implements InvoiceDao{
    private Invoice invoice;

    @Override
    public void save() {
        //save to db
    }
}
