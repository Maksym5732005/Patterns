package decorator.component;

import decorator.BeverageComponent;
/**
 * Классы, играющие эту роль, обеспечивают основную
 * функциональность, которая расширяется благодаря шаблону
 * CondimentDecorator.
 */
public class DarkRoast extends BeverageComponent {

    public DarkRoast() {
        description = "Dark Coffee";
    }

    @Override
    public double cost() {
        return 0.7;
    }
}
