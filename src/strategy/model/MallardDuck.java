package strategy.model;

import strategy.behavior.fly.FlyWithWings;
import strategy.behavior.quack.Quack;

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
