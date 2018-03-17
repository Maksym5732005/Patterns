package command.receiver.stereo;

import command.Command;

public class StereoOffCommand implements Command{
    private Stereo mStereo;

    public StereoOffCommand(Stereo stereo) {
        mStereo = stereo;
    }

    @Override
    public void execute() {
        mStereo.stop();
        mStereo.off();
    }

    @Override
    public void undo() {
        mStereo.on();
    }
}
