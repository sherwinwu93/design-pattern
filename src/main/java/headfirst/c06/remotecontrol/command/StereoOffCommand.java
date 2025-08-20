package headfirst.c06.remotecontrol.command;

import headfirst.c06.remotecontrol.device.Stereo;

/**
 * @author Wusd
 * @date 2025/8/20
 * @description
 */
public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.off();
        stereo.state();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.state();
    }
}
