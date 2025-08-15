package headfirst.c02.builtin;

import java.util.Observable;

/**
 * @author Wusd
 * @date 2025/8/15
 * @description
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {

    }
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    // 这些方法,供观察者拉取数据
    public float getTemperature() {
        return temperature;
    }
    public float getHumidity() {
        return humidity;
    }
    public float getPressure() {
        return pressure;
    }
}
