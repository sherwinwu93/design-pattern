package headfirst.c06.remotecontrol.command;

import headfirst.c06.remotecontrol.device.Light;

/**
 * @author Wusd
 * @date 2025/8/20
 * @description
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
