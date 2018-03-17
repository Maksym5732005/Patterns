package observer.objects;

public abstract class Meteo implements DisplayElement{
    private float mTemperature;
    private float mHumidity;
    private float mPressure;

    @Override
    public void display() {
        System.out.print(getClass().getSimpleName()+ ":");
        System.out.print(" temp " + getTemperature());
        System.out.print(" pressure " + getPressure());
        System.out.println(" humidity " + getHumidity());
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
}
