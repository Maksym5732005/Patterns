package java_patterns.observer;

import java_patterns.observer.objects.CurrentConditionsDisplay;
import java_patterns.observer.objects.ForecastDiaplay;
import java_patterns.observer.observable.WeatherData;

public class MainOfObserver {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        new CurrentConditionsDisplay(weatherData);
        new ForecastDiaplay(weatherData);
        weatherData.setMeasurements(80,80,80);
        weatherData.setMeasurements(10,11,12);
    }
}
