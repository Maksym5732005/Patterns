package factory.ex.one;

import factory.ex.one.ingredient_tree.cheese.Cheese;
import factory.ex.one.ingredient_tree.clams.Clams;
import factory.ex.one.ingredient_tree.dough.Dough;
import factory.ex.one.ingredient_tree.pepperoni.Pepperoni;
import factory.ex.one.ingredient_tree.sauce.Sauce;
import factory.ex.one.ingredient_tree.veggie.Veggies;

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
