package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        WeatherStation station = new WeatherStation();
        WeatherObserver observer = new WeatherObserver(station);

        station.setTemp(30);
        station.setHumidity(98);
        station.setPressure(200);


    }
}
