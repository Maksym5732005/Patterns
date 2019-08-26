package java_patterns.factory.simple_factory;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else {
            throw new IllegalArgumentException("unknown pizza type");
        }

        return pizza;
    }
}
