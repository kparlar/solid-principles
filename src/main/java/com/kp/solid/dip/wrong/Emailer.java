package com.kp.solid.dip.wrong;

public class Emailer {

    public void sendEmail(String message){
        System.out.println(String.format("Email Sent: %s", message));
    }
}
