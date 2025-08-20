package headfirst.c06.simplecontrol.command;

import headfirst.c06.simplecontrol.device.Light;

/**
 * @author Wusd
 * @date 2025/8/20
 * @description
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.on();
    }
}
