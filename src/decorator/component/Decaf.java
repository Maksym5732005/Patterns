package decorator.component;

import decorator.BeverageComponent;
/**
 * Классы, играющие эту роль, обеспечивают основную
 * функциональность, которая расширяется благодаря шаблону
 * CondimentDecorator.
 */
public class Decaf extends BeverageComponent {

    public Decaf() {
        description = "Coffee without caffeine";
    }

    @Override
    public double cost() {
        return 0.5;
    }
}
