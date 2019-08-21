package com.vanness.designmode.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(o);
        }

    }

    @Override
    public void notifyObservers() {
        for(int i=0; i < observers.size(); i++){
            Observer observer = observers.get(i);
            observer.update(this.temp, this.humidity, this.pressure);
        }
    }

    public void measurementChanged(){
        this.notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

}
