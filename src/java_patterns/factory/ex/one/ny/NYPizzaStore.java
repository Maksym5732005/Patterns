package java_patterns.factory.ex.one.ny;

import java_patterns.factory.ex.one.PizzaIngredientFactory;
import java_patterns.factory.ex.one.PizzaStore;
import java_patterns.factory.ex.one.pizza.CheesePizza;
import java_patterns.factory.ex.one.pizza.ClamPizza;
import java_patterns.factory.ex.one.pizza.Pizza;
import java_patterns.factory.ex.one.pizza.VeggiePizza;

/**
 * Client.
 * java_patterns.factory method that uses a Factory pattern
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory nyIngredientFactory =
                new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(nyIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(nyIngredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(nyIngredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else {
            throw new IllegalArgumentException("unknown pizza type");
        }

        return pizza;
    }
}
