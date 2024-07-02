package com.kp.solid.dip.correct;

public class MailNotifier implements Notifier{


    @Override
    public void alertWeatherCondition(String message) {
        System.out.print(String.format("Sending mail: %s", message));
    }
}
