package headfirst.c06.simplecontrol;

import headfirst.c06.simplecontrol.command.Command;

/**
 * @author Wusd
 * @date 2025/8/20
 * @description
 * 这个遥控器,只有一个按钮和一个插槽
 *  遥控器: 插槽插东西,对应的就有相应的命令
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }
    public void setCommand(Command command) {
        slot = command;
    }
    public void buttonWasPressed() {
        slot.execute();
    }
}
