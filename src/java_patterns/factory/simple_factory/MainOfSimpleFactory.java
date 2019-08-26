package java_patterns.factory.simple_factory;

public class MainOfSimpleFactory {
    /**
     * Simple Factory не является полноценным паттерном
     */
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        store.orderPizza("cheese");
    }
}
