package headfirst.c06.simplecontrol.device;

/**
 * @author Wusd
 * @date 2025/8/20
 * @description
 */
public class Light {
    boolean on;
    public void on() {
        on = true;
        state();
    }
    public void state() {
        if (on) System.out.println("Light is on");
        else System.out.println("Light is off");
    }
}
