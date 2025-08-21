package headfirst.c07.familytheater;

/**
 * @author Wusd
 * @date 2025/8/21
 * @description
 */
public class Projector {
    DvdPlayer dvdPlayer;
    public void on() {
        System.out.println("Projector on");
    }
    public void off() {
        System.out.println("Projector off");
    }
    public void tvMode() {
        System.out.println("Projector tvMode");
    }
    public void setInput(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }
    public void wideScreenMode() {
        System.out.println("Projector wideScreenMode");
    }
    public String toString() {
        return "Projector";
    }
}
