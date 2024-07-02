package com.kp.solid.dip.correct;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class WeatherTracker {
    private String weatherCondition;
    private Notifier notifier;

    public void setCurrentConditions(String weatherCondition){
        this.weatherCondition = weatherCondition;
        if(weatherCondition.equals("rainy")){
            this.notifier.alertWeatherCondition(weatherCondition);
        }
    }

}
