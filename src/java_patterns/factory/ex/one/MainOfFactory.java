package java_patterns.factory.ex.one;

import java_patterns.factory.ex.one.ny.NYPizzaStore;

public class MainOfFactory {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");

    }
}
