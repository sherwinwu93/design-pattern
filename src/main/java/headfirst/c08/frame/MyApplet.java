package headfirst.c08.frame;

import java.applet.Applet;

/**
 * @author Wusd
 * @date 2025/8/26
 * @description
 */
public class MyApplet extends Applet {
    String message;
    public void init() {
        message = "Hello World, I'm alive!";
        repaint();
    }
    public void start() {
        message = "Now I'm starting up...";
        repaint();
    }
    public void stop() {
        message = "Oh, I'm being stopped";
        repaint();
    }
    public void destroy() {
        System.out.println("Goodbye, cruel world!");
    }
}
