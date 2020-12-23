package me.spoofer.observer;

public class ObserverPatternTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80.1f, 100.2f, 30.4f);
    }
}
