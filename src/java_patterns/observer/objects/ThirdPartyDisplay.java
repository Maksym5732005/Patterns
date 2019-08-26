package java_patterns.observer.objects;

import java_patterns.observer.observable.Observable;
import java_patterns.observer.observable.WeatherData;

public class ThirdPartyDisplay extends Meteo
        implements DisplayElement, Observer {

    public ThirdPartyDisplay(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            setTemperature(weatherData.getTemperature());
            setHumidity(weatherData.getHumidity());
            setPressure(weatherData.getPressure());
            display();
        }
    }
}
