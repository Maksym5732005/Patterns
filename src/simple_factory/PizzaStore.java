package simple_factory;

public class PizzaStore {
    SimplePizzaFactory mFactory;

    public PizzaStore(SimplePizzaFactory factory) {
        mFactory = factory;
    }

    Pizza orderPizza(String type) {
        Pizza pizza = mFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
