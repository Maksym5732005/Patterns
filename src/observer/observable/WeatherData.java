package observer.observable;


import observer.objects.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherData implements Observable {
    private Set<Observer> mObservers;
    private float mTemperature;
    private float mHumidity;
    private float mPressure;
    private boolean mChanged;

    public WeatherData() {
        this(0, 0, 0);
    }

    public WeatherData(float temperature, float humidity, float pressure) {
        mObservers = new HashSet<>();
        mTemperature = temperature;
        mHumidity = humidity;
        mPressure = pressure;
    }

    @Override
    public void addObserver(Observer o) {
        mObservers.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        if (mObservers.contains(o)) {
            mObservers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        if (mChanged) {
            for (Observer o : mObservers) {
                o.update(this);
            }
            mChanged = false;
        }
    }

    @Override
    public void setChanged() {
        mChanged = true;
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public float getTemperature() {
        return mTemperature;
    }

    public void setTemperature(float temperature) {
        mTemperature = temperature;
    }

    public float getHumidity() {
        return mHumidity;
    }

    public void setHumidity(float humidity) {
        mHumidity = humidity;
    }

    public float getPressure() {
        return mPressure;
    }

    public void setPressure(float pressure) {
        mPressure = pressure;
    }

    public void setMeasurements(float temperature, float pressure, float humidity) {
        mTemperature = temperature;
        mHumidity = humidity;
        mPressure = pressure;
        measurementsChanged();
    }
}
