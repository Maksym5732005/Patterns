package command.receiver.light;

import command.Command;

/**
 * ConcreteCommand
 */
public class LightOnCommand implements Command {
    private Light mLight;

    public LightOnCommand(Light light) {
        mLight = light;
    }

    @Override
    public void execute() {
        mLight.on();
    }
}
