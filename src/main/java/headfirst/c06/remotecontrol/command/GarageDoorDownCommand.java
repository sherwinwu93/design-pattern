package headfirst.c06.remotecontrol.command;

import headfirst.c06.remotecontrol.device.GarageDoor;

/**
 * @author Wusd
 * @date 2025/8/20
 * @description
 */
public class GarageDoorDownCommand implements Command {
    GarageDoor garageDoor;
    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
