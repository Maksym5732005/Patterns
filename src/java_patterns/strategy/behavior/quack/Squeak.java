package java_patterns.strategy.behavior.quack;

/**
 * ConcreteStrategy
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
