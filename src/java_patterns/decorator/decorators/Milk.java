package java_patterns.decorator.decorators;

import java_patterns.decorator.BeverageComponent;

public class Milk extends CondimentDecorator {
    BeverageComponent mBeverage;

    public Milk(BeverageComponent beverage) {
        mBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return mBeverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return mBeverage.cost() + 1;
    }
}
