package headfirst.c07.familytheater;

/**
 * @author Wusd
 * @date 2025/8/21
 * @description
 */
public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner(amp);
        DvdPlayer dvdPlayer = new DvdPlayer(amp);
        CdPlayer cdPlayer = new CdPlayer();
        Projector projector = new Projector();
        TheaterLights theaterLights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popcornPopper = new PopcornPopper();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvdPlayer, cdPlayer, projector,
                theaterLights, screen, popcornPopper);
        homeTheater.watchMovie("The Matrix");
        homeTheater.endMovie();
    }
}
