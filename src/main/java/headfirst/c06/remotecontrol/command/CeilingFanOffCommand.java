package headfirst.c06.remotecontrol.command;

import headfirst.c06.remotecontrol.device.CeilingFan;

/**
 * @author Wusd
 * @date 2025/8/20
 * @description
 */
public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;
    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    @Override
    public void execute() {
        ceilingFan.off();
    }

    @Override
    public void undo() {
        ceilingFan.on();
    }
}
