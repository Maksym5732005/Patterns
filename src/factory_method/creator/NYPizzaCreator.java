package factory_method.creator;


import factory_method.product.NYCheeseProductPizza;
import factory_method.product.ProductPizza;

/**
 * ConcreteCreator of ConcreteFactory that implements the factory method
 */
public class NYPizzaCreator extends CreatorPizza {

    @Override
    protected ProductPizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYCheeseProductPizza();
        } else if (type.equals("Veggie")) {
            throw new IllegalArgumentException("This type not ready");
        } else {
            throw new IllegalArgumentException("Unknown pizza type");
        }
    }
}
