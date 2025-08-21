package headfirst.c07.familytheater;

/**
 * @author Wusd
 * @date 2025/8/21
 * @description
 */
public class DvdPlayer {
    Amplifier amplifier;

    public DvdPlayer(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println("DvdPlayer on");
    }

    public void off() {
        System.out.println("DvdPlayer off");
    }

    public void eject() {
        System.out.println("DvdPlayer eject");
    }

    public void pause() {
        System.out.println("DvdPlayer pause");
    }

    public void play(String movie) {
        System.out.println("DvdPlayer play");
    }

    public void setSurroundAudio() {
        System.out.println("DvdPlayer setSurroundAudio");
    }

    public void setTwoChannelAudio() {
        System.out.println("DvdPlayer setTwoChannelAudio");
    }

    public void stop() {
        System.out.println("DvdPlayer stop");
    }
}
