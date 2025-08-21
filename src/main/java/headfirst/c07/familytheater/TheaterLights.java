package headfirst.c07.familytheater;

/**
 * @author Wusd
 * @date 2025/8/21
 * @description
 */
public class TheaterLights {
    public void on() {
        System.out.println("Theater Ceiling Lights on");
    }
    public void off() {
        System.out.println("Theater Ceiling Lights off");
    }
    public void dim(int level) {
        System.out.println("Theater Ceiling Lights dimming to " + level + "%");
    }
    public String toString() {
        return "Theater Ceiling Lights";
    }
}
