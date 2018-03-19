package factory.ex.one;

import factory.ex.one.ny.NYPizzaStore;

public class MainOfFactory {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");

    }
}
