package java_patterns.factory.ex.one;

import java_patterns.factory.ex.one.ingredient_tree.cheese.Cheese;
import java_patterns.factory.ex.one.ingredient_tree.clams.Clams;
import java_patterns.factory.ex.one.ingredient_tree.dough.Dough;
import java_patterns.factory.ex.one.ingredient_tree.pepperoni.Pepperoni;
import java_patterns.factory.ex.one.ingredient_tree.sauce.Sauce;
import java_patterns.factory.ex.one.ingredient_tree.veggie.Veggies;

/**
 * main Factory interface
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();
}
