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
    public void on() {
    }
    public void off() {
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
}
