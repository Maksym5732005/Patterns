package observer;

import observer.objects.CurrentConditionsDisplay;
import observer.objects.ForecastDiaplay;
import observer.observable.WeatherData;

import java.text.Collator;

public class MainOfObserver {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        new CurrentConditionsDisplay(weatherData);
        new ForecastDiaplay(weatherData);
        weatherData.setMeasurements(80,80,80);
        weatherData.setMeasurements(10,11,12);
    }
}
