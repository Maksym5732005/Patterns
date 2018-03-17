package decorator.decorators;

import decorator.BeverageComponent;

public class Whip extends CondimentDecorator{
    BeverageComponent mBeverage;

    public Whip(BeverageComponent beverage) {
        mBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return mBeverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return mBeverage.cost() + 0.15;
    }
}
