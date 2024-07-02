package com.kp.solid.lsp.correct;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public class Bicycle implements Bike{
    int speed;

    @Override
    public int accelerate() {
        return this.speed+5;
    }

    @Override
    public void turnOnEngine() {
        throw new AssertionError("There is no Engine");
    }
}
