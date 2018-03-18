package command;

import command.receiver.light.Light;
import command.receiver.light.LightOffCommand;
import command.receiver.light.LightOnCommand;
import command.receiver.stereo.Stereo;
import command.receiver.stereo.StereoOffCommand;
import command.receiver.stereo.StereoOnCommand;

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
        System.out.println("---------");
        // нажимает кнопку On во 2м ряду, затем Off
        remoteControl.buttonOnPressed(2);
        remoteControl.undoButtonPressed();
        remoteControl.buttonOffPressed(2);

        // Extension part
        extension();
    }


    private static void setRemoteButtonsFunctions(RemoteControl remoteControl) {
        // 2. Create a Receiver
        Light light = new Light();
        // 3. Create a ConcreteCommands
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        // 4. assign commands to Invoker
        remoteControl.setCommand(1,lightOn, lightOff);

        // steps 2. 3. 4. for new Receiver
        Stereo stereo = new Stereo();
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        remoteControl.setCommand(2, stereoOn, stereoOff);
    }

    private static void extension() {
        System.out.println("------------------------------------");
        System.out.println("     MacroCommand extension part");
        System.out.println("------------------------------------");
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        Stereo stereo = new Stereo();
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        Command[] macrosOn = {lightOn, stereoOn};
        Command[] macrosOff = {stereoOff, lightOff};

        MacroCommand commandOn = new MacroCommand(macrosOn);
        MacroCommand commandOff = new MacroCommand(macrosOff);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(3, commandOn, commandOff);
        System.out.println("-On-");
        remoteControl.buttonOnPressed(3);
        System.out.println("-Off-");
        remoteControl.buttonOffPressed(3);
    }
}
