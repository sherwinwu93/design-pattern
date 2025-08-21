package headfirst.c07.familytheater;

/**
 * @author Wusd
 * @date 2025/8/21
 * @description
 */
public class FamilyTheaterDrive {
    public static void main(String[] args) {
        PopcornPopper popper = new PopcornPopper();
        TheaterLights lights = new TheaterLights();
        Projector projector = new Projector();
        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer(amp);
        Screen screen = new Screen();
        String movie = "The Matrix";

        popper.on();
        popper.pop();

        lights.dim(10);

        screen.down();

        projector.on();
        projector.setInput(dvd);
        projector.wideScreenMode();

        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);

        dvd.on();
        dvd.play(movie);
    }
}
