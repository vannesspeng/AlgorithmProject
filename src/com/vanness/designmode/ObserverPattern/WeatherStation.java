package com.vanness.designmode.ObserverPattern;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        //主题对象变化，则会通知已经注册的观察者
        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
