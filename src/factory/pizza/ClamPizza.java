package factory.pizza;

import factory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
    PizzaIngredientFactory mIngredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
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
