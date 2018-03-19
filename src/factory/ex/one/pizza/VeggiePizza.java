package factory.ex.one.pizza;

import factory.ex.one.PizzaIngredientFactory;

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