package java_patterns.decorator;

import java_patterns.decorator.component.DarkRoast;
import java_patterns.decorator.component.Espresso;
import java_patterns.decorator.component.HouseBlend;
import java_patterns.decorator.decorators.Mocha;
import java_patterns.decorator.decorators.Soy;
import java_patterns.decorator.decorators.Whip;

public class MainOfDecorator {
    public static void main(String[] args) {
        System.out.println("\n");
        BeverageComponent beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        BeverageComponent beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());

        BeverageComponent beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}
