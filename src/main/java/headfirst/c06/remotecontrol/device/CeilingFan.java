package headfirst.c06.remotecontrol.device;

/**
 * @author Wusd
 * @date 2025/8/20
 * @description
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
    }

    public void medium() {
        speed = MEDIUM;
    }
    public void low() {
        speed = LOW;
    }
    public void off() {
        speed = OFF;
    }
    public void on() {
        medium();
    }
    public int getSpeed() {
        return speed;
    }
}
