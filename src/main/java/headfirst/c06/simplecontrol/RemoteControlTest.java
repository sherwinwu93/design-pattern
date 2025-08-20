package headfirst.c06.simplecontrol;

import headfirst.c06.simplecontrol.command.GarageDoorOpenCommand;
import headfirst.c06.simplecontrol.device.GarageDoor;

/**
 * @author Wusd
 * @date 2025/8/20
 * @description
 */
public class RemoteControlTest {
    public static void main(String[] args) {
//        SimpleRemoteControl remote = new SimpleRemoteControl();
//        Light light = new Light();
//        LightOnCommand lightOn = new LightOnCommand(light);
//
//        remote.setCommand(lightOn);
//        remote.buttonWasPressed();

        SimpleRemoteControl remote2 = new SimpleRemoteControl();
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

        remote2.setCommand(garageDoorOpen);
        remote2.buttonWasPressed();
    }
}
