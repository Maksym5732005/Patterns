package java_patterns.decorator.decorators;

import java_patterns.decorator.BeverageComponent;

public class Soy extends CondimentDecorator {
    BeverageComponent mBeverage;

    public Soy(BeverageComponent beverage) {
        mBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return mBeverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return mBeverage.cost() + 0.1;
    }
}
