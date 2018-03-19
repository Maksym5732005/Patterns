package factory_method.product;

/**
 * ConcreteProduct
 */
public class NYCheeseProductPizza extends ProductPizza {
    public NYCheeseProductPizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
