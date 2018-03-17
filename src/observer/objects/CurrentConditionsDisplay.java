package observer.objects;

import observer.observable.Observable;
import observer.observable.WeatherData;

public class CurrentConditionsDisplay extends Meteo
        implements DisplayElement, Observer {

    public CurrentConditionsDisplay(Observable observable) {
        observable.addObserver(this);
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
