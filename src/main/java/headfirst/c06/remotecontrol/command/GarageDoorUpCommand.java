package headfirst.c06.remotecontrol.command;

import headfirst.c06.remotecontrol.device.GarageDoor;

/**
 * @author Wusd
 * @date 2025/8/20
 * @description
 */
public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;
    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
