package com.kp.solid.srp.wrong;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Invoice {

    private Marker marker;
    private int quantity;

    public int calculateTotal(){
        return this.marker.getPrice() * this.quantity;
    }
    public void printInvoice(){
        //printing implementation
    }
    public void saveToDb(){
        //save to db
    }

}
