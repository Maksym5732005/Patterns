package factory.pizza;

import factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory mIngredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        mIngredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = mIngredientFactory.createDough();
        sauce = mIngredientFactory.createSauce();
        cheese = mIngredientFactory.createCheese();
    }
}
