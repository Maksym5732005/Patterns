package java_patterns.facade;

import java_patterns.facade.model.*;

/**
 * Facade
 */
public class HomeTheaterFacade {
    private final Amplifier amp;
    private final PopcornPopper popper;
    private final Projector projector;
    private final Screen screen;
    private final TheaterLight light;

    HomeTheaterFacade(Amplifier amp,
                             PopcornPopper popper,
                             Projector projector,
                             Screen screen,
                             TheaterLight light) {
        this.amp = amp;
        this.popper = popper;
        this.projector = projector;
        this.screen = screen;
        this.light = light;
    }

    void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        light.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(movie);
        amp.setSurroundSound();
        amp.setVolume(5);
    }
}
