package command.receiver.stereo;

/**
 * Receiver
 */
public class Stereo {
    private boolean mIsPlaying;

    public void on() {
        System.out.println("Stereo is On");
    }

    public void play() {
        mIsPlaying = true;
        System.out.println("Stereo is playing music");
    }

    public void stop() {
        mIsPlaying = false;
        System.out.println("Stereo stops playing music");
    }

    public void off() {
        System.out.println("Stereo is Off");
    }

    public boolean isPlaying() {
        return mIsPlaying;
    }
}
