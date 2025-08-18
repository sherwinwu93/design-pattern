package headfirst.c02.builtin;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    public void display() {
        float avg = (currentPressure + lastPressure) / 2;
        float max = Math.max(currentPressure, lastPressure);
        float min = Math.min(currentPressure, lastPressure);
        System.out.println("Forecast: Pressure Avg:" + avg + " Max:" + max + " Min:" + min);
    }
}
