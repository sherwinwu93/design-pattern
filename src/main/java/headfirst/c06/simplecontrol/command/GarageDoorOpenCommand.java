package headfirst.c06.simplecontrol.command;

import headfirst.c06.simplecontrol.device.GarageDoor;

/**
 * @author Wusd
 * @date 2025/8/20
 * @description
 */
public class GarageDoorOpenCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.open();
    }
}
