package java_patterns.factory.ex.one;

import java_patterns.factory.ex.one.pizza.Pizza;

/**
 * Client's interface
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String item);
}
