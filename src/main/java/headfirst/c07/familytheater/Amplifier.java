package headfirst.c07.familytheater;

/**
 * @author Wusd
 * @date 2025/8/21
 * @description
 */
public class Amplifier {
    private final int ORIGINAL_SOUND = 0;
    private final int STEREO_SOUND = 1;
    private final int SURROUND_SOUND = 2;
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;
    int soundType;
    int volume;
    public void on() {
        System.out.println("Amplifier on");
    }
    public void off() {
        System.out.println("Amplifier off");
    }
    public void setCd(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }
    public void setDvd(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }
    public void setStereoSound() {
        soundType = STEREO_SOUND;
    }
    public void setSurroundSound() {
        soundType = SURROUND_SOUND;
    }
    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public String toString() {
        return "Amplifier";
    }
}
