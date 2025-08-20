package headfirst.c06.remotecontrol.device;

/**
 * @author Wusd
 * @date 2025/8/20
 * @description
 */
public class Stereo {
    boolean on;
    String cd;
    String dvd;
    String radio;
    int volume;
    String location;
    public Stereo() {

    }
    public Stereo(String location) {
        this.location = location;
    }
    public void on() {
        on = true;
    }
    public void off() {
        on = false;
    }
    public void setCD(String cd) {
        this.cd = cd;
    }
    public void setDVD(String dvd) {
        this.dvd = dvd;
    }
    public void setRadio(String radio) {
        this.radio = radio;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void state() {
        if (on) {
            System.out.print(location + " Stereo is on:");
            System.out.println(cd + " " + dvd + " " + radio);
        } else {
            System.out.println(location + " Stereo is off");
        }
    }
}
