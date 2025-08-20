package headfirst.c06.remotecontrol.command;

public interface Command {
    void execute();

    void undo();
}
