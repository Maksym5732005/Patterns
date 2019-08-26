package java_patterns.command.receiver.stereo;

import java_patterns.command.Command;

/**
 * ConcreteCommand
 */
public class StereoOnCommand implements Command {
    private Stereo mStereo;

    public StereoOnCommand(Stereo stereo) {
        mStereo = stereo;
    }

    @Override
    public void execute() {
        mStereo.on();
        mStereo.play();
    }

    @Override
    public void undo() {
        mStereo.stop();
    }
}
