package strategy.behavior.quack;

/**
 * ConcreteStrategy
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
