package factory.ex.one.chicago;

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
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else {
            throw new IllegalArgumentException("unknown pizza type");
        }

        return pizza;
    }
}
