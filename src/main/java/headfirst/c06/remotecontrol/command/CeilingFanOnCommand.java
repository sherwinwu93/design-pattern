package headfirst.c06.remotecontrol.command;

import headfirst.c06.remotecontrol.device.CeilingFan;

/**
 * @author Wusd
 * @date 2025/8/20
 * @description
 */
public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}
