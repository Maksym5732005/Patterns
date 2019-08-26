package java_patterns.strategy.behavior.fly;

/**
 * ConcreteStrategy
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with rocket!");
    }
}
