package com.kp.solid.lsp.correct;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Motorbike implements Bike{
    boolean isEngineOn;
    int speed;

    @Override
    public int accelerate() {
        return this.speed+10;
    }

    @Override
    public void turnOnEngine() {
        this.isEngineOn = true;
    }
}
