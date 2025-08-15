package headfirst.c02.right;

/**
 * @author Wusd
 * @date 2025/8/15
 * @description
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    // 构造器需要weatherData对象,作为注册使用
    public CurrentConditionDisplay(Subject weatherData) {
        // 保存subject的引用,以便后续删除注册
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
