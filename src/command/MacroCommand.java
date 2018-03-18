package command;

/**
 * Extension for Command interface.
 * executes an array of commands;
 */
public class MacroCommand implements Command {
    Command [] mCommands;

    public MacroCommand(Command[] commands) {
        mCommands = commands;
    }

    @Override
    public void execute() {
        for (Command command : mCommands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : mCommands) {
            command.undo();
        }
    }
}
