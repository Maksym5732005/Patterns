package java_patterns.decorator.component;

import java_patterns.decorator.BeverageComponent;

/**
 * Классы, играющие эту роль, обеспечивают основную
 * функциональность, которая расширяется благодаря шаблону
 * CondimentDecorator.
 */
public class HouseBlend extends BeverageComponent {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
