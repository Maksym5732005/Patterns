package java_patterns.strategy.model;

import java_patterns.strategy.behavior.fly.FlyWithWings;
import java_patterns.strategy.behavior.quack.Quack;

/**
 * StrategyClient
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        mFlyBehavior = new FlyWithWings();
        mQuackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
