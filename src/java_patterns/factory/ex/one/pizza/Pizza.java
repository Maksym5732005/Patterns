package java_patterns.factory.ex.one.pizza;

import java_patterns.factory.ex.one.ingredient_tree.cheese.Cheese;
import java_patterns.factory.ex.one.ingredient_tree.clams.Clams;
import java_patterns.factory.ex.one.ingredient_tree.dough.Dough;
import java_patterns.factory.ex.one.ingredient_tree.pepperoni.Pepperoni;
import java_patterns.factory.ex.one.ingredient_tree.sauce.Sauce;
import java_patterns.factory.ex.one.ingredient_tree.veggie.Veggies;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
