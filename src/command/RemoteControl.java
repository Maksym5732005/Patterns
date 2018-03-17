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
 * --------------------------
 * |        | Undo |        |
 * --------------------------
 */

/**
 * Invoker
 */
public class RemoteControl {
    private static final int sButtonsCount = 7;
    private final Command[] mButtonsOn;
    private final Command[] mButtonsOff;
    private Command mUndoCommand;

    RemoteControl() {
        // Create 7 buttons with NoCommands (it replaces a null)
        mButtonsOn = new Command[sButtonsCount];
        mButtonsOff = new Command[sButtonsCount];

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < sButtonsCount; i++) {
            mButtonsOn[i] = mButtonsOff[i] = noCommand;
        }
        mUndoCommand = noCommand;
    }

    public void setCommand(int buttonNumber,
                           Command on,
                           Command off) {
        mButtonsOn[buttonNumber] = on;
        mButtonsOff[buttonNumber] = off;
    }

    public void buttonOnPressed(int buttonNumber) {
        mButtonsOn[buttonNumber].execute();
        mUndoCommand = mButtonsOn[buttonNumber];
    }

    public void buttonOffPressed(int buttonNumber) {
        mButtonsOff[buttonNumber].execute();
        mUndoCommand = mButtonsOff[buttonNumber];
    }

    public void undoButtonPressed() {
        System.out.print("Undo pressed: ");
        mUndoCommand.undo();
    }
}
