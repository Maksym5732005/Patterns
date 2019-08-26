package java_patterns.facade;

import java_patterns.facade.model.*;

/**
 * Client
 */
public class MainOfFacade {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade =
                new HomeTheaterFacade(
                        new Amplifier(),
                        new PopcornPopper(),
                        new Projector(),
                        new Screen(),
                        new TheaterLight());

        homeTheaterFacade.watchMovie("Bruce Lee");
    }
}
