package headfirst.c07.familytheater;

/**
 * @author Wusd
 * @date 2025/8/21
 * @description
 */
public class Tuner {
    Amplifier amplifier;
    public Tuner(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println("Tuner on");
    }
    public void off() {
        System.out.println("Tuner off");
    }
    public void setAm() {
        System.out.println("Tuner set AM");
    }
    public void setFm() {
        System.out.println("Tuner set FM");
    }
    public void setFrequency() {
        System.out.println("Tuner set frequency");
    }
    public String toString() {
        return "Tuner";
    }
}
