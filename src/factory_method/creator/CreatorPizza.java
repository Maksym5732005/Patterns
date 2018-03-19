package factory_method.creator;

import factory_method.product.ProductPizza;

/**
 * Creator of Factory that has a factory method.
 */
public abstract class CreatorPizza {

    public ProductPizza orderPizza(String type) {
        ProductPizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract ProductPizza createPizza(String type);
}
