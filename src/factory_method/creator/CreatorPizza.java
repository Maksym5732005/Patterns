package factory_method.creator;

import factory_method.product.ProductPizza;

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
