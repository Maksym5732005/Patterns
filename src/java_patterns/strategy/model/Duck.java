package java_patterns.strategy.model;

import java_patterns.strategy.behavior.fly.FlyBehavior;
import java_patterns.strategy.behavior.quack.QuackBehavior;

/**
 * StrategyClient
 */
public abstract class Duck {
    FlyBehavior mFlyBehavior;
    QuackBehavior mQuackBehavior;

    public abstract void display();

    public void performFly() {
        mFlyBehavior.fly();
    }

    public void performQuack() {
        mQuackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        mFlyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        mQuackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
