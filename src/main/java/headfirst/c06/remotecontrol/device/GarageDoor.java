package headfirst.c06.remotecontrol.device;

/**
 * @author Wusd
 * @date 2025/8/20
 * @description
 */
public class GarageDoor {
    boolean open;
    public void open() {
        open = true;
        state();
    }
    public void close() {
        open = false;
        state();
    }
    public void state() {
        System.out.println("GarageDoor state: " + (open ? "open" : "close"));
    }
}
