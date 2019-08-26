package java_patterns.factory_method;

import java_patterns.factory_method.creator.ChicagoPizzaCreator;
import java_patterns.factory_method.creator.CreatorPizza;
import java_patterns.factory_method.creator.NYPizzaCreator;

/**
 * Client
 */
public class MainOfFactoryMethod {
    public static void main(String[] args) {
        CreatorPizza creator = new NYPizzaCreator();
        creator.orderPizza("cheese");

        System.out.println("-------------");

        creator = new ChicagoPizzaCreator();
        creator.orderPizza("cheese");
    }
}
