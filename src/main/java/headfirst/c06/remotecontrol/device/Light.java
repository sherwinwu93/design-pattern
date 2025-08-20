package headfirst.c06.remotecontrol.device;

/**
 * @author Wusd
 * @date 2025/8/20
 * @description
 */
public class Light {
    boolean on;
    String location;

    public Light(String location) {
        on = false;
        this.location = location;
    }

    public void on() {
        on = true;
        state();
    }

    public void off() {
        on = false;
        state();
    }

    public void state() {
        if (on) System.out.println(location + " Light is on");
        else System.out.println(location + " Light is off");
    }
}
