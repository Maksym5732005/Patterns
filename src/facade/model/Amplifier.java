package facade.model;
// усилитель
public class Amplifier {
    public void on() {
        System.out.println("Amplifier is on...");
    }

    public void setDvd(String dvd) {
        System.out.println("Amplifier: set dvd \"" + dvd + "\"...");
    }

    public void setSurroundSound() {
        System.out.println("Amplifier: sound 5.1 activated...");
    }

    public void setVolume(int volume) {
        System.out.println("Amplifier: volume sets to " + volume + "...");
    }
}
