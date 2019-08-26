package java_patterns.strategy;

import java_patterns.strategy.behavior.fly.FlyRocketPowered;
import java_patterns.strategy.model.Duck;
import java_patterns.strategy.model.MallardDuck;
import java_patterns.strategy.model.ModelDuck;

public class MainOfStrategy {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
