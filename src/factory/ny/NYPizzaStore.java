package factory.ny;


import factory.PizzaIngredientFactory;
import factory.PizzaStore;
import factory.pizza.CheesePizza;
import factory.pizza.ClamPizza;
import factory.pizza.Pizza;
import factory.pizza.VeggiePizza;

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
