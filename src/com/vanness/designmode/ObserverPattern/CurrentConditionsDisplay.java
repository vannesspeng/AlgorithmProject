package com.vanness.designmode.ObserverPattern;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    //持有一个WeatherData主题的引用，方便订阅和取消订阅主题
    private WeatherData weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        //观察者要注册到主题对象中
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("目前状况：温度" + temperature + "摄氏度 ;" + "湿度" + humidity + "");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
