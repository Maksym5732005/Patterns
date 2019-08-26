package java_patterns.strategy.model;

import java_patterns.strategy.behavior.fly.FlyNoWay;
import java_patterns.strategy.behavior.quack.Quack;

/**
 * StrategyClient
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        mFlyBehavior = new FlyNoWay();
        mQuackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
