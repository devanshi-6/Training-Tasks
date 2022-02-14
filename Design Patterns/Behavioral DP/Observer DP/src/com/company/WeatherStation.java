package com.company;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    private int pressure;
    private int temp;
    private int humidity;
    private List<Observer> observerList;

    public WeatherStation(){
        this.observerList = new ArrayList<>();
    }



    @Override
    public void addObserver(Observer o) {
        this.observerList.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        this.observerList.remove(o);
    }

    @Override
    public void notifyAllObserver() {
        for(Observer o : this.observerList)
            o.update(pressure,temp,humidity);

    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyAllObserver();
    }

    public void setTemp(int temp) {
        this.temp = temp;
        notifyAllObserver();
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyAllObserver();
    }
}
