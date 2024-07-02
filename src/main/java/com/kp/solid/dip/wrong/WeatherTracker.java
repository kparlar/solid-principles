package com.kp.solid.dip.wrong;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class WeatherTracker {
    private String currentConditions;
    private Emailer emailer;

    public void setCurrentConditions(String weatherDescription){
        this.currentConditions = weatherDescription;
        if(weatherDescription.equals("rainy")){
            this.emailer.sendEmail("It is rainy");
        }
    }
}
