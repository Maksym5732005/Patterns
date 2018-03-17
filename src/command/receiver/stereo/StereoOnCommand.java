package command.receiver.stereo;

import command.Command;

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
