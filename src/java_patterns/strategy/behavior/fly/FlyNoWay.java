package java_patterns.strategy.behavior.fly;

/**
 * ConcreteStrategy
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
