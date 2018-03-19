package factory.ex.one.ny;

import factory.ex.one.ingredient_tree.cheese.ReggianoCheese;
import factory.ex.one.ingredient_tree.clams.FreshClams;
import factory.ex.one.ingredient_tree.pepperoni.SlicedPepperoni;
import factory.ex.one.ingredient_tree.sauce.MarinaraSauce;
import factory.ex.one.ingredient_tree.veggie.Garlic;
import factory.ex.one.ingredient_tree.veggie.Mushroom;
import factory.ex.one.ingredient_tree.veggie.Onion;
import factory.ex.one.PizzaIngredientFactory;
import factory.ex.one.ingredient_tree.cheese.Cheese;
import factory.ex.one.ingredient_tree.clams.Clams;
import factory.ex.one.ingredient_tree.dough.Dough;
import factory.ex.one.ingredient_tree.dough.ThinCrustDough;
import factory.ex.one.ingredient_tree.pepperoni.Pepperoni;
import factory.ex.one.ingredient_tree.sauce.Sauce;
import factory.ex.one.ingredient_tree.veggie.Veggies;

/**
 * ConcreteFactory
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
