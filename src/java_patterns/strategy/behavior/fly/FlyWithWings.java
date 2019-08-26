package java_patterns.strategy.behavior.fly;

/**
 * ConcreteStrategy
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
