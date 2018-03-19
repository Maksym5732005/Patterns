package factory.ex.one.ny;

import factory.ex.one.PizzaIngredientFactory;
import factory.ex.one.PizzaStore;
import factory.ex.one.pizza.CheesePizza;
import factory.ex.one.pizza.ClamPizza;
import factory.ex.one.pizza.Pizza;
import factory.ex.one.pizza.VeggiePizza;

/**
 * Client.
 * factory method that uses a Factory pattern
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
