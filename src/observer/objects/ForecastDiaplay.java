package observer.objects;

import observer.observable.Observable;
import observer.observable.WeatherData;

public class ForecastDiaplay extends Meteo
        implements DisplayElement, Observer {

    public ForecastDiaplay(Observable o) {
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
