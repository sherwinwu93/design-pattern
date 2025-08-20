package headfirst.c06.remotecontrol.command;

import headfirst.c06.remotecontrol.device.Stereo;

/**
 * @author Wusd
 * @date 2025/8/20
 * @description
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;
    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD("Jay Chou");
        stereo.setVolume(11);
    }
}
