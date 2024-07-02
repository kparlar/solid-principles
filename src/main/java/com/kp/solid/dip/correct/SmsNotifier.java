package com.kp.solid.dip.correct;

public class SmsNotifier implements Notifier{
    @Override
    public void alertWeatherCondition(String message) {
        System.out.println(String.format("Sending SMS: %s", message));
    }
}
