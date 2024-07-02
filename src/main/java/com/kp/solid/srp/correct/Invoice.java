package com.kp.solid.srp.correct;

import com.kp.solid.srp.wrong.Marker;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Invoice {
    private Marker marker;
    private int quantity;

    public int calculateTotal(){
        return this.marker.getPrice() * this.quantity;
    }
}
