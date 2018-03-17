package command;

import command.receiver.light.Light;
import command.receiver.light.LightOffCommand;
import command.receiver.light.LightOnCommand;

/**
 * Client
 */
public class MainOfCommand {
    public static void main(String[] args) {
        // 1. Create an Invoker
        RemoteControl remoteControl = new RemoteControl();
        // придумываем назначение кропкам
        setRemoteButtonsFunctions(remoteControl);


        // нажимает кнопку On в 1м ряду, затем Off
        remoteControl.buttonOnPressed(1);
        remoteControl.buttonOffPressed(1);
    }

    private static void setRemoteButtonsFunctions(RemoteControl remoteControl) {
        // 2. Create a Receiver
        Light light = new Light();
        // 3. Create a ConcreteCommands
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        // 4. assign commands to Invoker
        remoteControl.setCommand(1,lightOn, lightOff);
    }
}
