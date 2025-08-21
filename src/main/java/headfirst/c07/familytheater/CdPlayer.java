package headfirst.c07.familytheater;

/**
 * @author Wusd
 * @date 2025/8/21
 * @description
 */
public class CdPlayer {
    Amplifier amplifier;
    public void on() {
        System.out.println("CdPlayer on");
    }
    public void off() {
        System.out.println("CdPlayer off");
    }
    public void eject() {
        System.out.println("CdPlayer eject");
    }
    public void pause() {
        System.out.println("CdPlayer pause");
    }
    public void play() {
        System.out.println("CdPlayer play");
    }
    public void stop() {
        System.out.println("CdPlayer stop");
    }
    public String toString() {
        return "CdPlayer";
    }
}
