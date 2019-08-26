package java_patterns.factory_method.creator;

import java_patterns.factory_method.product.ChicagoCheeseProductPizza;
import java_patterns.factory_method.product.ProductPizza;

/**
 * ConcreteCreator
 */
public class ChicagoPizzaCreator extends CreatorPizza {
    @Override
    protected ProductPizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoCheeseProductPizza();
        } else if (type.equals("Veggie")) {
            throw new IllegalArgumentException("This type not ready");
        } else {
            throw new IllegalArgumentException("Unknown pizza type");
        }
    }
}
