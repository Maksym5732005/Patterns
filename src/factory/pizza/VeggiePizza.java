package factory.pizza;

import factory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
    private final PizzaIngredientFactory mIngredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
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
