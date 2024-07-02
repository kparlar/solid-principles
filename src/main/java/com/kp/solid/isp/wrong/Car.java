package com.kp.solid.isp.wrong;

import sun.jvm.hotspot.utilities.AssertionFailure;

public class Car implements Vehicle{
    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() {

    }

    @Override
    public void drive() {

    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Car could not fly");
    }
}
