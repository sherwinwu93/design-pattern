package headfirst.c06.remotecontrol.command;

/**
 * @author Wusd
 * @date 2025/8/20
 * @description
 */
public class NoCommand implements Command{
    private static NoCommand uniqueInstance = new NoCommand();
    private NoCommand() {
    }
    public static NoCommand getInstance() {
        return uniqueInstance;
    }

    @Override
    public void execute() {
        System.out.println("Nothing happens!");
    }
}
