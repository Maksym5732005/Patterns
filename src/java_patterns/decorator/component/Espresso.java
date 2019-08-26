package java_patterns.decorator.component;

import java_patterns.decorator.BeverageComponent;
/**
 * Классы, играющие эту роль, обеспечивают основную
 * функциональность, которая расширяется благодаря шаблону
 * CondimentDecorator.
 */
public class Espresso extends BeverageComponent {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
