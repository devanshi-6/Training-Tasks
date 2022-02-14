package com.company;

public class WeatherObserver implements Observer{

    private int pressure;
    private int temp;
    private int humidity;
    private Subject subject;

    public WeatherObserver(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }


    @Override
    public void update(int pressure, int temp, int humidity) {
        this.pressure = pressure;
        this.temp = temp;
        this.humidity = humidity;

        showData();
    }

    private void showData() {
        System.out.println("Pressure : " + this.pressure + " Temprature : " + this.temp + " Humidity : "+ this.humidity);
    }
}
