package factory_method;

import factory_method.creator.ChicagoPizzaCreator;
import factory_method.creator.CreatorPizza;
import factory_method.creator.NYPizzaCreator;

public class MainOfFactoryMethod {
    public static void main(String[] args) {
        CreatorPizza creator = new NYPizzaCreator();
        creator.orderPizza("cheese");

        System.out.println("-------------");

        creator = new ChicagoPizzaCreator();
        creator.orderPizza("cheese");
    }
}
