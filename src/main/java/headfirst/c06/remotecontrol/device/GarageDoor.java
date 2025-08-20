package headfirst.c06.remotecontrol.device;

/**
 * @author Wusd
 * @date 2025/8/20
 * @description
 */
public class GarageDoor {
    boolean open;
    String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void open() {
        open = true;
        state();
    }

    public void close() {
        open = false;
        state();
    }
    public void up() {
        System.out.println("GarageDoor up");
    }

    public void down() {
        System.out.println("GarageDoor down");
    }

    public void state() {
        System.out.println("GarageDoor state: " + (open ? "open" : "close"));
    }
}
