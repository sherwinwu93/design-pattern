package headfirst.c02.builtin;

import java.util.Observable;

/**
 * @author Wusd
 * @date 2025/8/15
 * @description
 */
// 1. java.util.Observable是一个类,如果有其他的类想继承,就会很困难
// 2. setChanged()被保护起来,无法把Observable当作属性变量去使用,只有继承才可以使用
// 3. 因为这2点,所以自己写观察者模式
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
