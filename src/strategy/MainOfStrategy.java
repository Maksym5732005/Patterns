package strategy;

import strategy.behavior.fly.FlyRocketPowered;
import strategy.model.Duck;
import strategy.model.MallardDuck;
import strategy.model.ModelDuck;

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
