package java_patterns.decorator.decorators;

import java_patterns.decorator.BeverageComponent;

public class Mocha extends CondimentDecorator {
    BeverageComponent mBeverage;

    public Mocha(BeverageComponent beverage) {
        mBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return mBeverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + mBeverage.cost();
    }
}
