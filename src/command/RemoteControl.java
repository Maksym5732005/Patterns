package command;

/*
 *      Remote control
 * --------------------------
 * | Room Light  | On | Off |
 * --------------------------
 * | Garage Door | On | Off |
 * --------------------------
 * \/\/\/\/\/\/\/\/\/\/\/\/\/
 *
 * /\/\/\/\/\/\/\/\/\/\/\/\/\
 * |                        |
 * --------------------------
 */

/**
 * Invoker
 */
public class RemoteControl {
    private static final int sButtonsCount = 7;
    private final Command[] mButtonsOn;
    private final Command[] mButtonsOff;

    RemoteControl() {
        // Create 7 buttons with NoCommands (it replaces a null)
        mButtonsOn = new Command[sButtonsCount];
        mButtonsOff = new Command[sButtonsCount];
        for (int i = 0; i < sButtonsCount; i++) {
            NoCommand noCommand = new NoCommand();
            mButtonsOn[i] = mButtonsOff[i] = noCommand;
        }
    }

    public void setCommand(int buttonNumber,
                           Command on,
                           Command off) {
        if (buttonNumber >= 0 && buttonNumber < sButtonsCount) {
            mButtonsOn[buttonNumber] = on;
            mButtonsOff[buttonNumber] = off;
        }
    }

    public void buttonOnPressed(int buttonNumber) {
        if (buttonNumber >= 0 && buttonNumber < sButtonsCount) {
            mButtonsOn[buttonNumber].execute();
        }
    }

    public void buttonOffPressed(int buttonNumber) {
        if (buttonNumber >= 0 && buttonNumber < sButtonsCount) {
            mButtonsOff[buttonNumber].execute();
        }
    }
}
