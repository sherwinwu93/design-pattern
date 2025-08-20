package headfirst.c06.remotecontrol;

import headfirst.c06.remotecontrol.device.Light;

/**
 * @author Wusd
 * @date 2025/8/20
 * @description
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
    }
}
