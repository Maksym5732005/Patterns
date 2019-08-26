package java_patterns.factory.ex.one.ny;

import java_patterns.factory.ex.one.PizzaIngredientFactory;
import java_patterns.factory.ex.one.ingredient_tree.cheese.Cheese;
import java_patterns.factory.ex.one.ingredient_tree.cheese.ReggianoCheese;
import java_patterns.factory.ex.one.ingredient_tree.clams.Clams;
import java_patterns.factory.ex.one.ingredient_tree.clams.FreshClams;
import java_patterns.factory.ex.one.ingredient_tree.dough.Dough;
import java_patterns.factory.ex.one.ingredient_tree.dough.ThinCrustDough;
import java_patterns.factory.ex.one.ingredient_tree.pepperoni.Pepperoni;
import java_patterns.factory.ex.one.ingredient_tree.pepperoni.SlicedPepperoni;
import java_patterns.factory.ex.one.ingredient_tree.sauce.MarinaraSauce;
import java_patterns.factory.ex.one.ingredient_tree.sauce.Sauce;
import java_patterns.factory.ex.one.ingredient_tree.veggie.Garlic;
import java_patterns.factory.ex.one.ingredient_tree.veggie.Mushroom;
import java_patterns.factory.ex.one.ingredient_tree.veggie.Onion;
import java_patterns.factory.ex.one.ingredient_tree.veggie.Veggies;

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
